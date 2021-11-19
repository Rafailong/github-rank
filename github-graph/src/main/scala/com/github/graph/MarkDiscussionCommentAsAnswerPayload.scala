package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MarkDiscussionCommentAsAnswerPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[MarkDiscussionCommentAsAnswerPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The discussion that includes the chosen comment.
    */
  def discussion[A](innerSelection: SelectionBuilder[Discussion, A]): SelectionBuilder[MarkDiscussionCommentAsAnswerPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("discussion", OptionOf(Obj(innerSelection)))
}

