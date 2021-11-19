package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrganizationInvitationType extends scala.Product with scala.Serializable { def value: String }

object OrganizationInvitationType {
  case object EMAIL extends OrganizationInvitationType { val value: String = "EMAIL" }
  case object USER extends OrganizationInvitationType { val value: String = "USER" }

  implicit val decoder: ScalarDecoder[OrganizationInvitationType] = {
    case __StringValue("EMAIL") => Right(OrganizationInvitationType.EMAIL)
    case __StringValue("USER")  => Right(OrganizationInvitationType.USER)
    case other                  => Left(DecodingError(s"Can't build OrganizationInvitationType from input $other"))
  }

  implicit val encoder: ArgEncoder[OrganizationInvitationType] = {
    case OrganizationInvitationType.EMAIL => __EnumValue("EMAIL")
    case OrganizationInvitationType.USER  => __EnumValue("USER")
  }

  val values: Vector[OrganizationInvitationType] = Vector(EMAIL, USER)
}

