package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateLabelInput(
  clientMutationId: Option[String] = None,
  color: String,
  description: Option[String] = None,
  name: String,
  repositoryId: String
)

object CreateLabelInput {

  implicit val encoder: ArgEncoder[CreateLabelInput] = new ArgEncoder[CreateLabelInput] {

    override def encode(value: CreateLabelInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "color"            -> implicitly[ArgEncoder[String]].encode(value.color),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

