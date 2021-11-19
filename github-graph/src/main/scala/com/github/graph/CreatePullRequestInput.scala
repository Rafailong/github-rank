package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreatePullRequestInput(
  baseRefName: String,
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  draft: Option[Boolean]           = None,
  headRefName: String,
  maintainerCanModify: Option[Boolean] = None,
  repositoryId: String,
  title: String
)

object CreatePullRequestInput {

  implicit val encoder: ArgEncoder[CreatePullRequestInput] = new ArgEncoder[CreatePullRequestInput] {

    override def encode(value: CreatePullRequestInput): __Value =
      __ObjectValue(
        List(
          "baseRefName"         -> implicitly[ArgEncoder[String]].encode(value.baseRefName),
          "body"                -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "draft"               -> value.draft.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "headRefName"         -> implicitly[ArgEncoder[String]].encode(value.headRefName),
          "maintainerCanModify" -> value.maintainerCanModify.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "repositoryId"        -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "title"               -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

