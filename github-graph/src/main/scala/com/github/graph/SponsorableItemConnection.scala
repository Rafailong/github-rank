package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorableItemConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[SponsorableItemEdge, A]): SelectionBuilder[SponsorableItemConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[SponsorableItemConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder
    .Field("nodes", OptionOf(ListOf(OptionOf(ChoiceOf(Map("Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[SponsorableItemConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[SponsorableItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

