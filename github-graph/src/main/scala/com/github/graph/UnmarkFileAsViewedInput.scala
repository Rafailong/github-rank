package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnmarkFileAsViewedInput(clientMutationId: Option[String] = None, path: String, pullRequestId: String)

object UnmarkFileAsViewedInput {

  implicit val encoder: ArgEncoder[UnmarkFileAsViewedInput] = new ArgEncoder[UnmarkFileAsViewedInput] {

    override def encode(value: UnmarkFileAsViewedInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "path"             -> implicitly[ArgEncoder[String]].encode(value.path),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

