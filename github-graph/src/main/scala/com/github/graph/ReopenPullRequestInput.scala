package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ReopenPullRequestInput(clientMutationId: Option[String] = None, pullRequestId: String)

object ReopenPullRequestInput {

  implicit val encoder: ArgEncoder[ReopenPullRequestInput] = new ArgEncoder[ReopenPullRequestInput] {

    override def encode(value: ReopenPullRequestInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

