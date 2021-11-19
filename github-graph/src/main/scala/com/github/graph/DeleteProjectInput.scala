package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteProjectInput(clientMutationId: Option[String] = None, projectId: String)

object DeleteProjectInput {

  implicit val encoder: ArgEncoder[DeleteProjectInput] = new ArgEncoder[DeleteProjectInput] {

    override def encode(value: DeleteProjectInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId)
        )
      )
  }
}

