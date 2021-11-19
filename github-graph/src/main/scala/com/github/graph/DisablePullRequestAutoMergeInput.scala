package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DisablePullRequestAutoMergeInput(clientMutationId: Option[String] = None, pullRequestId: String)

object DisablePullRequestAutoMergeInput {

  implicit val encoder: ArgEncoder[DisablePullRequestAutoMergeInput] = new ArgEncoder[DisablePullRequestAutoMergeInput] {

    override def encode(value: DisablePullRequestAutoMergeInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

