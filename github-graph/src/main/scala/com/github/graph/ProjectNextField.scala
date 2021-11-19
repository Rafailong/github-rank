package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectNextField {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectNextField, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ProjectNextField, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ProjectNextField, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The project field's name.
    */
  def name: SelectionBuilder[ProjectNextField, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The project that contains this column.
    */
  def project[A](innerSelection: SelectionBuilder[ProjectNext, A]): SelectionBuilder[ProjectNextField, A] =
    _root_.caliban.client.SelectionBuilder.Field("project", Obj(innerSelection))

  /** The field's settings.
    */
  def settings: SelectionBuilder[ProjectNextField, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("settings", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectNextField, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

