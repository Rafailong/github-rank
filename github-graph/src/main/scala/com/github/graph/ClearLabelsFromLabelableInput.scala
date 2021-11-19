package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ClearLabelsFromLabelableInput(clientMutationId: Option[String] = None, labelableId: String)

object ClearLabelsFromLabelableInput {

  implicit val encoder: ArgEncoder[ClearLabelsFromLabelableInput] = new ArgEncoder[ClearLabelsFromLabelableInput] {

    override def encode(value: ClearLabelsFromLabelableInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "labelableId"      -> implicitly[ArgEncoder[String]].encode(value.labelableId)
        )
      )
  }
}

