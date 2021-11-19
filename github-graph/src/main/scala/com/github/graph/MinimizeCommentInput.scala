package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MinimizeCommentInput(classifier: ReportedContentClassifiers, clientMutationId: Option[String] = None, subjectId: String)

object MinimizeCommentInput {

  implicit val encoder: ArgEncoder[MinimizeCommentInput] = new ArgEncoder[MinimizeCommentInput] {

    override def encode(value: MinimizeCommentInput): __Value =
      __ObjectValue(
        List(
          "classifier"       -> implicitly[ArgEncoder[ReportedContentClassifiers]].encode(value.classifier),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "subjectId"        -> implicitly[ArgEncoder[String]].encode(value.subjectId)
        )
      )
  }
}

