package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ResolveReviewThreadPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ResolveReviewThreadPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The thread to resolve.
    */
  def thread[A](innerSelection: SelectionBuilder[PullRequestReviewThread, A]): SelectionBuilder[ResolveReviewThreadPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("thread", OptionOf(Obj(innerSelection)))
}

