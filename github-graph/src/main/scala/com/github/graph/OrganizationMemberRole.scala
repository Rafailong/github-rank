package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrganizationMemberRole extends scala.Product with scala.Serializable { def value: String }

object OrganizationMemberRole {
  case object ADMIN extends OrganizationMemberRole { val value: String = "ADMIN" }
  case object MEMBER extends OrganizationMemberRole { val value: String = "MEMBER" }

  implicit val decoder: ScalarDecoder[OrganizationMemberRole] = {
    case __StringValue("ADMIN")  => Right(OrganizationMemberRole.ADMIN)
    case __StringValue("MEMBER") => Right(OrganizationMemberRole.MEMBER)
    case other                   => Left(DecodingError(s"Can't build OrganizationMemberRole from input $other"))
  }

  implicit val encoder: ArgEncoder[OrganizationMemberRole] = {
    case OrganizationMemberRole.ADMIN  => __EnumValue("ADMIN")
    case OrganizationMemberRole.MEMBER => __EnumValue("MEMBER")
  }

  val values: Vector[OrganizationMemberRole] = Vector(ADMIN, MEMBER)
}

