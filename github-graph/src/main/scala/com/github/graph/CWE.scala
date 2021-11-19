package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CWE {

  /** The id of the CWE
    */
  def cweId: SelectionBuilder[CWE, String] = _root_.caliban.client.SelectionBuilder.Field("cweId", Scalar())

  /** A detailed description of this CWE
    */
  def description: SelectionBuilder[CWE, String] = _root_.caliban.client.SelectionBuilder.Field("description", Scalar())
  def id: SelectionBuilder[CWE, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The name of this CWE
    */
  def name: SelectionBuilder[CWE, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())
}

