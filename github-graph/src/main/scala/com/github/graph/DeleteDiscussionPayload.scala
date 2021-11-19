package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteDiscussionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteDiscussionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The discussion that was just deleted.
    */
  def discussion[A](innerSelection: SelectionBuilder[Discussion, A]): SelectionBuilder[DeleteDiscussionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("discussion", OptionOf(Obj(innerSelection)))
}

