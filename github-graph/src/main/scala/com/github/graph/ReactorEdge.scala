package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReactorEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[ReactorEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The author of the reaction.
    */
  def node[A](
    onBot: SelectionBuilder[Bot, A],
    onMannequin: SelectionBuilder[Mannequin, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[ReactorEdge, A] = _root_.caliban.client.SelectionBuilder
    .Field("node", ChoiceOf(Map("Bot" -> Obj(onBot), "Mannequin" -> Obj(onMannequin), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser))))

  /** The moment when the user made the reaction.
    */
  def reactedAt: SelectionBuilder[ReactorEdge, DateTime] = _root_.caliban.client.SelectionBuilder.Field("reactedAt", Scalar())
}

