package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class PinIssueInput(clientMutationId: Option[String] = None, issueId: String)

object PinIssueInput {

  implicit val encoder: ArgEncoder[PinIssueInput] = new ArgEncoder[PinIssueInput] {

    override def encode(value: PinIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId)
        )
      )
  }
}

