package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StargazerEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[StargazerEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[StargazerEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** Identifies when the item was starred.
    */
  def starredAt: SelectionBuilder[StargazerEdge, DateTime] = _root_.caliban.client.SelectionBuilder.Field("starredAt", Scalar())
}

