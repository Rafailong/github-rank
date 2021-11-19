package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentReviewerEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[DeploymentReviewerEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](onTeam: SelectionBuilder[Team, A], onUser: SelectionBuilder[User, A]): SelectionBuilder[DeploymentReviewerEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(ChoiceOf(Map("Team" -> Obj(onTeam), "User" -> Obj(onUser)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onTeam: Option[SelectionBuilder[Team, A]] = None,
    onUser: Option[SelectionBuilder[User, A]] = None
  ): SelectionBuilder[DeploymentReviewerEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "Team" -> onTeam.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User" -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

