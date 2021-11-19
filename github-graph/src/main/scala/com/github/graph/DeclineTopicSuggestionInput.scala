package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeclineTopicSuggestionInput(
  clientMutationId: Option[String] = None,
  name: String,
  reason: TopicSuggestionDeclineReason,
  repositoryId: String
)

object DeclineTopicSuggestionInput {

  implicit val encoder: ArgEncoder[DeclineTopicSuggestionInput] = new ArgEncoder[DeclineTopicSuggestionInput] {

    override def encode(value: DeclineTopicSuggestionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "reason"           -> implicitly[ArgEncoder[TopicSuggestionDeclineReason]].encode(value.reason),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

