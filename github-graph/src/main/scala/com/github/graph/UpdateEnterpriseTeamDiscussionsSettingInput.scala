package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseTeamDiscussionsSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseTeamDiscussionsSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseTeamDiscussionsSettingInput] = new ArgEncoder[UpdateEnterpriseTeamDiscussionsSettingInput] {

    override def encode(value: UpdateEnterpriseTeamDiscussionsSettingInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
        )
      )
  }
}

