package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Workflow {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Workflow, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Workflow, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[Workflow, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The name of the workflow.
    */
  def name: SelectionBuilder[Workflow, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Workflow, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

