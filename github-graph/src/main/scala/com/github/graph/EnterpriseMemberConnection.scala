package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseMemberConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[EnterpriseMemberEdge, A]): SelectionBuilder[EnterpriseMemberConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onEnterpriseUserAccount: SelectionBuilder[EnterpriseUserAccount, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[EnterpriseMemberConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder
    .Field("nodes", OptionOf(ListOf(OptionOf(ChoiceOf(Map("EnterpriseUserAccount" -> Obj(onEnterpriseUserAccount), "User" -> Obj(onUser)))))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[EnterpriseMemberConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[EnterpriseMemberConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

