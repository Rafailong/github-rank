package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateTeamDiscussionCommentInput(body: String, clientMutationId: Option[String] = None, discussionId: String)

object CreateTeamDiscussionCommentInput {

  implicit val encoder: ArgEncoder[CreateTeamDiscussionCommentInput] = new ArgEncoder[CreateTeamDiscussionCommentInput] {

    override def encode(value: CreateTeamDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "discussionId"     -> implicitly[ArgEncoder[String]].encode(value.discussionId)
        )
      )
  }
}

