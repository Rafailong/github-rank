package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateContentAttachmentInput(body: String, clientMutationId: Option[String] = None, contentReferenceId: String, title: String)

object CreateContentAttachmentInput {

  implicit val encoder: ArgEncoder[CreateContentAttachmentInput] = new ArgEncoder[CreateContentAttachmentInput] {

    override def encode(value: CreateContentAttachmentInput): __Value =
      __ObjectValue(
        List(
          "body"               -> implicitly[ArgEncoder[String]].encode(value.body),
          "clientMutationId"   -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "contentReferenceId" -> implicitly[ArgEncoder[String]].encode(value.contentReferenceId),
          "title"              -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

