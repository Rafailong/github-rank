package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Release {

  /** The author of the release
    */
  def author[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Release, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("author", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Release, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Release, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The description of the release.
    */
  def description: SelectionBuilder[Release, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The description of this release rendered to HTML.
    */
  def descriptionHTML: SelectionBuilder[Release, Option[HTML]] = _root_.caliban.client.SelectionBuilder.Field("descriptionHTML", OptionOf(Scalar()))
  def id: SelectionBuilder[Release, String]                    = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether or not the release is a draft
    */
  def isDraft: SelectionBuilder[Release, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDraft", Scalar())

  /** Whether or not the release is the latest releast
    */
  def isLatest: SelectionBuilder[Release, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isLatest", Scalar())

  /** Whether or not the release is a prerelease
    */
  def isPrerelease: SelectionBuilder[Release, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPrerelease", Scalar())

  /** A list of users mentioned in the release description
    */
  def mentions[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Release, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "mentions",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The title of the release.
    */
  def name: SelectionBuilder[Release, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** Identifies the date and time when the release was created.
    */
  def publishedAt: SelectionBuilder[Release, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[Release, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("reactionGroups", OptionOf(ListOf(Obj(innerSelection))))

  /** A list of Reactions left on the Issue.
    */
  def reactions[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    content: Option[ReactionContent] = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[ReactionOrder]   = None
  )(innerSelection: SelectionBuilder[ReactionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[ReactionContent]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[ReactionOrder]]
  ): SelectionBuilder[Release, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reactions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("content", content, "ReactionContent")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "ReactionOrder")(encoder5)
    )
  )

  /** List of releases assets which are dependent on this release.
    */
  def releaseAssets[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    name: Option[String]   = None
  )(innerSelection: SelectionBuilder[ReleaseAssetConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]]
  ): SelectionBuilder[Release, A] = _root_.caliban.client.SelectionBuilder.Field(
    "releaseAssets",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("name", name, "String")(encoder4)
    )
  )

  /** The repository that the release belongs to.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Release, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this issue
    */
  def resourcePath: SelectionBuilder[Release, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** A description of the release, rendered to HTML without any links in it.
    */
  def shortDescriptionHTML(limit: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Release, Option[HTML]] =
    _root_.caliban.client.SelectionBuilder
      .Field("shortDescriptionHTML", OptionOf(Scalar()), arguments = List(Argument("limit", limit, "Int")(encoder0)))

  /** The Git tag the release points to
    */
  def tag[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[Release, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("tag", OptionOf(Obj(innerSelection)))

  /** The tag commit for this release.
    */
  def tagCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[Release, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("tagCommit", OptionOf(Obj(innerSelection)))

  /** The name of the release's Git tag
    */
  def tagName: SelectionBuilder[Release, String] = _root_.caliban.client.SelectionBuilder.Field("tagName", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Release, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this issue
    */
  def url: SelectionBuilder[Release, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[Release, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())
}

