package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateTeamDiscussionCommentInput(
  body: String,
  bodyVersion: Option[String]      = None,
  clientMutationId: Option[String] = None,
  id: String
)

object UpdateTeamDiscussionCommentInput {

  implicit val encoder: ArgEncoder[UpdateTeamDiscussionCommentInput] = new ArgEncoder[UpdateTeamDiscussionCommentInput] {

    override def encode(value: UpdateTeamDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "bodyVersion"      -> value.bodyVersion.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

