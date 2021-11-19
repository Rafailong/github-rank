package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationMemberEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[OrganizationMemberEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** Whether the organization member has two factor enabled or not. Returns null if information is not available to viewer.
    */
  def hasTwoFactorEnabled: SelectionBuilder[OrganizationMemberEdge, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("hasTwoFactorEnabled", OptionOf(Scalar()))

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[OrganizationMemberEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))

  /** The role this user has in the organization.
    */
  def role: SelectionBuilder[OrganizationMemberEdge, Option[OrganizationMemberRole]] =
    _root_.caliban.client.SelectionBuilder.Field("role", OptionOf(Scalar()))
}

