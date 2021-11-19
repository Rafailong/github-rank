package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryAffiliation extends scala.Product with scala.Serializable { def value: String }

object RepositoryAffiliation {
  case object COLLABORATOR extends RepositoryAffiliation { val value: String = "COLLABORATOR" }
  case object ORGANIZATION_MEMBER extends RepositoryAffiliation { val value: String = "ORGANIZATION_MEMBER" }
  case object OWNER extends RepositoryAffiliation { val value: String = "OWNER" }

  implicit val decoder: ScalarDecoder[RepositoryAffiliation] = {
    case __StringValue("COLLABORATOR")        => Right(RepositoryAffiliation.COLLABORATOR)
    case __StringValue("ORGANIZATION_MEMBER") => Right(RepositoryAffiliation.ORGANIZATION_MEMBER)
    case __StringValue("OWNER")               => Right(RepositoryAffiliation.OWNER)
    case other                                => Left(DecodingError(s"Can't build RepositoryAffiliation from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryAffiliation] = {
    case RepositoryAffiliation.COLLABORATOR        => __EnumValue("COLLABORATOR")
    case RepositoryAffiliation.ORGANIZATION_MEMBER => __EnumValue("ORGANIZATION_MEMBER")
    case RepositoryAffiliation.OWNER               => __EnumValue("OWNER")
  }

  val values: Vector[RepositoryAffiliation] = Vector(COLLABORATOR, ORGANIZATION_MEMBER, OWNER)
}

