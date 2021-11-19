package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckAnnotationSpan {

  /** End position (inclusive).
    */
  def end[A](innerSelection: SelectionBuilder[CheckAnnotationPosition, A]): SelectionBuilder[CheckAnnotationSpan, A] =
    _root_.caliban.client.SelectionBuilder.Field("end", Obj(innerSelection))

  /** Start position (inclusive).
    */
  def start[A](innerSelection: SelectionBuilder[CheckAnnotationPosition, A]): SelectionBuilder[CheckAnnotationSpan, A] =
    _root_.caliban.client.SelectionBuilder.Field("start", Obj(innerSelection))
}

