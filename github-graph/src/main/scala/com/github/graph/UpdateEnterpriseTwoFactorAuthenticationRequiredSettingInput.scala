package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseEnabledSettingValue
)

object UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput] =
    new ArgEncoder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput] {

      override def encode(value: UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseEnabledSettingValue]].encode(value.settingValue)
          )
        )
    }
}

