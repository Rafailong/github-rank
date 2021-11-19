package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateProjectCardInput(
  clientMutationId: Option[String] = None,
  isArchived: Option[Boolean]      = None,
  note: Option[String]             = None,
  projectCardId: String
)

object UpdateProjectCardInput {

  implicit val encoder: ArgEncoder[UpdateProjectCardInput] = new ArgEncoder[UpdateProjectCardInput] {

    override def encode(value: UpdateProjectCardInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "isArchived"       -> value.isArchived.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "note"             -> value.note.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectCardId"    -> implicitly[ArgEncoder[String]].encode(value.projectCardId)
        )
      )
  }
}

