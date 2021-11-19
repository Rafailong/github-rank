package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AcceptTopicSuggestionInput(clientMutationId: Option[String] = None, name: String, repositoryId: String)

object AcceptTopicSuggestionInput {

  implicit val encoder: ArgEncoder[AcceptTopicSuggestionInput] = new ArgEncoder[AcceptTopicSuggestionInput] {

    override def encode(value: AcceptTopicSuggestionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

