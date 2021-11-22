package me.rafa.githubrank.githubclient

import com.typesafe.config.Config
import me.rafa.githubrank.{Error, ZioSttpBackend}
import me.rafa.githubrank.logging.annotations._
import me.rafa.githubrank.model.{Contributors, PagingControls}
import me.rafa.githubrank.githubclient.graphqueries.organizationQueries
import pureconfig.error.ConfigReaderException
import zio._
import zio.logging.Logger

case class GitHubGraphClient(
  gitHubClientConfiguration: GitHubClientConfiguration,
  sttpBackend: ZioSttpBackend,
  logger: Logger[String]
) extends GitHubClient {

  override def organizationContributors(
    org: String,
    pagingDirection: Option[PagingControls.PagingDirection],
    take: Int
  ): IO[Error, Contributors] = {

    val request = organizationQueries
      .contributors(org, pagingDirection, take)
      .toRequest(gitHubClientConfiguration.gitHubGraphqlUri)
      .header("Authorization", s"bearer ${gitHubClientConfiguration.gitHubAuthToken}")

    for {
      _ <- logger.locally(_.annotate(organization, org))(
        logger.info(s"Request: [${request.show()}]")
      )
      response <- request
        .send(sttpBackend)
        .mapError(
          Error
            .FatalServerCommunicationError(gitHubClientConfiguration.gitHubGraphqlUri, _)
        )
      result <- response.body match {
        case Right(contributors) => ZIO.succeed(contributors)
        case Left(calibanClientError) =>
          ZIO.fail(
            Error.FatalServerCommunicationError(
              gitHubClientConfiguration.gitHubGraphqlUri,
              calibanClientError
            )
          )
      }
    } yield result
  }.tapError(err => logger.error(s"Request failed with: ${err.message}"))

}

object GitHubGraphClient {

  val live
    : RLayer[Has[ZioSttpBackend] with Has[Logger[String]] with Has[Config], Has[GitHubClient]] = {
    for {
      config      <- ZIO.service[Config]
      logger      <- ZIO.service[Logger[String]]
      sttpBackend <- ZIO.service[ZioSttpBackend]
      gitHubRankConfig <- ZIO
        .fromEither(
          GitHubClientConfiguration.loadConfig(path = "github-rank.github", config = config)
        )
        .mapError(ConfigReaderException(_))
        .orDie
    } yield GitHubGraphClient(gitHubRankConfig, sttpBackend, logger)
  }.toLayer
}
