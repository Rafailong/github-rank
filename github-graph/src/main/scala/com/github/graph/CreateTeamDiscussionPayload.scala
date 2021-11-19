package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateTeamDiscussionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateTeamDiscussionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new discussion.
    */
  def teamDiscussion[A](innerSelection: SelectionBuilder[TeamDiscussion, A]): SelectionBuilder[CreateTeamDiscussionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("teamDiscussion", OptionOf(Obj(innerSelection)))
}

