package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorsGoal {

  /** A description of the goal from the maintainer.
    */
  def description: SelectionBuilder[SponsorsGoal, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** What the objective of this goal is.
    */
  def kind: SelectionBuilder[SponsorsGoal, SponsorsGoalKind] = _root_.caliban.client.SelectionBuilder.Field("kind", Scalar())

  /** The percentage representing how complete this goal is, between 0-100.
    */
  def percentComplete: SelectionBuilder[SponsorsGoal, Int] = _root_.caliban.client.SelectionBuilder.Field("percentComplete", Scalar())

  /** What the goal amount is. Represents an amount in USD for monthly sponsorship
    * amount goals. Represents a count of unique sponsors for total sponsors count goals.
    */
  def targetValue: SelectionBuilder[SponsorsGoal, Int] = _root_.caliban.client.SelectionBuilder.Field("targetValue", Scalar())

  /** A brief summary of the kind and target value of this goal.
    */
  def title: SelectionBuilder[SponsorsGoal, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())
}

