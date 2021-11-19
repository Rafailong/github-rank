package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanMakePurchasesSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseMembersCanMakePurchasesSettingValue
)

object UpdateEnterpriseMembersCanMakePurchasesSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanMakePurchasesSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanMakePurchasesSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanMakePurchasesSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseMembersCanMakePurchasesSettingValue]].encode(value.settingValue)
          )
        )
    }
}

