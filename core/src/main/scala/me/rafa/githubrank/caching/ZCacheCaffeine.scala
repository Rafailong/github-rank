package me.rafa.githubrank.caching

import com.github.benmanes.caffeine.cache.Caffeine
import com.typesafe.config.Config
import me.rafa.githubrank.GitHunRankError
import me.rafa.githubrank.GitHunRankError.UnexpectedError
import me.rafa.githubrank.model.Contributor
import pureconfig.error.ConfigReaderException
import scalacache.{Cache, Entry, Flags}
import scalacache.modes.try_._
import scalacache.caffeine.CaffeineCache
import zio._
import zio.logging.{Logger, Logging}

case class ZCacheCaffeine(cache: Cache[Set[Contributor]], config: ZCacheConfig) extends ZCache {

  override def putWithExpiration(key: String)(contributors: Set[Contributor])(implicit
    flags: Flags
  ): IO[GitHunRankError, Unit] =
    IO.fromTry(cache.put(key)(contributors, ttl = Some(config.ttl)))
      .mapError(UnexpectedError)
      .unit

  override def get(key: String)(implicit
    flags: Flags
  ): IO[GitHunRankError, Option[Set[Contributor]]] = {
    val cached = cache.get(key)
    IO.fromTry(cached).mapError(UnexpectedError)
  }
}

object ZCacheCaffeine {

  val live: RLayer[Has[Config] with Logging, Has[ZCache]] = {
    for {
      logger <- ZIO.service[Logger[String]]
      _      <- logger.info("Initializing Caffeine-backed cache")
      config <- ZIO.service[Config]
      cacheConfig <- ZIO
        .fromEither(ZCacheConfig.loadConfig("github-rank.cache", config))
        .mapError(ConfigReaderException(_))
        .orDie
      _ <- logger.info(s"Initializing cache using configured $cacheConfig")
      cache = {
        val caffeineCache =
          Caffeine
            .newBuilder()
            .maximumSize(cacheConfig.capacity)
            .build[String, Entry[Set[Contributor]]]()
        CaffeineCache[Set[Contributor]](caffeineCache): Cache[Set[Contributor]]
      }
    } yield ZCacheCaffeine(cache, cacheConfig)
  }.toLayer
}
