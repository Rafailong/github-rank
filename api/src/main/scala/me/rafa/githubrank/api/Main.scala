package me.rafa.githubrank.api

import com.typesafe.config.{Config, ConfigFactory}
import me.rafa.githubrank.ZioSttpBackend
import me.rafa.githubrank.gitHubClient.GitHubClient
import me.rafa.githubrank.logging.annotations.organization
import org.http4s.server.Router
import org.http4s.blaze.server.BlazeServerBuilder
import sttp.client3.FollowRedirectsBackend
import sttp.client3.asynchttpclient.zio.AsyncHttpClientZioBackend
import zio._
import zio.clock.Clock
import zio.blocking.Blocking
import zio.interop.catz._
import zio.logging.Logging
import zio.logging.slf4j.Slf4jLogger
import zio.magic._

object Main extends App {

  val logging: ULayer[Logging]       = Slf4jLogger.makeWithAnnotationsAsMdc(List(organization))
  val config: TaskLayer[Has[Config]] = ZIO.effect(ConfigFactory.load()).toLayer

  val sttpBackend: TaskLayer[Has[ZioSttpBackend]] = ZLayer.fromManaged(
    AsyncHttpClientZioBackend
      .managed()
      .map(be =>
        new FollowRedirectsBackend(
          delegate = be,
          // We need to disable `sensitiveHeaders` or else the `Authorization` header will be stripped.
          sensitiveHeaders = Set.empty
        )
      )
  )

  // Starting the server
  val serve: ZIO[ZEnv with GitHubClient, Throwable, Unit] = {
    ZIO.service[GitHubClient.Service].flatMap { githubRank =>
      import cats.syntax.all._

      val routes = RedocRoute() <+> OrganizationContributorsEndpoint.route(githubRank)

      ZIO.runtime[ZEnv].flatMap { implicit runtime => // This is needed to derive cats-effect instances for that are needed by http4s
        BlazeServerBuilder[RIO[Clock with Blocking, *]]
          .withExecutionContext(runtime.platform.executor.asEC)
          .bindHttp(port = 8080, host = "localhost")
          .withHttpApp(Router("/" -> routes).orNotFound)
          .serve
          .compile
          .drain
      }
    }
  }

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    serve
      .inject(
        zio.ZEnv.live,
        logging,
        config,
        sttpBackend,
        GitHubClient.live
      )
      .exitCode
  }

}
