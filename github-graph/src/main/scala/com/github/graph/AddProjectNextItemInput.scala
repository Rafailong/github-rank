package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddProjectNextItemInput(clientMutationId: Option[String] = None, contentId: String, projectId: String)

object AddProjectNextItemInput {

  implicit val encoder: ArgEncoder[AddProjectNextItemInput] = new ArgEncoder[AddProjectNextItemInput] {

    override def encode(value: AddProjectNextItemInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "contentId"        -> implicitly[ArgEncoder[String]].encode(value.contentId),
          "projectId"        -> implicitly[ArgEncoder[String]].encode(value.projectId)
        )
      )
  }
}

