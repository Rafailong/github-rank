package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PackageTag {
  def id: SelectionBuilder[PackageTag, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the tag name of the version.
    */
  def name: SelectionBuilder[PackageTag, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Version that the tag is associated with.
    */
  def version[A](innerSelection: SelectionBuilder[PackageVersion, A]): SelectionBuilder[PackageTag, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("version", OptionOf(Obj(innerSelection)))
}

