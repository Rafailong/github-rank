package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CancelEnterpriseAdminInvitationInput(clientMutationId: Option[String] = None, invitationId: String)

object CancelEnterpriseAdminInvitationInput {

  implicit val encoder: ArgEncoder[CancelEnterpriseAdminInvitationInput] = new ArgEncoder[CancelEnterpriseAdminInvitationInput] {

    override def encode(value: CancelEnterpriseAdminInvitationInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "invitationId"     -> implicitly[ArgEncoder[String]].encode(value.invitationId)
        )
      )
  }
}

