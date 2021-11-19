package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseMembersCanMakePurchasesSettingValue extends scala.Product with scala.Serializable { def value: String }

object EnterpriseMembersCanMakePurchasesSettingValue {
  case object DISABLED extends EnterpriseMembersCanMakePurchasesSettingValue { val value: String = "DISABLED" }
  case object ENABLED extends EnterpriseMembersCanMakePurchasesSettingValue { val value: String = "ENABLED" }

  implicit val decoder: ScalarDecoder[EnterpriseMembersCanMakePurchasesSettingValue] = {
    case __StringValue("DISABLED") => Right(EnterpriseMembersCanMakePurchasesSettingValue.DISABLED)
    case __StringValue("ENABLED")  => Right(EnterpriseMembersCanMakePurchasesSettingValue.ENABLED)
    case other                     => Left(DecodingError(s"Can't build EnterpriseMembersCanMakePurchasesSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseMembersCanMakePurchasesSettingValue] = {
    case EnterpriseMembersCanMakePurchasesSettingValue.DISABLED => __EnumValue("DISABLED")
    case EnterpriseMembersCanMakePurchasesSettingValue.ENABLED  => __EnumValue("ENABLED")
  }

  val values: Vector[EnterpriseMembersCanMakePurchasesSettingValue] = Vector(DISABLED, ENABLED)
}

