package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateTeamDiscussionCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateTeamDiscussionCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new comment.
    */
  def teamDiscussionComment[A](
    innerSelection: SelectionBuilder[TeamDiscussionComment, A]
  ): SelectionBuilder[CreateTeamDiscussionCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("teamDiscussionComment", OptionOf(Obj(innerSelection)))
}

