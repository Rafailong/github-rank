package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait UserBlockDuration extends scala.Product with scala.Serializable { def value: String }

object UserBlockDuration {
  case object ONE_DAY extends UserBlockDuration { val value: String = "ONE_DAY" }
  case object ONE_MONTH extends UserBlockDuration { val value: String = "ONE_MONTH" }
  case object ONE_WEEK extends UserBlockDuration { val value: String = "ONE_WEEK" }
  case object PERMANENT extends UserBlockDuration { val value: String = "PERMANENT" }
  case object THREE_DAYS extends UserBlockDuration { val value: String = "THREE_DAYS" }

  implicit val decoder: ScalarDecoder[UserBlockDuration] = {
    case __StringValue("ONE_DAY")    => Right(UserBlockDuration.ONE_DAY)
    case __StringValue("ONE_MONTH")  => Right(UserBlockDuration.ONE_MONTH)
    case __StringValue("ONE_WEEK")   => Right(UserBlockDuration.ONE_WEEK)
    case __StringValue("PERMANENT")  => Right(UserBlockDuration.PERMANENT)
    case __StringValue("THREE_DAYS") => Right(UserBlockDuration.THREE_DAYS)
    case other                       => Left(DecodingError(s"Can't build UserBlockDuration from input $other"))
  }

  implicit val encoder: ArgEncoder[UserBlockDuration] = {
    case UserBlockDuration.ONE_DAY    => __EnumValue("ONE_DAY")
    case UserBlockDuration.ONE_MONTH  => __EnumValue("ONE_MONTH")
    case UserBlockDuration.ONE_WEEK   => __EnumValue("ONE_WEEK")
    case UserBlockDuration.PERMANENT  => __EnumValue("PERMANENT")
    case UserBlockDuration.THREE_DAYS => __EnumValue("THREE_DAYS")
  }

  val values: Vector[UserBlockDuration] = Vector(ONE_DAY, ONE_MONTH, ONE_WEEK, PERMANENT, THREE_DAYS)
}

