package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PermissionSource {

  /** The organization the repository belongs to.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[PermissionSource, A] =
    _root_.caliban.client.SelectionBuilder.Field("organization", Obj(innerSelection))

  /** The level of access this source has granted to the user.
    */
  def permission: SelectionBuilder[PermissionSource, DefaultRepositoryPermissionField] =
    _root_.caliban.client.SelectionBuilder.Field("permission", Scalar())

  /** The source of this permission.
    */
  def source[A](
    onOrganization: SelectionBuilder[Organization, A],
    onRepository: SelectionBuilder[Repository, A],
    onTeam: SelectionBuilder[Team, A]
  ): SelectionBuilder[PermissionSource, A] = _root_.caliban.client.SelectionBuilder
    .Field("source", ChoiceOf(Map("Organization" -> Obj(onOrganization), "Repository" -> Obj(onRepository), "Team" -> Obj(onTeam))))
}

