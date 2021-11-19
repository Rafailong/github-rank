package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StarredRepositoryConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[StarredRepositoryEdge, A]): SelectionBuilder[StarredRepositoryConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Is the list of stars for this user truncated? This is true for users that have many stars.
    */
  def isOverLimit: SelectionBuilder[StarredRepositoryConnection, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isOverLimit", Scalar())

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[StarredRepositoryConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[StarredRepositoryConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[StarredRepositoryConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

