package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgRemoveMemberAuditEntryReason extends scala.Product with scala.Serializable { def value: String }

object OrgRemoveMemberAuditEntryReason {
  case object SAML_EXTERNAL_IDENTITY_MISSING extends OrgRemoveMemberAuditEntryReason { val value: String = "SAML_EXTERNAL_IDENTITY_MISSING" }

  case object SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY extends OrgRemoveMemberAuditEntryReason {
    val value: String = "SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY"
  }
  case object TWO_FACTOR_ACCOUNT_RECOVERY extends OrgRemoveMemberAuditEntryReason { val value: String = "TWO_FACTOR_ACCOUNT_RECOVERY" }

  case object TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE extends OrgRemoveMemberAuditEntryReason {
    val value: String = "TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE"
  }
  case object USER_ACCOUNT_DELETED extends OrgRemoveMemberAuditEntryReason { val value: String = "USER_ACCOUNT_DELETED" }

  implicit val decoder: ScalarDecoder[OrgRemoveMemberAuditEntryReason] = {
    case __StringValue("SAML_EXTERNAL_IDENTITY_MISSING") => Right(OrgRemoveMemberAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING)
    case __StringValue("SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY") =>
      Right(OrgRemoveMemberAuditEntryReason.SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY)
    case __StringValue("TWO_FACTOR_ACCOUNT_RECOVERY")           => Right(OrgRemoveMemberAuditEntryReason.TWO_FACTOR_ACCOUNT_RECOVERY)
    case __StringValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE") => Right(OrgRemoveMemberAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE)
    case __StringValue("USER_ACCOUNT_DELETED")                  => Right(OrgRemoveMemberAuditEntryReason.USER_ACCOUNT_DELETED)
    case other                                                  => Left(DecodingError(s"Can't build OrgRemoveMemberAuditEntryReason from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgRemoveMemberAuditEntryReason] = {
    case OrgRemoveMemberAuditEntryReason.SAML_EXTERNAL_IDENTITY_MISSING => __EnumValue("SAML_EXTERNAL_IDENTITY_MISSING")
    case OrgRemoveMemberAuditEntryReason.SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY =>
      __EnumValue("SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY")
    case OrgRemoveMemberAuditEntryReason.TWO_FACTOR_ACCOUNT_RECOVERY           => __EnumValue("TWO_FACTOR_ACCOUNT_RECOVERY")
    case OrgRemoveMemberAuditEntryReason.TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE => __EnumValue("TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE")
    case OrgRemoveMemberAuditEntryReason.USER_ACCOUNT_DELETED                  => __EnumValue("USER_ACCOUNT_DELETED")
  }

  val values: Vector[OrgRemoveMemberAuditEntryReason] = Vector(
    SAML_EXTERNAL_IDENTITY_MISSING,
    SAML_SSO_ENFORCEMENT_REQUIRES_EXTERNAL_IDENTITY,
    TWO_FACTOR_ACCOUNT_RECOVERY,
    TWO_FACTOR_REQUIREMENT_NON_COMPLIANCE,
    USER_ACCOUNT_DELETED
  )
}

