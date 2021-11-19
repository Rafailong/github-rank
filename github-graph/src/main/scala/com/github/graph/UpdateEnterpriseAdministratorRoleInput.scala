package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseAdministratorRoleInput(
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  login: String,
  role: EnterpriseAdministratorRole
)

object UpdateEnterpriseAdministratorRoleInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseAdministratorRoleInput] = new ArgEncoder[UpdateEnterpriseAdministratorRoleInput] {

    override def encode(value: UpdateEnterpriseAdministratorRoleInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "login"            -> implicitly[ArgEncoder[String]].encode(value.login),
          "role"             -> implicitly[ArgEncoder[EnterpriseAdministratorRole]].encode(value.role)
        )
      )
  }
}

