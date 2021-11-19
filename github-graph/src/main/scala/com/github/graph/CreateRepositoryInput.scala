package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateRepositoryInput(
  clientMutationId: Option[String]  = None,
  description: Option[String]       = None,
  hasIssuesEnabled: Option[Boolean] = None,
  hasWikiEnabled: Option[Boolean]   = None,
  homepageUrl: Option[URI]          = None,
  name: String,
  ownerId: Option[String]   = None,
  teamId: Option[String]    = None,
  template: Option[Boolean] = None,
  visibility: RepositoryVisibility
)

object CreateRepositoryInput {

  implicit val encoder: ArgEncoder[CreateRepositoryInput] = new ArgEncoder[CreateRepositoryInput] {

    override def encode(value: CreateRepositoryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "hasIssuesEnabled" -> value.hasIssuesEnabled.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "hasWikiEnabled"   -> value.hasWikiEnabled.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "homepageUrl"      -> value.homepageUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[URI]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "ownerId"          -> value.ownerId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "teamId"           -> value.teamId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "template"         -> value.template.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "visibility"       -> implicitly[ArgEncoder[RepositoryVisibility]].encode(value.visibility)
        )
      )
  }
}

