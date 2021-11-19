package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnminimizeCommentInput(clientMutationId: Option[String] = None, subjectId: String)

object UnminimizeCommentInput {

  implicit val encoder: ArgEncoder[UnminimizeCommentInput] = new ArgEncoder[UnminimizeCommentInput] {

    override def encode(value: UnminimizeCommentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

