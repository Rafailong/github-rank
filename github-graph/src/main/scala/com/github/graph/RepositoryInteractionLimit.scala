package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryInteractionLimit extends scala.Product with scala.Serializable { def value: String }

object RepositoryInteractionLimit {
  case object COLLABORATORS_ONLY extends RepositoryInteractionLimit { val value: String = "COLLABORATORS_ONLY" }
  case object CONTRIBUTORS_ONLY extends RepositoryInteractionLimit { val value: String = "CONTRIBUTORS_ONLY" }
  case object EXISTING_USERS extends RepositoryInteractionLimit { val value: String = "EXISTING_USERS" }
  case object NO_LIMIT extends RepositoryInteractionLimit { val value: String = "NO_LIMIT" }

  implicit val decoder: ScalarDecoder[RepositoryInteractionLimit] = {
    case __StringValue("COLLABORATORS_ONLY") => Right(RepositoryInteractionLimit.COLLABORATORS_ONLY)
    case __StringValue("CONTRIBUTORS_ONLY")  => Right(RepositoryInteractionLimit.CONTRIBUTORS_ONLY)
    case __StringValue("EXISTING_USERS")     => Right(RepositoryInteractionLimit.EXISTING_USERS)
    case __StringValue("NO_LIMIT")           => Right(RepositoryInteractionLimit.NO_LIMIT)
    case other                               => Left(DecodingError(s"Can't build RepositoryInteractionLimit from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryInteractionLimit] = {
    case RepositoryInteractionLimit.COLLABORATORS_ONLY => __EnumValue("COLLABORATORS_ONLY")
    case RepositoryInteractionLimit.CONTRIBUTORS_ONLY  => __EnumValue("CONTRIBUTORS_ONLY")
    case RepositoryInteractionLimit.EXISTING_USERS     => __EnumValue("EXISTING_USERS")
    case RepositoryInteractionLimit.NO_LIMIT           => __EnumValue("NO_LIMIT")
  }

  val values: Vector[RepositoryInteractionLimit] = Vector(COLLABORATORS_ONLY, CONTRIBUTORS_ONLY, EXISTING_USERS, NO_LIMIT)
}

