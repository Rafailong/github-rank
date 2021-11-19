package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateProjectColumnInput(clientMutationId: Option[String] = None, name: String, projectColumnId: String)

object UpdateProjectColumnInput {

  implicit val encoder: ArgEncoder[UpdateProjectColumnInput] = new ArgEncoder[UpdateProjectColumnInput] {

    override def encode(value: UpdateProjectColumnInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "projectColumnId"  -> implicitly[ArgEncoder[String]].encode(value.projectColumnId)
        )
      )
  }
}

