package me.rafa.githubrank.caching

import com.typesafe.config.Config
import pureconfig.generic.semiauto.deriveReader
import pureconfig.{ConfigReader, ConfigSource}

import scala.concurrent.duration.FiniteDuration

case class ZCacheConfig(capacity: Long, ttl: FiniteDuration)

object ZCacheConfig {

  implicit val cacheConfigReader: ConfigReader[ZCacheConfig] =
    deriveReader[ZCacheConfig]

  def loadConfig(path: String, config: Config) =
    ConfigSource.fromConfig(config).at(path).load[ZCacheConfig]
}
