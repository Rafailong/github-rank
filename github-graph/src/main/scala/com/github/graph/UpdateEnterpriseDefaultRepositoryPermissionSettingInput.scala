package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseDefaultRepositoryPermissionSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  settingValue: EnterpriseDefaultRepositoryPermissionSettingValue
)

object UpdateEnterpriseDefaultRepositoryPermissionSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseDefaultRepositoryPermissionSettingInput] =
    new ArgEncoder[UpdateEnterpriseDefaultRepositoryPermissionSettingInput] {

      override def encode(value: UpdateEnterpriseDefaultRepositoryPermissionSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "settingValue"     -> implicitly[ArgEncoder[EnterpriseDefaultRepositoryPermissionSettingValue]].encode(value.settingValue)
          )
        )
    }
}

