package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnpinIssueInput(clientMutationId: Option[String] = None, issueId: String)

object UnpinIssueInput {

  implicit val encoder: ArgEncoder[UnpinIssueInput] = new ArgEncoder[UnpinIssueInput] {

    override def encode(value: UnpinIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId)
        )
      )
  }
}

