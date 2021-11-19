package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContributionCalendar {

  /** A list of hex color codes used in this calendar. The darker the color, the more contributions it represents.
    */
  def colors: SelectionBuilder[ContributionCalendar, List[String]] = _root_.caliban.client.SelectionBuilder.Field("colors", ListOf(Scalar()))

  /** Determine if the color set was chosen because it's currently Halloween.
    */
  def isHalloween: SelectionBuilder[ContributionCalendar, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isHalloween", Scalar())

  /** A list of the months of contributions in this calendar.
    */
  def months[A](innerSelection: SelectionBuilder[ContributionCalendarMonth, A]): SelectionBuilder[ContributionCalendar, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("months", ListOf(Obj(innerSelection)))

  /** The count of total contributions in the calendar.
    */
  def totalContributions: SelectionBuilder[ContributionCalendar, Int] = _root_.caliban.client.SelectionBuilder.Field("totalContributions", Scalar())

  /** A list of the weeks of contributions in this calendar.
    */
  def weeks[A](innerSelection: SelectionBuilder[ContributionCalendarWeek, A]): SelectionBuilder[ContributionCalendar, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("weeks", ListOf(Obj(innerSelection)))
}

