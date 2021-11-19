package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ArchiveRepositoryInput(clientMutationId: Option[String] = None, repositoryId: String)

object ArchiveRepositoryInput {

  implicit val encoder: ArgEncoder[ArchiveRepositoryInput] = new ArgEncoder[ArchiveRepositoryInput] {

    override def encode(value: ArchiveRepositoryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

