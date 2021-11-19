package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait NotificationRestrictionSettingValue extends scala.Product with scala.Serializable { def value: String }

object NotificationRestrictionSettingValue {
  case object DISABLED extends NotificationRestrictionSettingValue { val value: String = "DISABLED" }
  case object ENABLED extends NotificationRestrictionSettingValue { val value: String = "ENABLED" }

  implicit val decoder: ScalarDecoder[NotificationRestrictionSettingValue] = {
    case __StringValue("DISABLED") => Right(NotificationRestrictionSettingValue.DISABLED)
    case __StringValue("ENABLED")  => Right(NotificationRestrictionSettingValue.ENABLED)
    case other                     => Left(DecodingError(s"Can't build NotificationRestrictionSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[NotificationRestrictionSettingValue] = {
    case NotificationRestrictionSettingValue.DISABLED => __EnumValue("DISABLED")
    case NotificationRestrictionSettingValue.ENABLED  => __EnumValue("ENABLED")
  }

  val values: Vector[NotificationRestrictionSettingValue] = Vector(DISABLED, ENABLED)
}

