package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Gist {

  /** A list of comments associated with the gist
    */
  def comments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[GistCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Gist, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
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
  def createdAt: SelectionBuilder[Gist, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The gist description.
    */
  def description: SelectionBuilder[Gist, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The files in this gist.
    */
  def files[A](limit: Option[Int] = None, oid: Option[GitObjectID] = None)(
    innerSelection: SelectionBuilder[GistFile, A]
  )(implicit encoder0: ArgEncoder[Option[Int]], encoder1: ArgEncoder[Option[GitObjectID]]): SelectionBuilder[Gist, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "files",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("limit", limit, "Int")(encoder0), Argument("oid", oid, "GitObjectID")(encoder1))
    )

  /** A list of forks associated with the gist
    */
  def forks[A](
    after: Option[String]      = None,
    before: Option[String]     = None,
    first: Option[Int]         = None,
    last: Option[Int]          = None,
    orderBy: Option[GistOrder] = None
  )(innerSelection: SelectionBuilder[GistConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[GistOrder]]
  ): SelectionBuilder[Gist, A] = _root_.caliban.client.SelectionBuilder.Field(
    "forks",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "GistOrder")(encoder4)
    )
  )
  def id: SelectionBuilder[Gist, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies if the gist is a fork.
    */
  def isFork: SelectionBuilder[Gist, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isFork", Scalar())

  /** Whether the gist is public or not.
    */
  def isPublic: SelectionBuilder[Gist, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPublic", Scalar())

  /** The gist name.
    */
  def name: SelectionBuilder[Gist, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The gist owner.
    */
  def owner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[Gist, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("owner", OptionOf(ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) })))

  /** Identifies when the gist was last pushed to.
    */
  def pushedAt: SelectionBuilder[Gist, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("pushedAt", OptionOf(Scalar()))

  /** The HTML path to this resource.
    */
  def resourcePath: SelectionBuilder[Gist, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Returns a count of how many stargazers there are on this object
    */
  def stargazerCount: SelectionBuilder[Gist, Int] = _root_.caliban.client.SelectionBuilder.Field("stargazerCount", Scalar())

  /** A list of users who have starred this starrable.
    */
  def stargazers[A](
    after: Option[String]      = None,
    before: Option[String]     = None,
    first: Option[Int]         = None,
    last: Option[Int]          = None,
    orderBy: Option[StarOrder] = None
  )(innerSelection: SelectionBuilder[StargazerConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[StarOrder]]
  ): SelectionBuilder[Gist, A] = _root_.caliban.client.SelectionBuilder.Field(
    "stargazers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "StarOrder")(encoder4)
    )
  )

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Gist, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this Gist.
    */
  def url: SelectionBuilder[Gist, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Returns a boolean indicating whether the viewing user has starred this starrable.
    */
  def viewerHasStarred: SelectionBuilder[Gist, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasStarred", Scalar())
}

