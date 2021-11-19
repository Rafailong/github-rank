package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectNext {

  /** Returns true if the project is closed.
    */
  def closed: SelectionBuilder[ProjectNext, Boolean] = _root_.caliban.client.SelectionBuilder.Field("closed", Scalar())

  /** Identifies the date and time when the object was closed.
    */
  def closedAt: SelectionBuilder[ProjectNext, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("closedAt", OptionOf(Scalar()))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectNext, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who originally created the project.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ProjectNext, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "creator",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ProjectNext, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The project's description.
    */
  def description: SelectionBuilder[ProjectNext, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** List of fields in the project
    */
  def fields[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ProjectNextFieldConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ProjectNext, A] = _root_.caliban.client.SelectionBuilder.Field(
    "fields",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
  def id: SelectionBuilder[ProjectNext, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** List of items in the project
    */
  def items[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ProjectNextItemConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ProjectNext, A] = _root_.caliban.client.SelectionBuilder.Field(
    "items",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The project's number.
    */
  def number: SelectionBuilder[ProjectNext, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** The project's owner. Currently limited to organizations and users.
    */
  def owner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[ProjectNext, A] = _root_.caliban.client.SelectionBuilder
    .Field("owner", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** The HTTP path for this project
    */
  def resourcePath: SelectionBuilder[ProjectNext, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The project's name.
    */
  def title: SelectionBuilder[ProjectNext, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("title", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectNext, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this project
    */
  def url: SelectionBuilder[ProjectNext, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[ProjectNext, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())
}

