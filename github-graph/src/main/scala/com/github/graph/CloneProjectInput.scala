package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CloneProjectInput(
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  includeWorkflows: Boolean,
  name: String,
  public: Option[Boolean] = None,
  sourceId: String,
  targetOwnerId: String
)

object CloneProjectInput {

  implicit val encoder: ArgEncoder[CloneProjectInput] = new ArgEncoder[CloneProjectInput] {

    override def encode(value: CloneProjectInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "includeWorkflows" -> implicitly[ArgEncoder[Boolean]].encode(value.includeWorkflows),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "public"           -> value.public.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "sourceId"         -> implicitly[ArgEncoder[String]].encode(value.sourceId),
          "targetOwnerId"    -> implicitly[ArgEncoder[String]].encode(value.targetOwnerId)
        )
      )
  }
}

