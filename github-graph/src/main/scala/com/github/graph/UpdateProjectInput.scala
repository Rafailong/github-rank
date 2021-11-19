package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateProjectInput(
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  name: Option[String]             = None,
  projectId: String,
  public: Option[Boolean]     = None,
  state: Option[ProjectState] = None
)

object UpdateProjectInput {

  implicit val encoder: ArgEncoder[UpdateProjectInput] = new ArgEncoder[UpdateProjectInput] {

    override def encode(value: UpdateProjectInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId),
          "public"           -> value.public.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "state"            -> value.state.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[ProjectState]].encode(value))
        )
      )
  }
}

