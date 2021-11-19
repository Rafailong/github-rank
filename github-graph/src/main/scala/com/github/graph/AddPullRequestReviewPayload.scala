package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddPullRequestReviewPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddPullRequestReviewPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created pull request review.
    */
  def pullRequestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[AddPullRequestReviewPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))

  /** The edge from the pull request's review connection.
    */
  def reviewEdge[A](innerSelection: SelectionBuilder[PullRequestReviewEdge, A]): SelectionBuilder[AddPullRequestReviewPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("reviewEdge", OptionOf(Obj(innerSelection)))
}

