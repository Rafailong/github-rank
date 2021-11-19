package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgRemoveMemberAuditEntryMembershipType extends scala.Product with scala.Serializable { def value: String }

object OrgRemoveMemberAuditEntryMembershipType {
  case object ADMIN extends OrgRemoveMemberAuditEntryMembershipType { val value: String = "ADMIN" }
  case object BILLING_MANAGER extends OrgRemoveMemberAuditEntryMembershipType { val value: String = "BILLING_MANAGER" }
  case object DIRECT_MEMBER extends OrgRemoveMemberAuditEntryMembershipType { val value: String = "DIRECT_MEMBER" }
  case object OUTSIDE_COLLABORATOR extends OrgRemoveMemberAuditEntryMembershipType { val value: String = "OUTSIDE_COLLABORATOR" }
  case object UNAFFILIATED extends OrgRemoveMemberAuditEntryMembershipType { val value: String = "UNAFFILIATED" }

  implicit val decoder: ScalarDecoder[OrgRemoveMemberAuditEntryMembershipType] = {
    case __StringValue("ADMIN")                => Right(OrgRemoveMemberAuditEntryMembershipType.ADMIN)
    case __StringValue("BILLING_MANAGER")      => Right(OrgRemoveMemberAuditEntryMembershipType.BILLING_MANAGER)
    case __StringValue("DIRECT_MEMBER")        => Right(OrgRemoveMemberAuditEntryMembershipType.DIRECT_MEMBER)
    case __StringValue("OUTSIDE_COLLABORATOR") => Right(OrgRemoveMemberAuditEntryMembershipType.OUTSIDE_COLLABORATOR)
    case __StringValue("UNAFFILIATED")         => Right(OrgRemoveMemberAuditEntryMembershipType.UNAFFILIATED)
    case other                                 => Left(DecodingError(s"Can't build OrgRemoveMemberAuditEntryMembershipType from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgRemoveMemberAuditEntryMembershipType] = {
    case OrgRemoveMemberAuditEntryMembershipType.ADMIN                => __EnumValue("ADMIN")
    case OrgRemoveMemberAuditEntryMembershipType.BILLING_MANAGER      => __EnumValue("BILLING_MANAGER")
    case OrgRemoveMemberAuditEntryMembershipType.DIRECT_MEMBER        => __EnumValue("DIRECT_MEMBER")
    case OrgRemoveMemberAuditEntryMembershipType.OUTSIDE_COLLABORATOR => __EnumValue("OUTSIDE_COLLABORATOR")
    case OrgRemoveMemberAuditEntryMembershipType.UNAFFILIATED         => __EnumValue("UNAFFILIATED")
  }

  val values: Vector[OrgRemoveMemberAuditEntryMembershipType] = Vector(ADMIN, BILLING_MANAGER, DIRECT_MEMBER, OUTSIDE_COLLABORATOR, UNAFFILIATED)
}

