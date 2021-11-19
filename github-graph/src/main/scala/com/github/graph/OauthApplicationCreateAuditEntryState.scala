package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OauthApplicationCreateAuditEntryState extends scala.Product with scala.Serializable { def value: String }

object OauthApplicationCreateAuditEntryState {
  case object ACTIVE extends OauthApplicationCreateAuditEntryState { val value: String = "ACTIVE" }
  case object PENDING_DELETION extends OauthApplicationCreateAuditEntryState { val value: String = "PENDING_DELETION" }
  case object SUSPENDED extends OauthApplicationCreateAuditEntryState { val value: String = "SUSPENDED" }

  implicit val decoder: ScalarDecoder[OauthApplicationCreateAuditEntryState] = {
    case __StringValue("ACTIVE")           => Right(OauthApplicationCreateAuditEntryState.ACTIVE)
    case __StringValue("PENDING_DELETION") => Right(OauthApplicationCreateAuditEntryState.PENDING_DELETION)
    case __StringValue("SUSPENDED")        => Right(OauthApplicationCreateAuditEntryState.SUSPENDED)
    case other                             => Left(DecodingError(s"Can't build OauthApplicationCreateAuditEntryState from input $other"))
  }

  implicit val encoder: ArgEncoder[OauthApplicationCreateAuditEntryState] = {
    case OauthApplicationCreateAuditEntryState.ACTIVE           => __EnumValue("ACTIVE")
    case OauthApplicationCreateAuditEntryState.PENDING_DELETION => __EnumValue("PENDING_DELETION")
    case OauthApplicationCreateAuditEntryState.SUSPENDED        => __EnumValue("SUSPENDED")
  }

  val values: Vector[OauthApplicationCreateAuditEntryState] = Vector(ACTIVE, PENDING_DELETION, SUSPENDED)
}

