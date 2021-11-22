package me.rafa.githubrank.githubrank

import me.rafa.githubrank.GitHunRankError
import me.rafa.githubrank.caching._
import me.rafa.githubrank.githubclient.GitHubClient
import me.rafa.githubrank.logging.annotations._
import me.rafa.githubrank.model.Contributor
import me.rafa.githubrank.model.PagingControls.PagingDirection
import zio._
import zio.logging.{Logger, Logging}

import scala.collection.immutable.SortedSet

case class GitHubRankLive(
  logger: Logger[String],
  gitHubClient: GitHubClient,
  zCache: ZCache
) extends GitHubRank {

  private def fetchMembers(
    org: String,
    pagingDirection: Option[PagingDirection]
  ): IO[GitHunRankError, Set[Contributor]] = {
    for {
      page <- gitHubClient.organizationContributors(org, pagingDirection)
      results <- {
        page.paging.end match {
          case Some(token) =>
            logger.locally(_.annotate(organization, org)) {
              logger.info(s"Fetching next page of contributors.") >>>
              fetchMembers(org, Some(PagingDirection.After(token))).map { contributors =>
                SortedSet.from(page.elem) ++ SortedSet.from(contributors)
              }
            }
          case None => IO.succeed(SortedSet.from(page.elem))
        }
      }
    } yield results
  }

  override def orgContributors(org: String): IO[GitHunRankError, Set[Contributor]] = {
    for {
      fromCache <- zCache.get(org)
      result <- fromCache match {
        case Some(cached) =>
          logger.info(s"Result loaded from cache: '$org'") >>> IO.succeed(cached)
        case None =>
          for {
            _            <- logger.info(s"Fetching contributors of organization: '$org'")
            contributors <- fetchMembers(org, None)
            _            <- zCache.putWithExpiration(org)(contributors)
          } yield contributors
      }
    } yield result
  }
}

object GitHubRankLive {

  val live: RLayer[Has[ZCache] with Has[GitHubClient] with Logging, Has[GitHubRank]] = {
    for {
      logger       <- ZIO.service[Logger[String]]
      githubClient <- ZIO.service[GitHubClient]
      zCache       <- ZIO.service[ZCache]
    } yield GitHubRankLive(logger, githubClient, zCache)
  }.toLayer
}
