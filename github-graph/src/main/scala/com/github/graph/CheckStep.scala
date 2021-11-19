package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckStep {

  /** Identifies the date and time when the check step was completed.
    */
  def completedAt: SelectionBuilder[CheckStep, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("completedAt", OptionOf(Scalar()))

  /** The conclusion of the check step.
    */
  def conclusion: SelectionBuilder[CheckStep, Option[CheckConclusionState]] =
    _root_.caliban.client.SelectionBuilder.Field("conclusion", OptionOf(Scalar()))

  /** A reference for the check step on the integrator's system.
    */
  def externalId: SelectionBuilder[CheckStep, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("externalId", OptionOf(Scalar()))

  /** The step's name.
    */
  def name: SelectionBuilder[CheckStep, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The index of the step in the list of steps of the parent check run.
    */
  def number: SelectionBuilder[CheckStep, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** Number of seconds to completion.
    */
  def secondsToCompletion: SelectionBuilder[CheckStep, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("secondsToCompletion", OptionOf(Scalar()))

  /** Identifies the date and time when the check step was started.
    */
  def startedAt: SelectionBuilder[CheckStep, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("startedAt", OptionOf(Scalar()))

  /** The current status of the check step.
    */
  def status: SelectionBuilder[CheckStep, CheckStatusState] = _root_.caliban.client.SelectionBuilder.Field("status", Scalar())
}

