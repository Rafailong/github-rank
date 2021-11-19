package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateTeamDiscussionInput(
  body: Option[String]             = None,
  bodyVersion: Option[String]      = None,
  clientMutationId: Option[String] = None,
  id: String,
  pinned: Option[Boolean] = None,
  title: Option[String]   = None
)

object UpdateTeamDiscussionInput {

  implicit val encoder: ArgEncoder[UpdateTeamDiscussionInput] = new ArgEncoder[UpdateTeamDiscussionInput] {

    override def encode(value: UpdateTeamDiscussionInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "bodyVersion"      -> value.bodyVersion.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id),
          "pinned"           -> value.pinned.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "title"            -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

