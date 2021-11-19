package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseRepositoryProjectsSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseRepositoryProjectsSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseRepositoryProjectsSettingInput] = new ArgEncoder[UpdateEnterpriseRepositoryProjectsSettingInput] {

    override def encode(value: UpdateEnterpriseRepositoryProjectsSettingInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
        )
      )
  }
}

