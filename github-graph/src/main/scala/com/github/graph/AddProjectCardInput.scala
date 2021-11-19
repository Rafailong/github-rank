package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddProjectCardInput(
  clientMutationId: Option[String] = None,
  contentId: Option[String]        = None,
  note: Option[String]             = None,
  projectColumnId: String
)

object AddProjectCardInput {

  implicit val encoder: ArgEncoder[AddProjectCardInput] = new ArgEncoder[AddProjectCardInput] {

    override def encode(value: AddProjectCardInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "contentId"        -> value.contentId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "note"             -> value.note.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectColumnId"  -> implicitly[ArgEncoder[String]].encode(value.projectColumnId)
        )
      )
  }
}

