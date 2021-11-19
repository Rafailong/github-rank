package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object LicenseRule {

  /** A description of the rule
    */
  def description: SelectionBuilder[LicenseRule, String] = _root_.caliban.client.SelectionBuilder.Field("description", Scalar())

  /** The machine-readable rule key
    */
  def key: SelectionBuilder[LicenseRule, String] = _root_.caliban.client.SelectionBuilder.Field("key", Scalar())

  /** The human-readable rule label
    */
  def label: SelectionBuilder[LicenseRule, String] = _root_.caliban.client.SelectionBuilder.Field("label", Scalar())
}

