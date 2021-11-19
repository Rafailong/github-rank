package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorshipConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[SponsorshipEdge, A]): SelectionBuilder[SponsorshipConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[SponsorshipConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("nodes", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[SponsorshipConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[SponsorshipConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** The total amount in cents of all recurring sponsorships in the connection
    * whose amount you can view. Does not include one-time sponsorships.
    */
  def totalRecurringMonthlyPriceInCents: SelectionBuilder[SponsorshipConnection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalRecurringMonthlyPriceInCents", Scalar())

  /** The total amount in USD of all recurring sponsorships in the connection whose
    * amount you can view. Does not include one-time sponsorships.
    */
  def totalRecurringMonthlyPriceInDollars: SelectionBuilder[SponsorshipConnection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalRecurringMonthlyPriceInDollars", Scalar())
}

