package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TeamRepositoryEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[TeamRepositoryEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[TeamRepositoryEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** The permission level the team has on the repository
    */
  def permission: SelectionBuilder[TeamRepositoryEdge, RepositoryPermission] = _root_.caliban.client.SelectionBuilder.Field("permission", Scalar())
}

