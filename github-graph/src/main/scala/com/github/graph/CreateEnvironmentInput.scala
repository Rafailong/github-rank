package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateEnvironmentInput(clientMutationId: Option[String] = None, name: String, repositoryId: String)

object CreateEnvironmentInput {

  implicit val encoder: ArgEncoder[CreateEnvironmentInput] = new ArgEncoder[CreateEnvironmentInput] {

    override def encode(value: CreateEnvironmentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

