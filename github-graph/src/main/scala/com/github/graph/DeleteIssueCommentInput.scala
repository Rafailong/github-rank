package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteIssueCommentInput(clientMutationId: Option[String] = None, id: String)

object DeleteIssueCommentInput {

  implicit val encoder: ArgEncoder[DeleteIssueCommentInput] = new ArgEncoder[DeleteIssueCommentInput] {

    override def encode(value: DeleteIssueCommentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

