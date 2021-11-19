package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateProjectNextItemFieldInput(
  clientMutationId: Option[String] = None,
  fieldId: String,
  itemId: String,
  projectId: String,
  value: String
)

object UpdateProjectNextItemFieldInput {

  implicit val encoder: ArgEncoder[UpdateProjectNextItemFieldInput] = new ArgEncoder[UpdateProjectNextItemFieldInput] {

    override def encode(value: UpdateProjectNextItemFieldInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "fieldId"          -> implicitly[ArgEncoder[String]].encode(value.fieldId),
          "itemId"           -> implicitly[ArgEncoder[String]].encode(value.itemId),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId),
          "value"            -> implicitly[ArgEncoder[String]].encode(value.value)
        )
      )
  }
}

