package me.rafa.githubrank

import me.rafa.githubrank.caching.ZCaching
import me.rafa.githubrank.gitHubClient.GitHubClient
import me.rafa.githubrank.logging.annotations.organization
import me.rafa.githubrank.model.Contributor
import me.rafa.githubrank.model.PagingControls.PagingDirection
import zio._
import zio.logging.{Logger, Logging}

import scala.collection.immutable.SortedSet

object gitHubRank {

  type GitHubRank = Has[GitHubRank.Service]

  object GitHubRank {

    trait Service {

      def orgContributors(org: String): IO[GitHunRankError, Set[Contributor]]
    }

    val live: RLayer[ZCaching with GitHubClient with Logging, GitHubRank] = {
      for {
        logger       <- ZIO.service[Logger[String]]
        githubClient <- ZIO.service[GitHubClient.Service]
        zCache       <- ZIO.service[ZCaching.Service]
      } yield new Service {

        def fetchMembers(
          org: String,
          pagingDirection: Option[PagingDirection]
        ): IO[GitHunRankError, Set[Contributor]] = {
          for {
            page <- githubClient.organizationContributors(org, pagingDirection)
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
                logger.info(s"Result loaded from cache: '$org'") >>>
                  IO.succeed(cached)
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
    }.toLayer

    def orgContributors(org: String): ZIO[GitHubRank, GitHunRankError, Set[Contributor]] =
      ZIO.accessM[GitHubRank](_.get.orgContributors(org))
  }
}
