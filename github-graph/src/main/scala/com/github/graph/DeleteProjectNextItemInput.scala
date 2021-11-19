package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteProjectNextItemInput(clientMutationId: Option[String] = None, itemId: String, projectId: String)

object DeleteProjectNextItemInput {

  implicit val encoder: ArgEncoder[DeleteProjectNextItemInput] = new ArgEncoder[DeleteProjectNextItemInput] {

    override def encode(value: DeleteProjectNextItemInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "itemId"           -> implicitly[ArgEncoder[String]].encode(value.itemId),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId)
        )
      )
  }
}

