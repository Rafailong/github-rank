package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddCommentInput(body: String, clientMutationId: Option[String] = None, subjectId: String)

object AddCommentInput {

  implicit val encoder: ArgEncoder[AddCommentInput] = new ArgEncoder[AddCommentInput] {

    override def encode(value: AddCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

