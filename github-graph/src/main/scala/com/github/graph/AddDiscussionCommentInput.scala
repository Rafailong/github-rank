package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddDiscussionCommentInput(
  body: String,
  clientMutationId: Option[String] = None,
  discussionId: String,
  replyToId: Option[String] = None
)

object AddDiscussionCommentInput {

  implicit val encoder: ArgEncoder[AddDiscussionCommentInput] = new ArgEncoder[AddDiscussionCommentInput] {

    override def encode(value: AddDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "discussionId"     -> implicitly[ArgEncoder[String]].encode(value.discussionId),
          "replyToId"        -> value.replyToId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

