package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateIpAllowListForInstalledAppsEnabledSettingInput(
  clientMutationId: Option[String] = None,
  ownerId: String,
  settingValue: IpAllowListForInstalledAppsEnabledSettingValue
)

object UpdateIpAllowListForInstalledAppsEnabledSettingInput {

  implicit val encoder: ArgEncoder[UpdateIpAllowListForInstalledAppsEnabledSettingInput] =
    new ArgEncoder[UpdateIpAllowListForInstalledAppsEnabledSettingInput] {

      override def encode(value: UpdateIpAllowListForInstalledAppsEnabledSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId),
            "settingValue"     -> implicitly[ArgEncoder[IpAllowListForInstalledAppsEnabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

