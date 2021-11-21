package me.rafa.githubrank.api

import org.http4s.server.Router
import org.http4s.blaze.server.BlazeServerBuilder
import zio._
import zio.clock.Clock
import zio.blocking.Blocking
import zio.interop.catz._

object Main extends App {

  // Starting the server
  val serve: ZIO[ZEnv, Throwable, Unit] =
    ZIO.runtime[ZEnv].flatMap { implicit runtime => // This is needed to derive cats-effect instances for that are needed by http4s
      BlazeServerBuilder[RIO[Clock with Blocking, *]]
        .withExecutionContext(runtime.platform.executor.asEC)
        .bindHttp(port = 8080, host = "localhost")
        .withHttpApp(Router("/" -> (Routes.all)).orNotFound)
        .serve
        .compile
        .drain
    }

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = serve.exitCode

}
