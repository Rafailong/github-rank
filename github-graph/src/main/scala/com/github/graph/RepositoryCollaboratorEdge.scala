package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryCollaboratorEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[RepositoryCollaboratorEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RepositoryCollaboratorEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** The permission the user has on the repository.
    */
  def permission: SelectionBuilder[RepositoryCollaboratorEdge, RepositoryPermission] =
    _root_.caliban.client.SelectionBuilder.Field("permission", Scalar())

  /** A list of sources for the user's access to the repository.
    */
  def permissionSources[A](innerSelection: SelectionBuilder[PermissionSource, A]): SelectionBuilder[RepositoryCollaboratorEdge, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("permissionSources", OptionOf(ListOf(Obj(innerSelection))))
}

