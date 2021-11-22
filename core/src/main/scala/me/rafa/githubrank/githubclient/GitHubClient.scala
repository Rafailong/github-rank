package me.rafa.githubrank.githubclient

import me.rafa.githubrank.GitHunRankError
import me.rafa.githubrank.model.Contributors
import me.rafa.githubrank.model.PagingControls.PagingDirection
import zio._

trait GitHubClient {

  def organizationContributors(
    org: String,
    pagingDirection: Option[PagingDirection],
    take: Int = 50
  ): IO[GitHunRankError, Contributors]
}

object GitHubClient {

  def organizationContributors(
    org: String,
    pagingDirection: Option[PagingDirection],
    take: Int = 50
  ): ZIO[Has[GitHubClient], GitHunRankError, Contributors] =
    ZIO.serviceWith[GitHubClient](_.organizationContributors(org, pagingDirection, take))
}
