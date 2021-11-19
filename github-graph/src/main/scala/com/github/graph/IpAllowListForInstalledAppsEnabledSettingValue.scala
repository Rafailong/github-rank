package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IpAllowListForInstalledAppsEnabledSettingValue extends scala.Product with scala.Serializable { def value: String }

object IpAllowListForInstalledAppsEnabledSettingValue {
  case object DISABLED extends IpAllowListForInstalledAppsEnabledSettingValue { val value: String = "DISABLED" }
  case object ENABLED extends IpAllowListForInstalledAppsEnabledSettingValue { val value: String = "ENABLED" }

  implicit val decoder: ScalarDecoder[IpAllowListForInstalledAppsEnabledSettingValue] = {
    case __StringValue("DISABLED") => Right(IpAllowListForInstalledAppsEnabledSettingValue.DISABLED)
    case __StringValue("ENABLED")  => Right(IpAllowListForInstalledAppsEnabledSettingValue.ENABLED)
    case other                     => Left(DecodingError(s"Can't build IpAllowListForInstalledAppsEnabledSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[IpAllowListForInstalledAppsEnabledSettingValue] = {
    case IpAllowListForInstalledAppsEnabledSettingValue.DISABLED => __EnumValue("DISABLED")
    case IpAllowListForInstalledAppsEnabledSettingValue.ENABLED  => __EnumValue("ENABLED")
  }

  val values: Vector[IpAllowListForInstalledAppsEnabledSettingValue] = Vector(DISABLED, ENABLED)
}

