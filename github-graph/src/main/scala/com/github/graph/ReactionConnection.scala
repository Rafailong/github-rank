package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReactionConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[ReactionEdge, A]): SelectionBuilder[ReactionConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[Reaction, A]): SelectionBuilder[ReactionConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[ReactionConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[ReactionConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** Whether or not the authenticated user has left a reaction on the subject.
    */
  def viewerHasReacted: SelectionBuilder[ReactionConnection, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasReacted", Scalar())
}

