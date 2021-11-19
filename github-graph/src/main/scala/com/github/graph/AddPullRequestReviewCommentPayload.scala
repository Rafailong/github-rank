package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddPullRequestReviewCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddPullRequestReviewCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created comment.
    */
  def comment[A](innerSelection: SelectionBuilder[PullRequestReviewComment, A]): SelectionBuilder[AddPullRequestReviewCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("comment", OptionOf(Obj(innerSelection)))

  /** The edge from the review's comment connection.
    */
  def commentEdge[A](
    innerSelection: SelectionBuilder[PullRequestReviewCommentEdge, A]
  ): SelectionBuilder[AddPullRequestReviewCommentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commentEdge", OptionOf(Obj(innerSelection)))
}

