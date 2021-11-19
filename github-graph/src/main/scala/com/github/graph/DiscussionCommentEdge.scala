package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DiscussionCommentEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[DiscussionCommentEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[DiscussionCommentEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

