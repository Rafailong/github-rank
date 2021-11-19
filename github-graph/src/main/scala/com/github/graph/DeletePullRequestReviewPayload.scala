package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeletePullRequestReviewPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeletePullRequestReviewPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The deleted pull request review.
    */
  def pullRequestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[DeletePullRequestReviewPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))
}

