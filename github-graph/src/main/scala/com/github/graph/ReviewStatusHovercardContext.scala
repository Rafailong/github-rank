package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReviewStatusHovercardContext {

  /** A string describing this context
    */
  def message: SelectionBuilder[ReviewStatusHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** An octicon to accompany this context
    */
  def octicon: SelectionBuilder[ReviewStatusHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("octicon", Scalar())

  /** The current status of the pull request with respect to code review.
    */
  def reviewDecision: SelectionBuilder[ReviewStatusHovercardContext, Option[PullRequestReviewDecision]] =
    _root_.caliban.client.SelectionBuilder.Field("reviewDecision", OptionOf(Scalar()))
}

