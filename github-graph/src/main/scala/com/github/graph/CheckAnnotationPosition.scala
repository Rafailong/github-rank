package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckAnnotationPosition {

  /** Column number (1 indexed).
    */
  def column: SelectionBuilder[CheckAnnotationPosition, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("column", OptionOf(Scalar()))

  /** Line number (1 indexed).
    */
  def line: SelectionBuilder[CheckAnnotationPosition, Int] = _root_.caliban.client.SelectionBuilder.Field("line", Scalar())
}

