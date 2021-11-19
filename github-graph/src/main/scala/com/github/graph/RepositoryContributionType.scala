package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryContributionType extends scala.Product with scala.Serializable { def value: String }

object RepositoryContributionType {
  case object COMMIT extends RepositoryContributionType { val value: String = "COMMIT" }
  case object ISSUE extends RepositoryContributionType { val value: String = "ISSUE" }
  case object PULL_REQUEST extends RepositoryContributionType { val value: String = "PULL_REQUEST" }
  case object PULL_REQUEST_REVIEW extends RepositoryContributionType { val value: String = "PULL_REQUEST_REVIEW" }
  case object REPOSITORY extends RepositoryContributionType { val value: String = "REPOSITORY" }

  implicit val decoder: ScalarDecoder[RepositoryContributionType] = {
    case __StringValue("COMMIT")              => Right(RepositoryContributionType.COMMIT)
    case __StringValue("ISSUE")               => Right(RepositoryContributionType.ISSUE)
    case __StringValue("PULL_REQUEST")        => Right(RepositoryContributionType.PULL_REQUEST)
    case __StringValue("PULL_REQUEST_REVIEW") => Right(RepositoryContributionType.PULL_REQUEST_REVIEW)
    case __StringValue("REPOSITORY")          => Right(RepositoryContributionType.REPOSITORY)
    case other                                => Left(DecodingError(s"Can't build RepositoryContributionType from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryContributionType] = {
    case RepositoryContributionType.COMMIT              => __EnumValue("COMMIT")
    case RepositoryContributionType.ISSUE               => __EnumValue("ISSUE")
    case RepositoryContributionType.PULL_REQUEST        => __EnumValue("PULL_REQUEST")
    case RepositoryContributionType.PULL_REQUEST_REVIEW => __EnumValue("PULL_REQUEST_REVIEW")
    case RepositoryContributionType.REPOSITORY          => __EnumValue("REPOSITORY")
  }

  val values: Vector[RepositoryContributionType] = Vector(COMMIT, ISSUE, PULL_REQUEST, PULL_REQUEST_REVIEW, REPOSITORY)
}

