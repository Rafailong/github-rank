package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ConvertPullRequestToDraftInput(clientMutationId: Option[String] = None, pullRequestId: String)

object ConvertPullRequestToDraftInput {

  implicit val encoder: ArgEncoder[ConvertPullRequestToDraftInput] = new ArgEncoder[ConvertPullRequestToDraftInput] {

    override def encode(value: ConvertPullRequestToDraftInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

