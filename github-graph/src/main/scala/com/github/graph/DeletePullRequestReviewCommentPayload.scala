package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeletePullRequestReviewCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeletePullRequestReviewCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The pull request review the deleted comment belonged to.
    */
  def pullRequestReview[A](
    innerSelection: SelectionBuilder[PullRequestReview, A]
  ): SelectionBuilder[DeletePullRequestReviewCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))
}

