package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MarkFileAsViewedInput(clientMutationId: Option[String] = None, path: String, pullRequestId: String)

object MarkFileAsViewedInput {

  implicit val encoder: ArgEncoder[MarkFileAsViewedInput] = new ArgEncoder[MarkFileAsViewedInput] {

    override def encode(value: MarkFileAsViewedInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "path"             -> implicitly[ArgEncoder[String]].encode(value.path),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

