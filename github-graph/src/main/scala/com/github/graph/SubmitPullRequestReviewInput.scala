package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SubmitPullRequestReviewInput(
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  event: PullRequestReviewEvent,
  pullRequestId: Option[String]       = None,
  pullRequestReviewId: Option[String] = None
)

object SubmitPullRequestReviewInput {

  implicit val encoder: ArgEncoder[SubmitPullRequestReviewInput] = new ArgEncoder[SubmitPullRequestReviewInput] {

    override def encode(value: SubmitPullRequestReviewInput): __Value =
      __ObjectValue(
        List(
          "body"                -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "event"               -> implicitly[ArgEncoder[PullRequestReviewEvent]].encode(value.event),
          "pullRequestId"       -> value.pullRequestId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewId" -> value.pullRequestReviewId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

