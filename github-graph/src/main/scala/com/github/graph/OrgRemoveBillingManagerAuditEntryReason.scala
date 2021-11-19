package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgRemoveBillingManagerAuditEntryReason extends scala.Product with scala.Serializable { def value: String }

object OrgRemoveBillingManagerAuditEntryReason {
  case object SAML_EXTERNAL_IDENTITY_MISSING extends OrgRemoveBillingManagerAuditEntryReason { val value: String = "SAML_EXTERNAL_IDENTITY_MISSING" }

  case object SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY extends OrgRemoveBillingManagerAuditEntryReason {
    val value: String = "SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY"
  }

  case object TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE extends OrgRemoveBillingManagerAuditEntryReason {
    val value: String = "TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE"
  }

  implicit val decoder: ScalarDecoder[OrgRemoveBillingManagerAuditEntryReason] = {
    case __StringValue("SAML_EXTERNAL_IDENTITY_MISSING") => Right(OrgRemoveBillingManagerAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING)
    case __StringValue("SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY") =>
      Right(OrgRemoveBillingManagerAuditEntryReason.SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY)
    case __StringValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE") =>
      Right(OrgRemoveBillingManagerAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE)
    case other => Left(DecodingError(s"Can't build OrgRemoveBillingManagerAuditEntryReason from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgRemoveBillingManagerAuditEntryReason] = {
    case OrgRemoveBillingManagerAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING => __EnumValue("SAML_EXTERNAL_IDENTITY_MISSING")
    case OrgRemoveBillingManagerAuditEntryReason.SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY =>
      __EnumValue("SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY")
    case OrgRemoveBillingManagerAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE => __EnumValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE")
  }

  val values: Vector[OrgRemoveBillingManagerAuditEntryReason] =
    Vector(SAML_EXTERNAL_IDENTITY_MISSING, SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY, TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE)
}

