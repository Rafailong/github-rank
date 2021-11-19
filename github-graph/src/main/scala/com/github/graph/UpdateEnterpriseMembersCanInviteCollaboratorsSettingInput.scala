package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

