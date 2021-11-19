package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateTeamDiscussionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateTeamDiscussionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated discussion.
    */
  def teamDiscussion[A](innerSelection: SelectionBuilder[TeamDiscussion, A]): SelectionBuilder[UpdateTeamDiscussionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("teamDiscussion", OptionOf(Obj(innerSelection)))
}

