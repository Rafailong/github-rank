package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

