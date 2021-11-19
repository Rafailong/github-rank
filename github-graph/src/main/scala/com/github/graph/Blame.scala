package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Blame {

  /** The list of ranges from a Git blame.
    */
  def ranges[A](innerSelection: SelectionBuilder[BlameRange, A]): SelectionBuilder[Blame, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ranges", ListOf(Obj(innerSelection)))
}

