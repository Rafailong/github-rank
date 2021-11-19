package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgRemoveOutsideCollaboratorAuditEntryReason extends scala.Product with scala.Serializable { def value: String }

object OrgRemoveOutsideCollaboratorAuditEntryReason {

  case object SAML_EXTERNAL_IDENTITY_MISSING extends OrgRemoveOutsideCollaboratorAuditEntryReason {
    val value: String = "SAML_EXTERNAL_IDENTITY_MISSING"
  }

  case object TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE extends OrgRemoveOutsideCollaboratorAuditEntryReason {
    val value: String = "TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE"
  }

  implicit val decoder: ScalarDecoder[OrgRemoveOutsideCollaboratorAuditEntryReason] = {
    case __StringValue("SAML_EXTERNAL_IDENTITY_MISSING") => Right(OrgRemoveOutsideCollaboratorAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING)
    case __StringValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE") =>
      Right(OrgRemoveOutsideCollaboratorAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE)
    case other => Left(DecodingError(s"Can't build OrgRemoveOutsideCollaboratorAuditEntryReason from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgRemoveOutsideCollaboratorAuditEntryReason] = {
    case OrgRemoveOutsideCollaboratorAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING        => __EnumValue("SAML_EXTERNAL_IDENTITY_MISSING")
    case OrgRemoveOutsideCollaboratorAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE => __EnumValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE")
  }

  val values: Vector[OrgRemoveOutsideCollaboratorAuditEntryReason] = Vector(SAML_EXTERNAL_IDENTITY_MISSING, TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE)
}

