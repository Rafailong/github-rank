package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SecurityAdvisoryIdentifier {

  /** The identifier type, e.g. GHSA, CVE
    */
  def `type`: SelectionBuilder[SecurityAdvisoryIdentifier, String] = _root_.caliban.client.SelectionBuilder.Field("type", Scalar())

  /** The identifier
    */
  def value: SelectionBuilder[SecurityAdvisoryIdentifier, String] = _root_.caliban.client.SelectionBuilder.Field("value", Scalar())
}

