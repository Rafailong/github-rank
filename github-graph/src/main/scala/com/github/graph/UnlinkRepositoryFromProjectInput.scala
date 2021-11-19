package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnlinkRepositoryFromProjectInput(clientMutationId: Option[String] = None, projectId: String, repositoryId: String)

object UnlinkRepositoryFromProjectInput {

  implicit val encoder: ArgEncoder[UnlinkRepositoryFromProjectInput] = new ArgEncoder[UnlinkRepositoryFromProjectInput] {

    override def encode(value: UnlinkRepositoryFromProjectInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

