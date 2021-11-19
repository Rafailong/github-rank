package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddPullRequestReviewCommentInput(
  body: String,
  clientMutationId: Option[String]    = None,
  commitOID: Option[GitObjectID]      = None,
  inReplyTo: Option[String]           = None,
  path: Option[String]                = None,
  position: Option[Int]               = None,
  pullRequestId: Option[String]       = None,
  pullRequestReviewId: Option[String] = None
)

object AddPullRequestReviewCommentInput {

  implicit val encoder: ArgEncoder[AddPullRequestReviewCommentInput] = new ArgEncoder[AddPullRequestReviewCommentInput] {

    override def encode(value: AddPullRequestReviewCommentInput): __Value =
      __ObjectValue(
        List(
          "body"                -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitOID"           -> value.commitOID.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[GitObjectID]].encode(value)),
          "inReplyTo"           -> value.inReplyTo.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "path"                -> value.path.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "position"            -> value.position.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "pullRequestId"       -> value.pullRequestId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewId" -> value.pullRequestReviewId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

