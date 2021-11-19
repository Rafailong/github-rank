package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ViewerHovercardContext {

  /** A string describing this context
    */
  def message: SelectionBuilder[ViewerHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** An octicon to accompany this context
    */
  def octicon: SelectionBuilder[ViewerHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("octicon", Scalar())

  /** Identifies the user who is related to this context.
    */
  def viewer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[ViewerHovercardContext, A] =
    _root_.caliban.client.SelectionBuilder.Field("viewer", Obj(innerSelection))
}

