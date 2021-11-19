package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledDisabledSettingValue
)

object UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledDisabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

