package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddReactionInput(clientMutationId: Option[String] = None, content: ReactionContent, subjectId: String)

object AddReactionInput {

  implicit val encoder: ArgEncoder[AddReactionInput] = new ArgEncoder[AddReactionInput] {

    override def encode(value: AddReactionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "content"          -> implicitly[ArgEncoder[ReactionContent]].encode(value.content),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

