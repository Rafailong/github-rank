package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SecurityAdvisoryPackageVersion {

  /** The package name or version
    */
  def identifier: SelectionBuilder[SecurityAdvisoryPackageVersion, String] = _root_.caliban.client.SelectionBuilder.Field("identifier", Scalar())
}

