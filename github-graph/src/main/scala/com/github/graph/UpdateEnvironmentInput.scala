package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnvironmentInput(
  clientMutationId: Option[String] = None,
  environmentId: String,
  reviewers: Option[List[String]] = None,
  waitTimer: Option[Int]          = None
)

object UpdateEnvironmentInput {

  implicit val encoder: ArgEncoder[UpdateEnvironmentInput] = new ArgEncoder[UpdateEnvironmentInput] {

    override def encode(value: UpdateEnvironmentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "environmentId"    -> implicitly[ArgEncoder[String]].encode(value.environmentId),
          "reviewers" -> value.reviewers.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "waitTimer" -> value.waitTimer.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value))
        )
      )
  }
}

