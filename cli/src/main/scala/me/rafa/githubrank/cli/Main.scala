package me.rafa.githubrank.cli

import com.typesafe.config.{Config, ConfigFactory}
import io.circe.syntax._
import me.rafa.githubrank._
import me.rafa.githubrank.gitHubRank.GitHubRank
import me.rafa.githubrank.gitHubRank.GitHubRank._
import me.rafa.githubrank.model._
import me.rafa.githubrank.logging.annotations._
import sttp.client3.FollowRedirectsBackend
import sttp.client3.asynchttpclient.zio.AsyncHttpClientZioBackend
import zio._
import zio.magic._
import zio.console._
import zio.logging.slf4j.Slf4jLogger

object Main extends App {

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {

    val config: TaskLayer[Has[Config]] = ZLayer.fromEffect(ZIO.effect(ConfigFactory.load()))

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

    val org = "ScalaConsultants"

    val program: ZIO[Console with GitHubRank, GitHunRankError, Unit] = {
      organizationContributors(org)
        .flatMap { contributors =>
          ZIO.foreachPar_[Console, GitHunRankError, Contributor](contributors.elem) { c =>
            putStrLn(c.asJson.noSpaces)
              .mapError(GitHunRankError.UnexpectedError(_))
          }
        }
    }

    program
      .inject(
        Console.live,
        Slf4jLogger.makeWithAnnotationsAsMdc(List(organization)),
        GitHubRank.live,
        config,
        sttpBackend
      )
      .exitCode
  }
}
