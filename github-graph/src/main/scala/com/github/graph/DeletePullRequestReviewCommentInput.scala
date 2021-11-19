package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeletePullRequestReviewCommentInput(clientMutationId: Option[String] = None, id: String)

object DeletePullRequestReviewCommentInput {

  implicit val encoder: ArgEncoder[DeletePullRequestReviewCommentInput] = new ArgEncoder[DeletePullRequestReviewCommentInput] {

    override def encode(value: DeletePullRequestReviewCommentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

