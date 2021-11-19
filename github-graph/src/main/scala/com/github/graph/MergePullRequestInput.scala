package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MergePullRequestInput(
  authorEmail: Option[String]                 = None,
  clientMutationId: Option[String]            = None,
  commitBody: Option[String]                  = None,
  commitHeadline: Option[String]              = None,
  expectedHeadOid: Option[GitObjectID]        = None,
  mergeMethod: Option[PullRequestMergeMethod] = None,
  pullRequestId: String
)

object MergePullRequestInput {

  implicit val encoder: ArgEncoder[MergePullRequestInput] = new ArgEncoder[MergePullRequestInput] {

    override def encode(value: MergePullRequestInput): __Value =
      __ObjectValue(
        List(
          "authorEmail"      -> value.authorEmail.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitBody"       -> value.commitBody.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitHeadline"   -> value.commitHeadline.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expectedHeadOid"  -> value.expectedHeadOid.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[GitObjectID]].encode(value)),
          "mergeMethod"      -> value.mergeMethod.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PullRequestMergeMethod]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

