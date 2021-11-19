package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgRemoveOutsideCollaboratorAuditEntryMembershipType extends scala.Product with scala.Serializable { def value: String }

object OrgRemoveOutsideCollaboratorAuditEntryMembershipType {
  case object BILLING_MANAGER extends OrgRemoveOutsideCollaboratorAuditEntryMembershipType { val value: String = "BILLING_MANAGER" }
  case object OUTSIDE_COLLABORATOR extends OrgRemoveOutsideCollaboratorAuditEntryMembershipType { val value: String = "OUTSIDE_COLLABORATOR" }
  case object UNAFFILIATED extends OrgRemoveOutsideCollaboratorAuditEntryMembershipType { val value: String = "UNAFFILIATED" }

  implicit val decoder: ScalarDecoder[OrgRemoveOutsideCollaboratorAuditEntryMembershipType] = {
    case __StringValue("BILLING_MANAGER")      => Right(OrgRemoveOutsideCollaboratorAuditEntryMembershipType.BILLING_MANAGER)
    case __StringValue("OUTSIDE_COLLABORATOR") => Right(OrgRemoveOutsideCollaboratorAuditEntryMembershipType.OUTSIDE_COLLABORATOR)
    case __StringValue("UNAFFILIATED")         => Right(OrgRemoveOutsideCollaboratorAuditEntryMembershipType.UNAFFILIATED)
    case other                                 => Left(DecodingError(s"Can't build OrgRemoveOutsideCollaboratorAuditEntryMembershipType from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgRemoveOutsideCollaboratorAuditEntryMembershipType] = {
    case OrgRemoveOutsideCollaboratorAuditEntryMembershipType.BILLING_MANAGER      => __EnumValue("BILLING_MANAGER")
    case OrgRemoveOutsideCollaboratorAuditEntryMembershipType.OUTSIDE_COLLABORATOR => __EnumValue("OUTSIDE_COLLABORATOR")
    case OrgRemoveOutsideCollaboratorAuditEntryMembershipType.UNAFFILIATED         => __EnumValue("UNAFFILIATED")
  }

  val values: Vector[OrgRemoveOutsideCollaboratorAuditEntryMembershipType] = Vector(BILLING_MANAGER, OUTSIDE_COLLABORATOR, UNAFFILIATED)
}

