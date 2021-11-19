package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateRepositoryInput(
  clientMutationId: Option[String]    = None,
  description: Option[String]         = None,
  hasIssuesEnabled: Option[Boolean]   = None,
  hasProjectsEnabled: Option[Boolean] = None,
  hasWikiEnabled: Option[Boolean]     = None,
  homepageUrl: Option[URI]            = None,
  name: Option[String]                = None,
  repositoryId: String,
  template: Option[Boolean] = None
)

object UpdateRepositoryInput {

  implicit val encoder: ArgEncoder[UpdateRepositoryInput] = new ArgEncoder[UpdateRepositoryInput] {

    override def encode(value: UpdateRepositoryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"   -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"        -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "hasIssuesEnabled"   -> value.hasIssuesEnabled.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "hasProjectsEnabled" -> value.hasProjectsEnabled.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "hasWikiEnabled"     -> value.hasWikiEnabled.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "homepageUrl"        -> value.homepageUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[URI]].encode(value)),
          "name"               -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"       -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "template"           -> value.template.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value))
        )
      )
  }
}

