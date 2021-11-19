package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddProjectColumnInput(clientMutationId: Option[String] = None, name: String, projectId: String)

object AddProjectColumnInput {

  implicit val encoder: ArgEncoder[AddProjectColumnInput] = new ArgEncoder[AddProjectColumnInput] {

    override def encode(value: AddProjectColumnInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId)
        )
      )
  }
}

