package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Project {

  /** The project's description body.
    */
  def body: SelectionBuilder[Project, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("body", OptionOf(Scalar()))

  /** The projects description body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[Project, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** `true` if the object is closed (definition of closed may depend on type)
    */
  def closed: SelectionBuilder[Project, Boolean] = _root_.caliban.client.SelectionBuilder.Field("closed", Scalar())

  /** Identifies the date and time when the object was closed.
    */
  def closedAt: SelectionBuilder[Project, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("closedAt", OptionOf(Scalar()))

  /** List of columns in the project
    */
  def columns[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ProjectColumnConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Project, A] = _root_.caliban.client.SelectionBuilder.Field(
    "columns",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Project, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who originally created the project.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Project, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def databaseId: SelectionBuilder[Project, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[Project, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The project's name.
    */
  def name: SelectionBuilder[Project, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The project's number.
    */
  def number: SelectionBuilder[Project, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** The project's owner. Currently limited to repositories, organizations, and users.
    */
  def owner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onRepository: Option[SelectionBuilder[Repository, A]]     = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[Project, A] = _root_.caliban.client.SelectionBuilder.Field(
    "owner",
    ChoiceOf(Map("Organization" -> onOrganization, "Repository" -> onRepository, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) })
  )

  /** List of pending cards in this project
    */
  def pendingCards[A](
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
  ): SelectionBuilder[Project, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingCards",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("archivedStates", archivedStates, "[ProjectCardArchivedState]")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4)
    )
  )

  /** Project progress details.
    */
  def progress[A](innerSelection: SelectionBuilder[ProjectProgress, A]): SelectionBuilder[Project, A] =
    _root_.caliban.client.SelectionBuilder.Field("progress", Obj(innerSelection))

  /** The HTTP path for this project
    */
  def resourcePath: SelectionBuilder[Project, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Whether the project is open or closed.
    */
  def state: SelectionBuilder[Project, ProjectState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Project, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this project
    */
  def url: SelectionBuilder[Project, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[Project, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())
}

