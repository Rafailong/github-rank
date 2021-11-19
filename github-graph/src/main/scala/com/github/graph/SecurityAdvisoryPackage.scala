package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SecurityAdvisoryPackage {

  /** The ecosystem the package belongs to, e.g. RUBYGEMS, NPM
    */
  def ecosystem: SelectionBuilder[SecurityAdvisoryPackage, SecurityAdvisoryEcosystem] =
    _root_.caliban.client.SelectionBuilder.Field("ecosystem", Scalar())

  /** The package name
    */
  def name: SelectionBuilder[SecurityAdvisoryPackage, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())
}

