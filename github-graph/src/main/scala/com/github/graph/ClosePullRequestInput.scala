package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ClosePullRequestInput(clientMutationId: Option[String] = None, pullRequestId: String)

object ClosePullRequestInput {

  implicit val encoder: ArgEncoder[ClosePullRequestInput] = new ArgEncoder[ClosePullRequestInput] {

    override def encode(value: ClosePullRequestInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

