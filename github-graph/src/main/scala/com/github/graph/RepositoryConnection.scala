package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[RepositoryEdge, A]): SelectionBuilder[RepositoryConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[RepositoryConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[RepositoryConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[RepositoryConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** The total size in kilobytes of all repositories in the connection.
    */
  def totalDiskUsage: SelectionBuilder[RepositoryConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalDiskUsage", Scalar())
}

