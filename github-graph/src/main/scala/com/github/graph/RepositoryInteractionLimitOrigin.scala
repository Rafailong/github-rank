package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryInteractionLimitOrigin extends scala.Product with scala.Serializable { def value: String }

object RepositoryInteractionLimitOrigin {
  case object ORGANIZATION extends RepositoryInteractionLimitOrigin { val value: String = "ORGANIZATION" }
  case object REPOSITORY extends RepositoryInteractionLimitOrigin { val value: String = "REPOSITORY" }
  case object USER extends RepositoryInteractionLimitOrigin { val value: String = "USER" }

  implicit val decoder: ScalarDecoder[RepositoryInteractionLimitOrigin] = {
    case __StringValue("ORGANIZATION") => Right(RepositoryInteractionLimitOrigin.ORGANIZATION)
    case __StringValue("REPOSITORY")   => Right(RepositoryInteractionLimitOrigin.REPOSITORY)
    case __StringValue("USER")         => Right(RepositoryInteractionLimitOrigin.USER)
    case other                         => Left(DecodingError(s"Can't build RepositoryInteractionLimitOrigin from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryInteractionLimitOrigin] = {
    case RepositoryInteractionLimitOrigin.ORGANIZATION => __EnumValue("ORGANIZATION")
    case RepositoryInteractionLimitOrigin.REPOSITORY   => __EnumValue("REPOSITORY")
    case RepositoryInteractionLimitOrigin.USER         => __EnumValue("USER")
  }

  val values: Vector[RepositoryInteractionLimitOrigin] = Vector(ORGANIZATION, REPOSITORY, USER)
}

