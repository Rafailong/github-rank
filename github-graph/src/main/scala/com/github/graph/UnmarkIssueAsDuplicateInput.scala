package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnmarkIssueAsDuplicateInput(canonicalId: String, clientMutationId: Option[String] = None, duplicateId: String)

object UnmarkIssueAsDuplicateInput {

  implicit val encoder: ArgEncoder[UnmarkIssueAsDuplicateInput] = new ArgEncoder[UnmarkIssueAsDuplicateInput] {

    override def encode(value: UnmarkIssueAsDuplicateInput): __Value =
      __ObjectValue(
        List(
          "canonicalId"      -> implicitly[ArgEncoder[String]].encode(value.canonicalId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "duplicateId"      -> implicitly[ArgEncoder[String]].encode(value.duplicateId)
        )
      )
  }
}

