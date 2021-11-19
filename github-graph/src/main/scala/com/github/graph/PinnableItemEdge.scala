package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PinnableItemEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[PinnableItemEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](onGist: SelectionBuilder[Gist, A], onRepository: SelectionBuilder[Repository, A]): SelectionBuilder[PinnableItemEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(ChoiceOf(Map("Gist" -> Obj(onGist), "Repository" -> Obj(onRepository)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onGist: Option[SelectionBuilder[Gist, A]]             = None,
    onRepository: Option[SelectionBuilder[Repository, A]] = None
  ): SelectionBuilder[PinnableItemEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "Gist"       -> onGist.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Repository" -> onRepository.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

