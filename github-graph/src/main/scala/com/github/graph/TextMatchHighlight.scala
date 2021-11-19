package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TextMatchHighlight {

  /** The indice in the fragment where the matched text begins.
    */
  def beginIndice: SelectionBuilder[TextMatchHighlight, Int] = _root_.caliban.client.SelectionBuilder.Field("beginIndice", Scalar())

  /** The indice in the fragment where the matched text ends.
    */
  def endIndice: SelectionBuilder[TextMatchHighlight, Int] = _root_.caliban.client.SelectionBuilder.Field("endIndice", Scalar())

  /** The text matched.
    */
  def text: SelectionBuilder[TextMatchHighlight, String] = _root_.caliban.client.SelectionBuilder.Field("text", Scalar())
}

