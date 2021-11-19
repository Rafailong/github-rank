package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddPullRequestReviewInput(
  body: Option[String]                                          = None,
  clientMutationId: Option[String]                              = None,
  comments: Option[List[Option[DraftPullRequestReviewComment]]] = None,
  commitOID: Option[GitObjectID]                                = None,
  event: Option[PullRequestReviewEvent]                         = None,
  pullRequestId: String,
  threads: Option[List[Option[DraftPullRequestReviewThread]]] = None
)

object AddPullRequestReviewInput {

  implicit val encoder: ArgEncoder[AddPullRequestReviewInput] = new ArgEncoder[AddPullRequestReviewInput] {

    override def encode(value: AddPullRequestReviewInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "comments" -> value.comments.fold(__NullValue: __Value)(value =>
            __ListValue(
              value.map(value => value.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DraftPullRequestReviewComment]].encode(value)))
            )
          ),
          "commitOID"     -> value.commitOID.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[GitObjectID]].encode(value)),
          "event"         -> value.event.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PullRequestReviewEvent]].encode(value)),
          "pullRequestId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestId),
          "threads" -> value.threads.fold(__NullValue: __Value)(value =>
            __ListValue(
              value.map(value => value.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DraftPullRequestReviewThread]].encode(value)))
            )
          )
        )
      )
  }
}

