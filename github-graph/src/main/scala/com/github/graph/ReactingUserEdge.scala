package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReactingUserEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[ReactingUserEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[ReactingUserEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** The moment when the user made the reaction.
    */
  def reactedAt: SelectionBuilder[ReactingUserEdge, DateTime] = _root_.caliban.client.SelectionBuilder.Field("reactedAt", Scalar())
}

