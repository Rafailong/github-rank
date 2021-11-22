package me.rafa.githubrank.config

import com.typesafe.config.Config
import pureconfig.generic.semiauto.deriveReader
import pureconfig.{ConfigReader, ConfigSource}

import scala.concurrent.duration.FiniteDuration

case class CacheConfig(capacity: Long, ttl: FiniteDuration)

object CacheConfig {

  implicit val cacheConfigReader: ConfigReader[CacheConfig] =
    deriveReader[CacheConfig]

  def loadConfig(path: String, config: Config) =
    ConfigSource.fromConfig(config).at(path).load[CacheConfig]
}
