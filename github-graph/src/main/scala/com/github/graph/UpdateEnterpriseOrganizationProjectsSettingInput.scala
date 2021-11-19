package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseOrganizationProjectsSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseOrganizationProjectsSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseOrganizationProjectsSettingInput] =
    new ArgEncoder[UpdateEnterpriseOrganizationProjectsSettingInput] {

      override def encode(value: UpdateEnterpriseOrganizationProjectsSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

