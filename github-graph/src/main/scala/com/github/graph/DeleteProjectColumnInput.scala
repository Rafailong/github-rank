package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteProjectColumnInput(clientMutationId: Option[String] = None, columnId: String)

object DeleteProjectColumnInput {

  implicit val encoder: ArgEncoder[DeleteProjectColumnInput] = new ArgEncoder[DeleteProjectColumnInput] {

    override def encode(value: DeleteProjectColumnInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "columnId"         -> implicitly[ArgEncoder[String]].encode(value.columnId)
        )
      )
  }
}

