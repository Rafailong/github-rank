package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryTopicEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[RepositoryTopicEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[RepositoryTopic, A]): SelectionBuilder[RepositoryTopicEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

