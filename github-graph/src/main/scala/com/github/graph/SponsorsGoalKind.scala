package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorsGoalKind extends scala.Product with scala.Serializable { def value: String }

object SponsorsGoalKind {
  case object MONTHLY_SPONSORSHIP_AMOUNT extends SponsorsGoalKind { val value: String = "MONTHLY_SPONSORSHIP_AMOUNT" }
  case object TOTAL_SPONSORS_COUNT extends SponsorsGoalKind { val value: String = "TOTAL_SPONSORS_COUNT" }

  implicit val decoder: ScalarDecoder[SponsorsGoalKind] = {
    case __StringValue("MONTHLY_SPONSORSHIP_AMOUNT") => Right(SponsorsGoalKind.MONTHLY_SPONSORSHIP_AMOUNT)
    case __StringValue("TOTAL_SPONSORS_COUNT")       => Right(SponsorsGoalKind.TOTAL_SPONSORS_COUNT)
    case other                                       => Left(DecodingError(s"Can't build SponsorsGoalKind from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorsGoalKind] = {
    case SponsorsGoalKind.MONTHLY_SPONSORSHIP_AMOUNT => __EnumValue("MONTHLY_SPONSORSHIP_AMOUNT")
    case SponsorsGoalKind.TOTAL_SPONSORS_COUNT       => __EnumValue("TOTAL_SPONSORS_COUNT")
  }

  val values: Vector[SponsorsGoalKind] = Vector(MONTHLY_SPONSORSHIP_AMOUNT, TOTAL_SPONSORS_COUNT)
}

