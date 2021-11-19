package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TransferIssueInput(clientMutationId: Option[String] = None, issueId: String, repositoryId: String)

object TransferIssueInput {

  implicit val encoder: ArgEncoder[TransferIssueInput] = new ArgEncoder[TransferIssueInput] {

    override def encode(value: TransferIssueInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueId"          -> implicitly[ArgEncoder[String]].encode(value.issueId),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

