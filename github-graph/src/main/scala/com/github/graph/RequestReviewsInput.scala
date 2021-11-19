package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RequestReviewsInput(
  clientMutationId: Option[String] = None,
  pullRequestId: String,
  teamIds: Option[List[String]] = None,
  union: Option[Boolean]        = None,
  userIds: Option[List[String]] = None
)

object RequestReviewsInput {

  implicit val encoder: ArgEncoder[RequestReviewsInput] = new ArgEncoder[RequestReviewsInput] {

    override def encode(value: RequestReviewsInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId),
          "teamIds" -> value.teamIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "union" -> value.union.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "userIds" -> value.userIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          )
        )
      )
  }
}

