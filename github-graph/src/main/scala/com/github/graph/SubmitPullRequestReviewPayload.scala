package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SubmitPullRequestReviewPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[SubmitPullRequestReviewPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The submitted pull request review.
    */
  def pullRequestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[SubmitPullRequestReviewPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))
}

