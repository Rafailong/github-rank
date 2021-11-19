package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[SponsorEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](onOrganization: SelectionBuilder[Organization, A], onUser: SelectionBuilder[User, A]): SelectionBuilder[SponsorEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(ChoiceOf(Map("Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[SponsorEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"         -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

