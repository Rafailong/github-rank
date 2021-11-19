package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateDiscussionCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateDiscussionCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The modified discussion comment.
    */
  def comment[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[UpdateDiscussionCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("comment", OptionOf(Obj(innerSelection)))
}

