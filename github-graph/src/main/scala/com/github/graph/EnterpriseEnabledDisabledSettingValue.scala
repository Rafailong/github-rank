package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseEnabledDisabledSettingValue extends scala.Product with scala.Serializable { def value: String }

object EnterpriseEnabledDisabledSettingValue {
  case object DISABLED extends EnterpriseEnabledDisabledSettingValue { val value: String = "DISABLED" }
  case object ENABLED extends EnterpriseEnabledDisabledSettingValue { val value: String = "ENABLED" }
  case object NO_POLICY extends EnterpriseEnabledDisabledSettingValue { val value: String = "NO_POLICY" }

  implicit val decoder: ScalarDecoder[EnterpriseEnabledDisabledSettingValue] = {
    case __StringValue("DISABLED")  => Right(EnterpriseEnabledDisabledSettingValue.DISABLED)
    case __StringValue("ENABLED")   => Right(EnterpriseEnabledDisabledSettingValue.ENABLED)
    case __StringValue("NO_POLICY") => Right(EnterpriseEnabledDisabledSettingValue.NO_POLICY)
    case other                      => Left(DecodingError(s"Can't build EnterpriseEnabledDisabledSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseEnabledDisabledSettingValue] = {
    case EnterpriseEnabledDisabledSettingValue.DISABLED  => __EnumValue("DISABLED")
    case EnterpriseEnabledDisabledSettingValue.ENABLED   => __EnumValue("ENABLED")
    case EnterpriseEnabledDisabledSettingValue.NO_POLICY => __EnumValue("NO_POLICY")
  }

  val values: Vector[EnterpriseEnabledDisabledSettingValue] = Vector(DISABLED, ENABLED, NO_POLICY)
}

