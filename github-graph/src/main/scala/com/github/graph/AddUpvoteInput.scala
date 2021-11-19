package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddUpvoteInput(clientMutationId: Option[String] = None, subjectId: String)

object AddUpvoteInput {

  implicit val encoder: ArgEncoder[AddUpvoteInput] = new ArgEncoder[AddUpvoteInput] {

    override def encode(value: AddUpvoteInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

