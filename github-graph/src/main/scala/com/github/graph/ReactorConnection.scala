package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReactorConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[ReactorEdge, A]): SelectionBuilder[ReactorConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onBot: SelectionBuilder[Bot, A],
    onMannequin: SelectionBuilder[Mannequin, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[ReactorConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
        OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Mannequin" -> Obj(onMannequin), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser))))
      )
    )
  )

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[ReactorConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[ReactorConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

