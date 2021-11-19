package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveLabelsFromLabelableInput(clientMutationId: Option[String] = None, labelIds: List[String] = Nil, labelableId: String)

object RemoveLabelsFromLabelableInput {

  implicit val encoder: ArgEncoder[RemoveLabelsFromLabelableInput] = new ArgEncoder[RemoveLabelsFromLabelableInput] {

    override def encode(value: RemoveLabelsFromLabelableInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "labelIds"         -> __ListValue(value.labelIds.map(value => implicitly[ArgEncoder[String]].encode(value))),
          "labelableId"      -> implicitly[ArgEncoder[String]].encode(value.labelableId)
        )
      )
  }
}

