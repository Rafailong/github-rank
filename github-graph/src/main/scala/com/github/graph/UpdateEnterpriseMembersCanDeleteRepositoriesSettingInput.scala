package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

