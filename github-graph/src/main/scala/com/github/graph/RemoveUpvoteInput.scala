package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveUpvoteInput(clientMutationId: Option[String] = None, subjectId: String)

object RemoveUpvoteInput {

  implicit val encoder: ArgEncoder[RemoveUpvoteInput] = new ArgEncoder[RemoveUpvoteInput] {

    override def encode(value: RemoveUpvoteInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

