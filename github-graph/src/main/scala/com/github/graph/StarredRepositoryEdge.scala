package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StarredRepositoryEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[StarredRepositoryEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[StarredRepositoryEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** Identifies when the item was starred.
    */
  def starredAt: SelectionBuilder[StarredRepositoryEdge, DateTime] = _root_.caliban.client.SelectionBuilder.Field("starredAt", Scalar())
}

