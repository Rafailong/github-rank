package me.rafa.githubrank.cli

import com.typesafe.config.{Config, ConfigFactory}
import io.circe.syntax._
import me.rafa.githubrank._
import me.rafa.githubrank.caching.ZCacheCaffeine
import me.rafa.githubrank.githubclient.GitHubGraphClient
import me.rafa.githubrank.githubrank.{GitHubRank, GitHubRankLive}
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

    val org = "tensorflow"

    val program: ZIO[Console with Has[GitHubRank], GitHunRankError, Unit] = {
      GitHubRank.orgContributors(org).flatMap { contributors =>
        ZIO.foreach_[Console, GitHunRankError, Contributor](contributors) { c =>
          putStrLn(c.asJson.noSpaces)
            .mapError(GitHunRankError.UnexpectedError(_))
        }
      }
    }

    program
      .inject(
        Console.live,
        Slf4jLogger.makeWithAnnotationsAsMdc(List(organization)),
        ZCacheCaffeine.live,
        GitHubGraphClient.live,
        GitHubRankLive.live,
        config,
        sttpBackend
      )
      .exitCode
  }
}
