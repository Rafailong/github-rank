package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ReopenIssueInput(clientMutationId: Option[String] = None, issueId: String)

object ReopenIssueInput {

  implicit val encoder: ArgEncoder[ReopenIssueInput] = new ArgEncoder[ReopenIssueInput] {

    override def encode(value: ReopenIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId)
        )
      )
  }
}

