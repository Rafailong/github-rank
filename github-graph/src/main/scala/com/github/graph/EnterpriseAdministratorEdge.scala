package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseAdministratorEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseAdministratorEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[EnterpriseAdministratorEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))

  /** The role of the administrator.
    */
  def role: SelectionBuilder[EnterpriseAdministratorEdge, EnterpriseAdministratorRole] =
    _root_.caliban.client.SelectionBuilder.Field("role", Scalar())
}

