package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteIssueInput(clientMutationId: Option[String] = None, issueId: String)

object DeleteIssueInput {

  implicit val encoder: ArgEncoder[DeleteIssueInput] = new ArgEncoder[DeleteIssueInput] {

    override def encode(value: DeleteIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId)
        )
      )
  }
}

