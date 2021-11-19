package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateDiscussionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateDiscussionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The modified discussion.
    */
  def discussion[A](innerSelection: SelectionBuilder[Discussion, A]): SelectionBuilder[UpdateDiscussionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("discussion", OptionOf(Obj(innerSelection)))
}

