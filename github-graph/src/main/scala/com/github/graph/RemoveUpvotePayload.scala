package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveUpvotePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveUpvotePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The votable subject.
    */
  def subject[A](
    onDiscussion: Option[SelectionBuilder[Discussion, A]]               = None,
    onDiscussionComment: Option[SelectionBuilder[DiscussionComment, A]] = None
  ): SelectionBuilder[RemoveUpvotePayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "subject",
    OptionOf(ChoiceOf(Map("Discussion" -> onDiscussion, "DiscussionComment" -> onDiscussionComment).collect { case (k, Some(v)) => k -> Obj(v) }))
  )
}

