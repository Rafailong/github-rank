package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseOrganizationMembershipEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseOrganizationMembershipEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[EnterpriseOrganizationMembershipEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))

  /** The role of the user in the enterprise membership.
    */
  def role: SelectionBuilder[EnterpriseOrganizationMembershipEdge, EnterpriseUserAccountMembershipRole] =
    _root_.caliban.client.SelectionBuilder.Field("role", Scalar())
}

