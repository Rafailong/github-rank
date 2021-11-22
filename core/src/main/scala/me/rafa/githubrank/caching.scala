package me.rafa.githubrank

import com.github.benmanes.caffeine.cache.Caffeine
import com.typesafe.config.Config
import me.rafa.githubrank.GitHunRankError.UnexpectedError
import me.rafa.githubrank.config.CacheConfig
import me.rafa.githubrank.model.Contributor
import pureconfig.error.ConfigReaderException

import scala.concurrent.duration._
import scalacache._
import scalacache.modes.try_._
import scalacache.caffeine._
import zio._
import zio.logging.{Logger, Logging}

object caching {

  type ZCaching = Has[ZCaching.Service]

  object ZCaching {

    val DEFAULT_DURATION_VALUE           = 1.minute
    val MAXIMUM_SIZE_DEFAULT_VALUE: Long = 100

    trait Service {

      def putWithExpiration(key: String)(contributors: Set[Contributor])(implicit
        flags: Flags
      ): IO[GitHunRankError, Unit]

      def get(key: String)(implicit flags: Flags): IO[GitHunRankError, Option[Set[Contributor]]]
    }

    val live: URLayer[Logging with Has[Config], ZCaching] = {
      for {
        logger <- ZIO.service[Logger[String]]
        config <- ZIO.service[Config]
        cacheConfig <- ZIO
          .fromEither(CacheConfig.loadConfig("github-rank.cache", config))
          .mapError(ConfigReaderException(_))
          .orDie
        _ <- logger.info(s"Initializing cache using configured $cacheConfig")
        cache = {
          val caffeineCache = Caffeine.newBuilder().maximumSize(cacheConfig.capacity).build[String, Entry[Set[Contributor]]]()
          CaffeineCache[Set[Contributor]](caffeineCache): Cache[Set[Contributor]]
        }
      } yield new Service {
        override def putWithExpiration(
          key: String
        )(contributors: Set[Contributor])(implicit flags: Flags): IO[GitHunRankError, Unit] =
          IO.fromTry(cache.put(key)(contributors, ttl = Some(cacheConfig.ttl)))
            .mapError(UnexpectedError)
            .unit

        override def get(key: String)(implicit flags: Flags): IO[GitHunRankError, Option[Set[Contributor]]] = {
          val cached = cache.get(key)
          IO.fromTry(cached).mapError(UnexpectedError)
        }
      }
    }.toLayer

  }
}
