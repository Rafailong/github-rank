package me.rafa.githubrank.config

import com.typesafe.config.Config
import pureconfig.{ConfigReader, ConfigSource}
import pureconfig.generic.semiauto._
import pureconfig.module.sttp._
import sttp.model.Uri

case class GitHubClientConfiguration(
  gitHubGraphqlUri: Uri,
  gitHubAuthToken: String
)

object GitHubClientConfiguration {

  implicit val gitHubRankConfigurationConfigReader: ConfigReader[GitHubClientConfiguration] =
    deriveReader[GitHubClientConfiguration]

  def loadConfig(path: String, config: Config) =
    ConfigSource.fromConfig(config).at(path).load[GitHubClientConfiguration]
}
