package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GenericHovercardContext {

  /** A string describing this context
    */
  def message: SelectionBuilder[GenericHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** An octicon to accompany this context
    */
  def octicon: SelectionBuilder[GenericHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("octicon", Scalar())
}

