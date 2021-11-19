package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectProgress {

  /** The number of done cards.
    */
  def doneCount: SelectionBuilder[ProjectProgress, Int] = _root_.caliban.client.SelectionBuilder.Field("doneCount", Scalar())

  /** The percentage of done cards.
    */
  def donePercentage: SelectionBuilder[ProjectProgress, Double] = _root_.caliban.client.SelectionBuilder.Field("donePercentage", Scalar())

  /** Whether progress tracking is enabled and cards with purpose exist for this project
    */
  def enabled: SelectionBuilder[ProjectProgress, Boolean] = _root_.caliban.client.SelectionBuilder.Field("enabled", Scalar())

  /** The number of in-progress cards.
    */
  def inProgressCount: SelectionBuilder[ProjectProgress, Int] = _root_.caliban.client.SelectionBuilder.Field("inProgressCount", Scalar())

  /** The percentage of in-progress cards.
    */
  def inProgressPercentage: SelectionBuilder[ProjectProgress, Double] = _root_.caliban.client.SelectionBuilder.Field("inProgressPercentage", Scalar())

  /** The number of to do cards.
    */
  def todoCount: SelectionBuilder[ProjectProgress, Int] = _root_.caliban.client.SelectionBuilder.Field("todoCount", Scalar())

  /** The percentage of to do cards.
    */
  def todoPercentage: SelectionBuilder[ProjectProgress, Double] = _root_.caliban.client.SelectionBuilder.Field("todoPercentage", Scalar())
}

