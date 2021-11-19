package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeletePullRequestReviewInput(clientMutationId: Option[String] = None, pullRequestReviewId: String)

object DeletePullRequestReviewInput {

  implicit val encoder: ArgEncoder[DeletePullRequestReviewInput] = new ArgEncoder[DeletePullRequestReviewInput] {

    override def encode(value: DeletePullRequestReviewInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestReviewId)
        )
      )
  }
}

