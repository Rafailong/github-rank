package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MarkPullRequestReadyForReviewInput(clientMutationId: Option[String] = None, pullRequestId: String)

object MarkPullRequestReadyForReviewInput {

  implicit val encoder: ArgEncoder[MarkPullRequestReadyForReviewInput] = new ArgEncoder[MarkPullRequestReadyForReviewInput] {

    override def encode(value: MarkPullRequestReadyForReviewInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

