package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteDiscussionCommentInput(clientMutationId: Option[String] = None, id: String)

object DeleteDiscussionCommentInput {

  implicit val encoder: ArgEncoder[DeleteDiscussionCommentInput] = new ArgEncoder[DeleteDiscussionCommentInput] {

    override def encode(value: DeleteDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

