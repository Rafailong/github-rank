package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateDiscussionInput(body: String, categoryId: String, clientMutationId: Option[String] = None, repositoryId: String, title: String)

object CreateDiscussionInput {

  implicit val encoder: ArgEncoder[CreateDiscussionInput] = new ArgEncoder[CreateDiscussionInput] {

    override def encode(value: CreateDiscussionInput): __Value =
      __ObjectValue(
        List(
          "body"             -> implicitly[ArgEncoder[String]].encode(value.body),
          "categoryId"       -> implicitly[ArgEncoder[String]].encode(value.categoryId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "title"            -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

