package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContributionCalendarDay {

  /** The hex color code that represents how many contributions were made on this day compared to others in the calendar.
    */
  def color: SelectionBuilder[ContributionCalendarDay, String] = _root_.caliban.client.SelectionBuilder.Field("color", Scalar())

  /** How many contributions were made by the user on this day.
    */
  def contributionCount: SelectionBuilder[ContributionCalendarDay, Int] = _root_.caliban.client.SelectionBuilder.Field("contributionCount", Scalar())

  /** Indication of contributions, relative to other days. Can be used to indicate
    * which color to represent this day on a calendar.
    */
  def contributionLevel: SelectionBuilder[ContributionCalendarDay, ContributionLevel] =
    _root_.caliban.client.SelectionBuilder.Field("contributionLevel", Scalar())

  /** The day this square represents.
    */
  def date: SelectionBuilder[ContributionCalendarDay, Date] = _root_.caliban.client.SelectionBuilder.Field("date", Scalar())

  /** A number representing which day of the week this square represents, e.g., 1 is Monday.
    */
  def weekday: SelectionBuilder[ContributionCalendarDay, Int] = _root_.caliban.client.SelectionBuilder.Field("weekday", Scalar())
}

