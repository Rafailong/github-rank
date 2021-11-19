package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IpAllowListEnabledSettingValue extends scala.Product with scala.Serializable { def value: String }

object IpAllowListEnabledSettingValue {
  case object DISABLED extends IpAllowListEnabledSettingValue { val value: String = "DISABLED" }
  case object ENABLED extends IpAllowListEnabledSettingValue { val value: String = "ENABLED" }

  implicit val decoder: ScalarDecoder[IpAllowListEnabledSettingValue] = {
    case __StringValue("DISABLED") => Right(IpAllowListEnabledSettingValue.DISABLED)
    case __StringValue("ENABLED")  => Right(IpAllowListEnabledSettingValue.ENABLED)
    case other                     => Left(DecodingError(s"Can't build IpAllowListEnabledSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[IpAllowListEnabledSettingValue] = {
    case IpAllowListEnabledSettingValue.DISABLED => __EnumValue("DISABLED")
    case IpAllowListEnabledSettingValue.ENABLED  => __EnumValue("ENABLED")
  }

  val values: Vector[IpAllowListEnabledSettingValue] = Vector(DISABLED, ENABLED)
}

