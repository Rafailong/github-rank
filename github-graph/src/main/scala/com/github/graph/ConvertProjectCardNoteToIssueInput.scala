package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ConvertProjectCardNoteToIssueInput(
  body: Option[String]             = None,
  clientMutationId: Option[String] = None,
  projectCardId: String,
  repositoryId: String,
  title: Option[String] = None
)

object ConvertProjectCardNoteToIssueInput {

  implicit val encoder: ArgEncoder[ConvertProjectCardNoteToIssueInput] = new ArgEncoder[ConvertProjectCardNoteToIssueInput] {

    override def encode(value: ConvertProjectCardNoteToIssueInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectCardId"    -> implicitly[ArgEncoder[String]].encode(value.projectCardId),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "title"            -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

