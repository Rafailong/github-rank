package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteDiscussionCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteDiscussionCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The discussion comment that was just deleted.
    */
  def comment[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[DeleteDiscussionCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("comment", OptionOf(Obj(innerSelection)))
}

