package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveOutsideCollaboratorInput(clientMutationId: Option[String] = None, organizationId: String, userId: String)

object RemoveOutsideCollaboratorInput {

  implicit val encoder: ArgEncoder[RemoveOutsideCollaboratorInput] = new ArgEncoder[RemoveOutsideCollaboratorInput] {

    override def encode(value: RemoveOutsideCollaboratorInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "organizationId"   -> implicitly[ArgEncoder[String]].encode(value.organizationId),
          "userId"           -> implicitly[ArgEncoder[String]].encode(value.userId)
        )
      )
  }
}

