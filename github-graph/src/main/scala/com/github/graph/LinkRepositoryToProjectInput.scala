package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class LinkRepositoryToProjectInput(clientMutationId: Option[String] = None, projectId: String, repositoryId: String)

object LinkRepositoryToProjectInput {

  implicit val encoder: ArgEncoder[LinkRepositoryToProjectInput] = new ArgEncoder[LinkRepositoryToProjectInput] {

    override def encode(value: LinkRepositoryToProjectInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

