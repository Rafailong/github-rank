package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

