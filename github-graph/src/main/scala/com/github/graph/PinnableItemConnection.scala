package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PinnableItemConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[PinnableItemEdge, A]): SelectionBuilder[PinnableItemConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onGist: SelectionBuilder[Gist, A],
    onRepository: SelectionBuilder[Repository, A]
  ): SelectionBuilder[PinnableItemConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder
    .Field("nodes", OptionOf(ListOf(OptionOf(ChoiceOf(Map("Gist" -> Obj(onGist), "Repository" -> Obj(onRepository)))))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[PinnableItemConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[PinnableItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

