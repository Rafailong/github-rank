package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AcceptEnterpriseAdministratorInvitationInput(clientMutationId: Option[String] = None, invitationId: String)

object AcceptEnterpriseAdministratorInvitationInput {

  implicit val encoder: ArgEncoder[AcceptEnterpriseAdministratorInvitationInput] = new ArgEncoder[AcceptEnterpriseAdministratorInvitationInput] {

    override def encode(value: AcceptEnterpriseAdministratorInvitationInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "invitationId"     -> implicitly[ArgEncoder[String]].encode(value.invitationId)
        )
      )
  }
}

