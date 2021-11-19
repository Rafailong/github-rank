package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateTeamDiscussionInput(
  body: String,
  clientMutationId: Option[String] = None,
  `private`: Option[Boolean]       = None,
  teamId: String,
  title: String
)

object CreateTeamDiscussionInput {

  implicit val encoder: ArgEncoder[CreateTeamDiscussionInput] = new ArgEncoder[CreateTeamDiscussionInput] {

    override def encode(value: CreateTeamDiscussionInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "private"          -> value.`private`.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "teamId"           -> implicitly[ArgEncoder[String]].encode(value.teamId),
          "title"            -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

