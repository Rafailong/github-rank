package me.rafa.githubrank.githubrank

import me.rafa.githubrank.GitHunRankError
import me.rafa.githubrank.model.Contributor
import zio._

trait GitHubRank {

  def orgContributors(org: String): IO[GitHunRankError, Set[Contributor]]
}

object GitHubRank {

  def orgContributors(org: String): ZIO[Has[GitHubRank], GitHunRankError, Set[Contributor]] =
    ZIO.serviceWith[GitHubRank](_.orgContributors(org))
}
