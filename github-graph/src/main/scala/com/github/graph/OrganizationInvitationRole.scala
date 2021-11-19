package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrganizationInvitationRole extends scala.Product with scala.Serializable { def value: String }

object OrganizationInvitationRole {
  case object ADMIN extends OrganizationInvitationRole { val value: String = "ADMIN" }
  case object BILLING_MANAGER extends OrganizationInvitationRole { val value: String = "BILLING_MANAGER" }
  case object DIRECT_MEMBER extends OrganizationInvitationRole { val value: String = "DIRECT_MEMBER" }
  case object REINSTATE extends OrganizationInvitationRole { val value: String = "REINSTATE" }

  implicit val decoder: ScalarDecoder[OrganizationInvitationRole] = {
    case __StringValue("ADMIN")           => Right(OrganizationInvitationRole.ADMIN)
    case __StringValue("BILLING_MANAGER") => Right(OrganizationInvitationRole.BILLING_MANAGER)
    case __StringValue("DIRECT_MEMBER")   => Right(OrganizationInvitationRole.DIRECT_MEMBER)
    case __StringValue("REINSTATE")       => Right(OrganizationInvitationRole.REINSTATE)
    case other                            => Left(DecodingError(s"Can't build OrganizationInvitationRole from input $other"))
  }

  implicit val encoder: ArgEncoder[OrganizationInvitationRole] = {
    case OrganizationInvitationRole.ADMIN           => __EnumValue("ADMIN")
    case OrganizationInvitationRole.BILLING_MANAGER => __EnumValue("BILLING_MANAGER")
    case OrganizationInvitationRole.DIRECT_MEMBER   => __EnumValue("DIRECT_MEMBER")
    case OrganizationInvitationRole.REINSTATE       => __EnumValue("REINSTATE")
  }

  val values: Vector[OrganizationInvitationRole] = Vector(ADMIN, BILLING_MANAGER, DIRECT_MEMBER, REINSTATE)
}

