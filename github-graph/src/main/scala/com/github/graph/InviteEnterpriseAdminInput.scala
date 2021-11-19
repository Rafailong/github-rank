package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class InviteEnterpriseAdminInput(
  clientMutationId: Option[String] = None,
  email: Option[String]            = None,
  enterpriseId: String,
  invitee: Option[String]                   = None,
  role: Option[EnterpriseAdministratorRole] = None
)

object InviteEnterpriseAdminInput {

  implicit val encoder: ArgEncoder[InviteEnterpriseAdminInput] = new ArgEncoder[InviteEnterpriseAdminInput] {

    override def encode(value: InviteEnterpriseAdminInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "email"            -> value.email.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "invitee"          -> value.invitee.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "role"             -> value.role.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[EnterpriseAdministratorRole]].encode(value))
        )
      )
  }
}

