package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PushAllowanceEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[PushAllowanceEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[PushAllowance, A]): SelectionBuilder[PushAllowanceEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

