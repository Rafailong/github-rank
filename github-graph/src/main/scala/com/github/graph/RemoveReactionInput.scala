package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveReactionInput(clientMutationId: Option[String] = None, content: ReactionContent, subjectId: String)

object RemoveReactionInput {

  implicit val encoder: ArgEncoder[RemoveReactionInput] = new ArgEncoder[RemoveReactionInput] {

    override def encode(value: RemoveReactionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "content"          -> implicitly[ArgEncoder[ReactionContent]].encode(value.content),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

