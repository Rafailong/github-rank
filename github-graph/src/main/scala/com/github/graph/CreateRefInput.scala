package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateRefInput(clientMutationId: Option[String] = None, name: String, oid: GitObjectID, repositoryId: String)

object CreateRefInput {

  implicit val encoder: ArgEncoder[CreateRefInput] = new ArgEncoder[CreateRefInput] {

    override def encode(value: CreateRefInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "oid"              -> implicitly[ArgEncoder[GitObjectID]].encode(value.oid),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

