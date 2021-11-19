package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DraftPullRequestReviewThread(
  body: String,
  line: Int,
  path: String,
  side: Option[DiffSide]      = None,
  startLine: Option[Int]      = None,
  startSide: Option[DiffSide] = None
)

object DraftPullRequestReviewThread {

  implicit val encoder: ArgEncoder[DraftPullRequestReviewThread] = new ArgEncoder[DraftPullRequestReviewThread] {

    override def encode(value: DraftPullRequestReviewThread): __Value =
      __ObjectValue(
        List(
          "body"      -> implicitly[ArgEncoder[String]].encode(value.body),
          "line"      -> implicitly[ArgEncoder[Int]].encode(value.line),
          "path"      -> implicitly[ArgEncoder[String]].encode(value.path),
          "side"      -> value.side.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DiffSide]].encode(value)),
          "startLine" -> value.startLine.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "startSide" -> value.startSide.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DiffSide]].encode(value))
        )
      )
  }
}

