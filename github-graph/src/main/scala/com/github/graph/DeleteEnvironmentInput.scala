package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteEnvironmentInput(clientMutationId: Option[String] = None, id: String)

object DeleteEnvironmentInput {

  implicit val encoder: ArgEncoder[DeleteEnvironmentInput] = new ArgEncoder[DeleteEnvironmentInput] {

    override def encode(value: DeleteEnvironmentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

