package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanDeleteIssuesSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanDeleteIssuesSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanDeleteIssuesSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanDeleteIssuesSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanDeleteIssuesSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

