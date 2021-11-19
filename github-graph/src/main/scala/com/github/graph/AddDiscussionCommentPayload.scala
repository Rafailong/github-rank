package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddDiscussionCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddDiscussionCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created discussion comment.
    */
  def comment[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[AddDiscussionCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("comment", OptionOf(Obj(innerSelection)))
}

