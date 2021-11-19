package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AcceptTopicSuggestionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AcceptTopicSuggestionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The accepted topic.
    */
  def topic[A](innerSelection: SelectionBuilder[Topic, A]): SelectionBuilder[AcceptTopicSuggestionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("topic", OptionOf(Obj(innerSelection)))
}

