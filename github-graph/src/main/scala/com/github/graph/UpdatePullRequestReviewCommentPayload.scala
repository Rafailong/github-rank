package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdatePullRequestReviewCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdatePullRequestReviewCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated comment.
    */
  def pullRequestReviewComment[A](
    innerSelection: SelectionBuilder[PullRequestReviewComment, A]
  ): SelectionBuilder[UpdatePullRequestReviewCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReviewComment", OptionOf(Obj(innerSelection)))
}

