package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteLabelInput(clientMutationId: Option[String] = None, id: String)

object DeleteLabelInput {

  implicit val encoder: ArgEncoder[DeleteLabelInput] = new ArgEncoder[DeleteLabelInput] {

    override def encode(value: DeleteLabelInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

