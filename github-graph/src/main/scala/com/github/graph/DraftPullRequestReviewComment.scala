package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DraftPullRequestReviewComment(body: String, path: String, position: Int)

object DraftPullRequestReviewComment {

  implicit val encoder: ArgEncoder[DraftPullRequestReviewComment] = new ArgEncoder[DraftPullRequestReviewComment] {

    override def encode(value: DraftPullRequestReviewComment): __Value =
      __ObjectValue(
        List(
          "body"     -> implicitly[ArgEncoder[String]].encode(value.body),
          "path"     -> implicitly[ArgEncoder[String]].encode(value.path),
          "position" -> implicitly[ArgEncoder[Int]].encode(value.position)
        )
      )
  }
}

