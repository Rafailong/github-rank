package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseMembersCanCreateRepositoriesSettingInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  membersCanCreateInternalRepositories: Option[Boolean]                    = None,
  membersCanCreatePrivateRepositories: Option[Boolean]                     = None,
  membersCanCreatePublicRepositories: Option[Boolean]                      = None,
  membersCanCreateRepositoriesPolicyEnabled: Option[Boolean]               = None,
  settingValue: Option[EnterpriseMembersCanCreateRepositoriesSettingValue] = None
)

object UpdateEnterpriseMembersCanCreateRepositoriesSettingInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseMembersCanCreateRepositoriesSettingInput] =
    new ArgEncoder[UpdateEnterpriseMembersCanCreateRepositoriesSettingInput] {

      override def encode(value: UpdateEnterpriseMembersCanCreateRepositoriesSettingInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
            "membersCanCreateInternalRepositories" -> value.membersCanCreateInternalRepositories.fold(__NullValue: __Value)(value =>
              implicitly[ArgEncoder[Boolean]].encode(value)
            ),
            "membersCanCreatePrivateRepositories" -> value.membersCanCreatePrivateRepositories.fold(__NullValue: __Value)(value =>
              implicitly[ArgEncoder[Boolean]].encode(value)
            ),
            "membersCanCreatePublicRepositories" -> value.membersCanCreatePublicRepositories.fold(__NullValue: __Value)(value =>
              implicitly[ArgEncoder[Boolean]].encode(value)
            ),
            "membersCanCreateRepositoriesPolicyEnabled" -> value.membersCanCreateRepositoriesPolicyEnabled.fold(__NullValue: __Value)(value =>
              implicitly[ArgEncoder[Boolean]].encode(value)
            ),
            "settingValue" -> value.settingValue.fold(__NullValue: __Value)(value =>
              implicitly[ArgEncoder[EnterpriseMembersCanCreateRepositoriesSettingValue]].encode(value)
            )
          )
        )
    }
}

