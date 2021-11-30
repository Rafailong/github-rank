package me.rafa.githubrank

import me.rafa.githubrank.caching.ZCache
import me.rafa.githubrank.githubclient.GitHubClient
import zio.test.mock._

trait Mocks {

  @mockable[ZCache]
  object ZCacheMock

  @mockable[GitHubClient]
  object GitHubClientMock
}

object Mocks extends Mocks
