package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentReviewerConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[DeploymentReviewerEdge, A]): SelectionBuilder[DeploymentReviewerConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onTeam: SelectionBuilder[Team, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[DeploymentReviewerConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(ChoiceOf(Map("Team" -> Obj(onTeam), "User" -> Obj(onUser)))))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[DeploymentReviewerConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[DeploymentReviewerConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

