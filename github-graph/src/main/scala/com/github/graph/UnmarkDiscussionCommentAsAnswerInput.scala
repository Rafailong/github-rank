package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnmarkDiscussionCommentAsAnswerInput(clientMutationId: Option[String] = None, id: String)

object UnmarkDiscussionCommentAsAnswerInput {

  implicit val encoder: ArgEncoder[UnmarkDiscussionCommentAsAnswerInput] = new ArgEncoder[UnmarkDiscussionCommentAsAnswerInput] {

    override def encode(value: UnmarkDiscussionCommentAsAnswerInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

