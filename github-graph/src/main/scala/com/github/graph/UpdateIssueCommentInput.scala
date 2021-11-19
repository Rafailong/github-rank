package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateIssueCommentInput(body: String, clientMutationId: Option[String] = None, id: String)

object UpdateIssueCommentInput {

  implicit val encoder: ArgEncoder[UpdateIssueCommentInput] = new ArgEncoder[UpdateIssueCommentInput] {

    override def encode(value: UpdateIssueCommentInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

