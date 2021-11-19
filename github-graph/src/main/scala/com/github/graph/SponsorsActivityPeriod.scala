package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorsActivityPeriod extends scala.Product with scala.Serializable { def value: String }

object SponsorsActivityPeriod {
  case object ALL extends SponsorsActivityPeriod { val value: String = "ALL" }
  case object DAY extends SponsorsActivityPeriod { val value: String = "DAY" }
  case object MONTH extends SponsorsActivityPeriod { val value: String = "MONTH" }
  case object WEEK extends SponsorsActivityPeriod { val value: String = "WEEK" }

  implicit val decoder: ScalarDecoder[SponsorsActivityPeriod] = {
    case __StringValue("ALL")   => Right(SponsorsActivityPeriod.ALL)
    case __StringValue("DAY")   => Right(SponsorsActivityPeriod.DAY)
    case __StringValue("MONTH") => Right(SponsorsActivityPeriod.MONTH)
    case __StringValue("WEEK")  => Right(SponsorsActivityPeriod.WEEK)
    case other                  => Left(DecodingError(s"Can't build SponsorsActivityPeriod from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorsActivityPeriod] = {
    case SponsorsActivityPeriod.ALL   => __EnumValue("ALL")
    case SponsorsActivityPeriod.DAY   => __EnumValue("DAY")
    case SponsorsActivityPeriod.MONTH => __EnumValue("MONTH")
    case SponsorsActivityPeriod.WEEK  => __EnumValue("WEEK")
  }

  val values: Vector[SponsorsActivityPeriod] = Vector(ALL, DAY, MONTH, WEEK)
}

