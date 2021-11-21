package me.rafa.githubrank.config

import com.typesafe.config.Config
import pureconfig.{ConfigReader, ConfigSource}
import pureconfig.generic.semiauto._
import pureconfig.module.sttp._
import sttp.model.Uri

case class GitHubRankConfiguration(
  gitHubGraphqlUri: Uri,
  gitHubAuthToken: String
)

object GitHubRankConfiguration {

  implicit val gitHubRankConfigurationConfigReader: ConfigReader[GitHubRankConfiguration] =
    deriveReader[GitHubRankConfiguration]

  def loadConfig(path: String, config: Config) =
    ConfigSource.fromConfig(config).at(path).load[GitHubRankConfiguration]
}
