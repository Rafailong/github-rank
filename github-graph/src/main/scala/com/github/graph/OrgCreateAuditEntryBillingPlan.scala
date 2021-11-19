package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgCreateAuditEntryBillingPlan extends scala.Product with scala.Serializable { def value: String }

object OrgCreateAuditEntryBillingPlan {
  case object BUSINESS extends OrgCreateAuditEntryBillingPlan { val value: String = "BUSINESS" }
  case object BUSINESS_PLUS extends OrgCreateAuditEntryBillingPlan { val value: String = "BUSINESS_PLUS" }
  case object FREE extends OrgCreateAuditEntryBillingPlan { val value: String = "FREE" }
  case object TIERED_PER_SEAT extends OrgCreateAuditEntryBillingPlan { val value: String = "TIERED_PER_SEAT" }
  case object UNLIMITED extends OrgCreateAuditEntryBillingPlan { val value: String = "UNLIMITED" }

  implicit val decoder: ScalarDecoder[OrgCreateAuditEntryBillingPlan] = {
    case __StringValue("BUSINESS")        => Right(OrgCreateAuditEntryBillingPlan.BUSINESS)
    case __StringValue("BUSINESS_PLUS")   => Right(OrgCreateAuditEntryBillingPlan.BUSINESS_PLUS)
    case __StringValue("FREE")            => Right(OrgCreateAuditEntryBillingPlan.FREE)
    case __StringValue("TIERED_PER_SEAT") => Right(OrgCreateAuditEntryBillingPlan.TIERED_PER_SEAT)
    case __StringValue("UNLIMITED")       => Right(OrgCreateAuditEntryBillingPlan.UNLIMITED)
    case other                            => Left(DecodingError(s"Can't build OrgCreateAuditEntryBillingPlan from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgCreateAuditEntryBillingPlan] = {
    case OrgCreateAuditEntryBillingPlan.BUSINESS        => __EnumValue("BUSINESS")
    case OrgCreateAuditEntryBillingPlan.BUSINESS_PLUS   => __EnumValue("BUSINESS_PLUS")
    case OrgCreateAuditEntryBillingPlan.FREE            => __EnumValue("FREE")
    case OrgCreateAuditEntryBillingPlan.TIERED_PER_SEAT => __EnumValue("TIERED_PER_SEAT")
    case OrgCreateAuditEntryBillingPlan.UNLIMITED       => __EnumValue("UNLIMITED")
  }

  val values: Vector[OrgCreateAuditEntryBillingPlan] = Vector(BUSINESS, BUSINESS_PLUS, FREE, TIERED_PER_SEAT, UNLIMITED)
}

