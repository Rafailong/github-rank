package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseEnabledSettingValue extends scala.Product with scala.Serializable { def value: String }

object EnterpriseEnabledSettingValue {
  case object ENABLED extends EnterpriseEnabledSettingValue { val value: String = "ENABLED" }
  case object NO_POLICY extends EnterpriseEnabledSettingValue { val value: String = "NO_POLICY" }

  implicit val decoder: ScalarDecoder[EnterpriseEnabledSettingValue] = {
    case __StringValue("ENABLED")   => Right(EnterpriseEnabledSettingValue.ENABLED)
    case __StringValue("NO_POLICY") => Right(EnterpriseEnabledSettingValue.NO_POLICY)
    case other                      => Left(DecodingError(s"Can't build EnterpriseEnabledSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseEnabledSettingValue] = {
    case EnterpriseEnabledSettingValue.ENABLED   => __EnumValue("ENABLED")
    case EnterpriseEnabledSettingValue.NO_POLICY => __EnumValue("NO_POLICY")
  }

  val values: Vector[EnterpriseEnabledSettingValue] = Vector(ENABLED, NO_POLICY)
}

