package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MarkDiscussionCommentAsAnswerInput(clientMutationId: Option[String] = None, id: String)

object MarkDiscussionCommentAsAnswerInput {

  implicit val encoder: ArgEncoder[MarkDiscussionCommentAsAnswerInput] = new ArgEncoder[MarkDiscussionCommentAsAnswerInput] {

    override def encode(value: MarkDiscussionCommentAsAnswerInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

