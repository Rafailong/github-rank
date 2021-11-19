package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateTeamDiscussionCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateTeamDiscussionCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated comment.
    */
  def teamDiscussionComment[A](
    innerSelection: SelectionBuilder[TeamDiscussionComment, A]
  ): SelectionBuilder[UpdateTeamDiscussionCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("teamDiscussionComment", OptionOf(Obj(innerSelection)))
}

