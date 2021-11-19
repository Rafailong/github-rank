package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteDiscussionInput(clientMutationId: Option[String] = None, id: String)

object DeleteDiscussionInput {

  implicit val encoder: ArgEncoder[DeleteDiscussionInput] = new ArgEncoder[DeleteDiscussionInput] {

    override def encode(value: DeleteDiscussionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

