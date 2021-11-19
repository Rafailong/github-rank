package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddPullRequestReviewThreadInput(
  body: String,
  clientMutationId: Option[String] = None,
  line: Int,
  path: String,
  pullRequestId: Option[String]       = None,
  pullRequestReviewId: Option[String] = None,
  side: Option[DiffSide]              = None,
  startLine: Option[Int]              = None,
  startSide: Option[DiffSide]         = None
)

object AddPullRequestReviewThreadInput {

  implicit val encoder: ArgEncoder[AddPullRequestReviewThreadInput] = new ArgEncoder[AddPullRequestReviewThreadInput] {

    override def encode(value: AddPullRequestReviewThreadInput): __Value =
      __ObjectValue(
        List(
          "body"                -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "line"                -> implicitly[ArgEncoder[Int]].encode(value.line),
          "path"                -> implicitly[ArgEncoder[String]].encode(value.path),
          "pullRequestId"       -> value.pullRequestId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestReviewId" -> value.pullRequestReviewId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "side"                -> value.side.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DiffSide]].encode(value)),
          "startLine"           -> value.startLine.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "startSide"           -> value.startSide.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DiffSide]].encode(value))
        )
      )
  }
}

