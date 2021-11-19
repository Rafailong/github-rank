package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CloneTemplateRepositoryInput(
  clientMutationId: Option[String]    = None,
  description: Option[String]         = None,
  includeAllBranches: Option[Boolean] = None,
  name: String,
  ownerId: String,
  repositoryId: String,
  visibility: RepositoryVisibility
)

object CloneTemplateRepositoryInput {

  implicit val encoder: ArgEncoder[CloneTemplateRepositoryInput] = new ArgEncoder[CloneTemplateRepositoryInput] {

    override def encode(value: CloneTemplateRepositoryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"   -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"        -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "includeAllBranches" -> value.includeAllBranches.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "name"               -> implicitly[ArgEncoder[String]].encode(value.name),
          "ownerId"            -> implicitly[ArgEncoder[String]].encode(value.ownerId),
          "repositoryId"       -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "visibility"         -> implicitly[ArgEncoder[RepositoryVisibility]].encode(value.visibility)
        )
      )
  }
}

