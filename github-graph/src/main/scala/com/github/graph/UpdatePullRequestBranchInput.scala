package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdatePullRequestBranchInput(
  clientMutationId: Option[String]     = None,
  expectedHeadOid: Option[GitObjectID] = None,
  pullRequestId: String
)

object UpdatePullRequestBranchInput {

  implicit val encoder: ArgEncoder[UpdatePullRequestBranchInput] = new ArgEncoder[UpdatePullRequestBranchInput] {

    override def encode(value: UpdatePullRequestBranchInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expectedHeadOid"  -> value.expectedHeadOid.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[GitObjectID]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

