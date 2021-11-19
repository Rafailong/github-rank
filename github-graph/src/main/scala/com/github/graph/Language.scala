package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Language {

  /** The color defined for the current language.
    */
  def color: SelectionBuilder[Language, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("color", OptionOf(Scalar()))
  def id: SelectionBuilder[Language, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The name of the current language.
    */
  def name: SelectionBuilder[Language, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())
}

