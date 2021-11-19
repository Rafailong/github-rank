package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectNextConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[ProjectNextEdge, A]): SelectionBuilder[ProjectNextConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[ProjectNext, A]): SelectionBuilder[ProjectNextConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[ProjectNextConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[ProjectNextConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

