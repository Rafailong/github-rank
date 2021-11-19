package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TextMatch {

  /** The specific text fragment within the property matched on.
    */
  def fragment: SelectionBuilder[TextMatch, String] = _root_.caliban.client.SelectionBuilder.Field("fragment", Scalar())

  /** Highlights within the matched fragment.
    */
  def highlights[A](innerSelection: SelectionBuilder[TextMatchHighlight, A]): SelectionBuilder[TextMatch, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("highlights", ListOf(Obj(innerSelection)))

  /** The property matched on.
    */
  def property: SelectionBuilder[TextMatch, String] = _root_.caliban.client.SelectionBuilder.Field("property", Scalar())
}

