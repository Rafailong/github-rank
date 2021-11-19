package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamMemberRole extends scala.Product with scala.Serializable { def value: String }

object TeamMemberRole {
  case object MAINTAINER extends TeamMemberRole { val value: String = "MAINTAINER" }
  case object MEMBER extends TeamMemberRole { val value: String = "MEMBER" }

  implicit val decoder: ScalarDecoder[TeamMemberRole] = {
    case __StringValue("MAINTAINER") => Right(TeamMemberRole.MAINTAINER)
    case __StringValue("MEMBER")     => Right(TeamMemberRole.MEMBER)
    case other                       => Left(DecodingError(s"Can't build TeamMemberRole from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamMemberRole] = {
    case TeamMemberRole.MAINTAINER => __EnumValue("MAINTAINER")
    case TeamMemberRole.MEMBER     => __EnumValue("MEMBER")
  }

  val values: Vector[TeamMemberRole] = Vector(MAINTAINER, MEMBER)
}

