package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdatePullRequestReviewCommentInput(body: String, clientMutationId: Option[String] = None, pullRequestReviewCommentId: String)

object UpdatePullRequestReviewCommentInput {

  implicit val encoder: ArgEncoder[UpdatePullRequestReviewCommentInput] = new ArgEncoder[UpdatePullRequestReviewCommentInput] {

    override def encode(value: UpdatePullRequestReviewCommentInput): __Value =
      __ObjectValue(
        List(
          "body"                       -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId"           -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewCommentId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestReviewCommentId)
        )
      )
  }
}

