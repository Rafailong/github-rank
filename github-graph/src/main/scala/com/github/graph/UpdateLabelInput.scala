package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateLabelInput(
  clientMutationId: Option[String] = None,
  color: Option[String]            = None,
  description: Option[String]      = None,
  id: String,
  name: Option[String] = None
)

object UpdateLabelInput {

  implicit val encoder: ArgEncoder[UpdateLabelInput] = new ArgEncoder[UpdateLabelInput] {

    override def encode(value: UpdateLabelInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "color"            -> value.color.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id),
          "name"             -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

