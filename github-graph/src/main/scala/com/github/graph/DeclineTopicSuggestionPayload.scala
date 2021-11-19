package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeclineTopicSuggestionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeclineTopicSuggestionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The declined topic.
    */
  def topic[A](innerSelection: SelectionBuilder[Topic, A]): SelectionBuilder[DeclineTopicSuggestionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("topic", OptionOf(Obj(innerSelection)))
}

