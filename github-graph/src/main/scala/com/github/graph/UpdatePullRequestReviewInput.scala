package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdatePullRequestReviewInput(body: String, clientMutationId: Option[String] = None, pullRequestReviewId: String)

object UpdatePullRequestReviewInput {

  implicit val encoder: ArgEncoder[UpdatePullRequestReviewInput] = new ArgEncoder[UpdatePullRequestReviewInput] {

    override def encode(value: UpdatePullRequestReviewInput): __Value =
      __ObjectValue(
        List(
          "body"                -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestReviewId)
        )
      )
  }
}

