package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectColumn {

  /** List of cards in the column
    */
  def cards[A](
    after: Option[String]                                          = None,
    archivedStates: Option[List[Option[ProjectCardArchivedState]]] = None,
    before: Option[String]                                         = None,
    first: Option[Int]                                             = None,
    last: Option[Int]                                              = None
  )(innerSelection: SelectionBuilder[ProjectCardConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[List[Option[ProjectCardArchivedState]]]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ProjectColumn, A] = _root_.caliban.client.SelectionBuilder.Field(
    "cards",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("archivedStates", archivedStates, "[ProjectCardArchivedState]")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4)
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectColumn, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ProjectColumn, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ProjectColumn, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The project column's name.
    */
  def name: SelectionBuilder[ProjectColumn, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The project that contains this column.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[ProjectColumn, A] =
    _root_.caliban.client.SelectionBuilder.Field("project", Obj(innerSelection))

  /** The semantic purpose of the column
    */
  def purpose: SelectionBuilder[ProjectColumn, Option[ProjectColumnPurpose]] =
    _root_.caliban.client.SelectionBuilder.Field("purpose", OptionOf(Scalar()))

  /** The HTTP path for this project column
    */
  def resourcePath: SelectionBuilder[ProjectColumn, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectColumn, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this project column
    */
  def url: SelectionBuilder[ProjectColumn, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

