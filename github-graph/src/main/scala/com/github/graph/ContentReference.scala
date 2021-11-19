package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContentReference {

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ContentReference, Int] = _root_.caliban.client.SelectionBuilder.Field("databaseId", Scalar())
  def id: SelectionBuilder[ContentReference, String]      = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The reference of the content reference.
    */
  def reference: SelectionBuilder[ContentReference, String] = _root_.caliban.client.SelectionBuilder.Field("reference", Scalar())
}

