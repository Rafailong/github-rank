package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreatedCommitContributionConnection {

  /** A list of edges.
    */
  def edges[A](
    innerSelection: SelectionBuilder[CreatedCommitContributionEdge, A]
  ): SelectionBuilder[CreatedCommitContributionConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    innerSelection: SelectionBuilder[CreatedCommitContribution, A]
  ): SelectionBuilder[CreatedCommitContributionConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[CreatedCommitContributionConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of commits across days and repositories in the connection.
    */
  def totalCount: SelectionBuilder[CreatedCommitContributionConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

