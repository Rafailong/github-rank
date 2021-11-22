package me.rafa.githubrank.githubrank

import me.rafa.githubrank.Error
import me.rafa.githubrank.model.Contributor
import zio._

trait GitHubRank {

  def orgContributors(org: String): IO[Error, Set[Contributor]]
}

object GitHubRank {

  def orgContributors(org: String): ZIO[Has[GitHubRank], Error, Set[Contributor]] =
    ZIO.serviceWith[GitHubRank](_.orgContributors(org))
}
