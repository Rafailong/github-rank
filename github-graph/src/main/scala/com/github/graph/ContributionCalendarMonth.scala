package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContributionCalendarMonth {

  /** The date of the first day of this month.
    */
  def firstDay: SelectionBuilder[ContributionCalendarMonth, Date] = _root_.caliban.client.SelectionBuilder.Field("firstDay", Scalar())

  /** The name of the month.
    */
  def name: SelectionBuilder[ContributionCalendarMonth, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** How many weeks started in this month.
    */
  def totalWeeks: SelectionBuilder[ContributionCalendarMonth, Int] = _root_.caliban.client.SelectionBuilder.Field("totalWeeks", Scalar())

  /** The year the month occurred in.
    */
  def year: SelectionBuilder[ContributionCalendarMonth, Int] = _root_.caliban.client.SelectionBuilder.Field("year", Scalar())
}

