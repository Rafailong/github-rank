package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateDiscussionCommentInput(body: String, clientMutationId: Option[String] = None, commentId: String)

object UpdateDiscussionCommentInput {

  implicit val encoder: ArgEncoder[UpdateDiscussionCommentInput] = new ArgEncoder[UpdateDiscussionCommentInput] {

    override def encode(value: UpdateDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commentId"        -> implicitly[ArgEncoder[String]].encode(value.commentId)
        )
      )
  }
}

