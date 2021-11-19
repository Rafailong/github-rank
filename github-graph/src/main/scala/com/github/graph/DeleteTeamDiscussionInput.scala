package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteTeamDiscussionInput(clientMutationId: Option[String] = None, id: String)

object DeleteTeamDiscussionInput {

  implicit val encoder: ArgEncoder[DeleteTeamDiscussionInput] = new ArgEncoder[DeleteTeamDiscussionInput] {

    override def encode(value: DeleteTeamDiscussionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

