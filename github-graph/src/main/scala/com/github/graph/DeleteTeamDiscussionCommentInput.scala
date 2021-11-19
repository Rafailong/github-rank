package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteTeamDiscussionCommentInput(clientMutationId: Option[String] = None, id: String)

object DeleteTeamDiscussionCommentInput {

  implicit val encoder: ArgEncoder[DeleteTeamDiscussionCommentInput] = new ArgEncoder[DeleteTeamDiscussionCommentInput] {

    override def encode(value: DeleteTeamDiscussionCommentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

