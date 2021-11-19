package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object LanguageConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[LanguageEdge, A]): SelectionBuilder[LanguageConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[Language, A]): SelectionBuilder[LanguageConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[LanguageConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[LanguageConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** The total size in bytes of files written in that language.
    */
  def totalSize: SelectionBuilder[LanguageConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalSize", Scalar())
}

