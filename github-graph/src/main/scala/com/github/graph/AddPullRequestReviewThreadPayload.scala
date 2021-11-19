package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddPullRequestReviewThreadPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddPullRequestReviewThreadPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created thread.
    */
  def thread[A](innerSelection: SelectionBuilder[PullRequestReviewThread, A]): SelectionBuilder[AddPullRequestReviewThreadPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("thread", OptionOf(Obj(innerSelection)))
}

