package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CloseIssueInput(clientMutationId: Option[String] = None, issueId: String)

object CloseIssueInput {

  implicit val encoder: ArgEncoder[CloseIssueInput] = new ArgEncoder[CloseIssueInput] {

    override def encode(value: CloseIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId)
        )
      )
  }
}

