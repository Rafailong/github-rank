package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object BlameRange {

  /** Identifies the recency of the change, from 1 (new) to 10 (old). This is
    * calculated as a 2-quantile and determines the length of distance between the
    * median age of all the changes in the file and the recency of the current
    * range's change.
    */
  def age: SelectionBuilder[BlameRange, Int] = _root_.caliban.client.SelectionBuilder.Field("age", Scalar())

  /** Identifies the line author
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[BlameRange, A] =
    _root_.caliban.client.SelectionBuilder.Field("commit", Obj(innerSelection))

  /** The ending line for the range
    */
  def endingLine: SelectionBuilder[BlameRange, Int] = _root_.caliban.client.SelectionBuilder.Field("endingLine", Scalar())

  /** The starting line for the range
    */
  def startingLine: SelectionBuilder[BlameRange, Int] = _root_.caliban.client.SelectionBuilder.Field("startingLine", Scalar())
}

