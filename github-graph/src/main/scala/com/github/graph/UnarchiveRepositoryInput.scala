package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnarchiveRepositoryInput(clientMutationId: Option[String] = None, repositoryId: String)

object UnarchiveRepositoryInput {

  implicit val encoder: ArgEncoder[UnarchiveRepositoryInput] = new ArgEncoder[UnarchiveRepositoryInput] {

    override def encode(value: UnarchiveRepositoryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

