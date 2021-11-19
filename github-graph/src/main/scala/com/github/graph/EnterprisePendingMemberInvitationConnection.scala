package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterprisePendingMemberInvitationConnection {

  /** A list of edges.
    */
  def edges[A](
    innerSelection: SelectionBuilder[EnterprisePendingMemberInvitationEdge, A]
  ): SelectionBuilder[EnterprisePendingMemberInvitationConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    innerSelection: SelectionBuilder[OrganizationInvitation, A]
  ): SelectionBuilder[EnterprisePendingMemberInvitationConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[EnterprisePendingMemberInvitationConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[EnterprisePendingMemberInvitationConnection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** Identifies the total count of unique users in the connection.
    */
  def totalUniqueUserCount: SelectionBuilder[EnterprisePendingMemberInvitationConnection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalUniqueUserCount", Scalar())
}

