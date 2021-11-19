package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateIpAllowListEnabledSettingInput(
  clientMutationId: Option[String] = None,
  ownerId: String,
  settingValue: IpAllowListEnabledSettingValue
)

object UpdateIpAllowListEnabledSettingInput {

  implicit val encoder: ArgEncoder[UpdateIpAllowListEnabledSettingInput] = new ArgEncoder[UpdateIpAllowListEnabledSettingInput] {

    override def encode(value: UpdateIpAllowListEnabledSettingInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId),
          "settingValue"     -> implicitly[ArgEncoder[IpAllowListEnabledSettingValue]].encode(value.settingValue)
        )
      )
  }
}

