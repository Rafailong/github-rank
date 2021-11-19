package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SuggestedReviewer {

  /** Is this suggestion based on past commits?
    */
  def isAuthor: SelectionBuilder[SuggestedReviewer, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isAuthor", Scalar())

  /** Is this suggestion based on past review comments?
    */
  def isCommenter: SelectionBuilder[SuggestedReviewer, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCommenter", Scalar())

  /** Identifies the user suggested to review the pull request.
    */
  def reviewer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[SuggestedReviewer, A] =
    _root_.caliban.client.SelectionBuilder.Field("reviewer", Obj(innerSelection))
}

