package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object LanguageEdge {
  def cursor: SelectionBuilder[LanguageEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  def node[A](innerSelection: SelectionBuilder[Language, A]): SelectionBuilder[LanguageEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** The number of bytes of code written in the language.
    */
  def size: SelectionBuilder[LanguageEdge, Int] = _root_.caliban.client.SelectionBuilder.Field("size", Scalar())
}

