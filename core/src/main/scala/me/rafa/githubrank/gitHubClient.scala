package me.rafa.githubrank

import com.typesafe.config.Config
import me.rafa.githubrank.config._
import me.rafa.githubrank.logging.annotations._
import me.rafa.githubrank.model.Contributors
import me.rafa.githubrank.model.PagingControls.PagingDirection
import pureconfig.error.ConfigReaderException
import zio._
import zio.logging._

object gitHubClient {

  type GitHubClient = Has[GitHubClient.Service]

  object GitHubClient {

    trait Service {

      def organizationContributors(
        org: String,
        pagingDirection: Option[PagingDirection],
        take: Int = 50
      ): IO[GitHunRankError, Contributors]
    }

    val live: RLayer[Has[ZioSttpBackend] with Logging with Has[Config], GitHubClient] = {

      for {
        sttpBackend <- ZIO.service[ZioSttpBackend]
        config      <- ZIO.service[Config]
        logger      <- ZIO.service[Logger[String]]
        gitHubRankConfig <- ZIO
          .fromEither(GitHubRankConfiguration.loadConfig("github-rank.github", config))
          .mapError(ConfigReaderException(_))
          .orDie
      } yield new Service {

        override def organizationContributors(
          org: String,
          pagingDirection: Option[PagingDirection],
          take: Int = 50
        ): IO[GitHunRankError, Contributors] = {

          val request = Queries
            .contributorsOf(org, pagingDirection, take)
            .toRequest(gitHubRankConfig.gitHubGraphqlUri)
            .header("Authorization", s"bearer ${gitHubRankConfig.gitHubAuthToken}")

          for {
            _ <- logger.locally(_.annotate(organization, org)) {
              logger.info(s"Request: [${request.show()}]")
            }
            response <- request
              .send(sttpBackend)
              .mapError(
                GitHunRankError.FatalServerCommunicationError(gitHubRankConfig.gitHubGraphqlUri, _)
              )
            result <- response.body match {
              case Right(contributors) => ZIO.succeed(contributors)
              case Left(calibanClientError) =>
                ZIO.fail(
                  GitHunRankError.FatalServerCommunicationError(gitHubRankConfig.gitHubGraphqlUri, calibanClientError)
                )
            }
          } yield result
        }.tapError(err => logger.error(s"Request failed with: ${err.message}"))
      }
    }.toLayer

    def organizationContributors(
      org: String,
      pagingDirection: Option[PagingDirection],
      take: Int = 50
    ): ZIO[GitHubClient, GitHunRankError, Contributors] =
      ZIO.accessM[GitHubClient](_.get.organizationContributors(org, pagingDirection, take))
  }
}
