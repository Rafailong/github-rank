package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DismissPullRequestReviewPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DismissPullRequestReviewPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The dismissed pull request review.
    */
  def pullRequestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[DismissPullRequestReviewPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))
}

