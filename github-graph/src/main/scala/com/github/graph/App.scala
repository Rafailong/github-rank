package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object App {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[App, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[App, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The description of the app.
    */
  def description: SelectionBuilder[App, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))
  def id: SelectionBuilder[App, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The IP addresses of the app.
    */
  def ipAllowListEntries[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    last: Option[Int]                      = None,
    orderBy: Option[IpAllowListEntryOrder] = None
  )(innerSelection: SelectionBuilder[IpAllowListEntryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[IpAllowListEntryOrder]]
  ): SelectionBuilder[App, A] = _root_.caliban.client.SelectionBuilder.Field(
    "ipAllowListEntries",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "IpAllowListEntryOrder")(encoder4)
    )
  )

  /** The hex color code, without the leading '#', for the logo background.
    */
  def logoBackgroundColor: SelectionBuilder[App, String] = _root_.caliban.client.SelectionBuilder.Field("logoBackgroundColor", Scalar())

  /** A URL pointing to the app's logo.
    */
  def logoUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[App, URI] =
    _root_.caliban.client.SelectionBuilder.Field("logoUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** The name of the app.
    */
  def name: SelectionBuilder[App, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** A slug based on the name of the app for use in URLs.
    */
  def slug: SelectionBuilder[App, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[App, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The URL to the app's homepage.
    */
  def url: SelectionBuilder[App, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

