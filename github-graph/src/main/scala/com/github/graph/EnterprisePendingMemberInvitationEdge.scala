package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterprisePendingMemberInvitationEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterprisePendingMemberInvitationEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** Whether the invitation has a license for the enterprise.
    */
  @deprecated("All pending members consume a license Removal on 2020-07-01 UTC.", "")
  def isUnlicensed: SelectionBuilder[EnterprisePendingMemberInvitationEdge, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUnlicensed", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[OrganizationInvitation, A]): SelectionBuilder[EnterprisePendingMemberInvitationEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

