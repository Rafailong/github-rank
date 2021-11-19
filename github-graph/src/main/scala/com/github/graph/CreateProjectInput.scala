package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateProjectInput(
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  name: String,
  ownerId: String,
  repositoryIds: Option[List[String]] = None,
  template: Option[ProjectTemplate]   = None
)

object CreateProjectInput {

  implicit val encoder: ArgEncoder[CreateProjectInput] = new ArgEncoder[CreateProjectInput] {

    override def encode(value: CreateProjectInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId),
          "repositoryIds" -> value.repositoryIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "template" -> value.template.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[ProjectTemplate]].encode(value))
        )
      )
  }
}

