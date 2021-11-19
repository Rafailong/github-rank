package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContributionCalendarWeek {

  /** The days of contributions in this week.
    */
  def contributionDays[A](innerSelection: SelectionBuilder[ContributionCalendarDay, A]): SelectionBuilder[ContributionCalendarWeek, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("contributionDays", ListOf(Obj(innerSelection)))

  /** The date of the earliest square in this week.
    */
  def firstDay: SelectionBuilder[ContributionCalendarWeek, Date] = _root_.caliban.client.SelectionBuilder.Field("firstDay", Scalar())
}

