package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateDiscussionInput(
  body: Option[String]             = None,
  categoryId: Option[String]       = None,
  clientMutationId: Option[String] = None,
  discussionId: String,
  title: Option[String] = None
)

object UpdateDiscussionInput {

  implicit val encoder: ArgEncoder[UpdateDiscussionInput] = new ArgEncoder[UpdateDiscussionInput] {

    override def encode(value: UpdateDiscussionInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "categoryId"       -> value.categoryId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "discussionId"     -> implicitly[ArgEncoder[String]].encode(value.discussionId),
          "title"            -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

