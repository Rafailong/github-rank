package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DismissPullRequestReviewInput(clientMutationId: Option[String] = None, message: String, pullRequestReviewId: String)

object DismissPullRequestReviewInput {

  implicit val encoder: ArgEncoder[DismissPullRequestReviewInput] = new ArgEncoder[DismissPullRequestReviewInput] {

    override def encode(value: DismissPullRequestReviewInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "message"             -> implicitly[ArgEncoder[String]].encode(value.message),
          "pullRequestReviewId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestReviewId)
        )
      )
  }
}

