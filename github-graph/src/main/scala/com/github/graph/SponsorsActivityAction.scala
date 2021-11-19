package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorsActivityAction extends scala.Product with scala.Serializable { def value: String }

object SponsorsActivityAction {
  case object CANCELLED_SPONSORSHIP extends SponsorsActivityAction { val value: String = "CANCELLED_SPONSORSHIP" }
  case object NEW_SPONSORSHIP extends SponsorsActivityAction { val value: String = "NEW_SPONSORSHIP" }
  case object PENDING_CHANGE extends SponsorsActivityAction { val value: String = "PENDING_CHANGE" }
  case object REFUND extends SponsorsActivityAction { val value: String = "REFUND" }
  case object SPONSOR_MATCH_DISABLED extends SponsorsActivityAction { val value: String = "SPONSOR_MATCH_DISABLED" }
  case object TIER_CHANGE extends SponsorsActivityAction { val value: String = "TIER_CHANGE" }

  implicit val decoder: ScalarDecoder[SponsorsActivityAction] = {
    case __StringValue("CANCELLED_SPONSORSHIP")  => Right(SponsorsActivityAction.CANCELLED_SPONSORSHIP)
    case __StringValue("NEW_SPONSORSHIP")        => Right(SponsorsActivityAction.NEW_SPONSORSHIP)
    case __StringValue("PENDING_CHANGE")         => Right(SponsorsActivityAction.PENDING_CHANGE)
    case __StringValue("REFUND")                 => Right(SponsorsActivityAction.REFUND)
    case __StringValue("SPONSOR_MATCH_DISABLED") => Right(SponsorsActivityAction.SPONSOR_MATCH_DISABLED)
    case __StringValue("TIER_CHANGE")            => Right(SponsorsActivityAction.TIER_CHANGE)
    case other                                   => Left(DecodingError(s"Can't build SponsorsActivityAction from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorsActivityAction] = {
    case SponsorsActivityAction.CANCELLED_SPONSORSHIP  => __EnumValue("CANCELLED_SPONSORSHIP")
    case SponsorsActivityAction.NEW_SPONSORSHIP        => __EnumValue("NEW_SPONSORSHIP")
    case SponsorsActivityAction.PENDING_CHANGE         => __EnumValue("PENDING_CHANGE")
    case SponsorsActivityAction.REFUND                 => __EnumValue("REFUND")
    case SponsorsActivityAction.SPONSOR_MATCH_DISABLED => __EnumValue("SPONSOR_MATCH_DISABLED")
    case SponsorsActivityAction.TIER_CHANGE            => __EnumValue("TIER_CHANGE")
  }

  val values: Vector[SponsorsActivityAction] =
    Vector(CANCELLED_SPONSORSHIP, NEW_SPONSORSHIP, PENDING_CHANGE, REFUND, SPONSOR_MATCH_DISABLED, TIER_CHANGE)
}

