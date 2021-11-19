package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CVSS {

  /** The CVSS score associated with this advisory
    */
  def score: SelectionBuilder[CVSS, Double] = _root_.caliban.client.SelectionBuilder.Field("score", Scalar())

  /** The CVSS vector string associated with this advisory
    */
  def vectorString: SelectionBuilder[CVSS, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("vectorString", OptionOf(Scalar()))
}

