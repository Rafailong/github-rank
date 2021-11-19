package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput] =
    new ArgEncoder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput] {

      override def encode(value: UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

