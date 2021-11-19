package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GistComment {

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[GistComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "author",
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

  /** Author's association with the gist.
    */
  def authorAssociation: SelectionBuilder[GistComment, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** Identifies the comment body.
    */
  def body: SelectionBuilder[GistComment, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[GistComment, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The body rendered to text.
    */
  def bodyText: SelectionBuilder[GistComment, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[GistComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[GistComment, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[GistComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "editor",
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

  /** The associated gist.
    */
  def gist[A](innerSelection: SelectionBuilder[Gist, A]): SelectionBuilder[GistComment, A] =
    _root_.caliban.client.SelectionBuilder.Field("gist", Obj(innerSelection))
  def id: SelectionBuilder[GistComment, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** Returns whether or not a comment has been minimized.
    */
  def isMinimized: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isMinimized", Scalar())

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[GistComment, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** Returns why the comment was minimized.
    */
  def minimizedReason: SelectionBuilder[GistComment, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("minimizedReason", OptionOf(Scalar()))

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[GistComment, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[GistComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[GistComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "userContentEdits",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Check if the current viewer can delete this object.
    */
  def viewerCanDelete: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelete", Scalar())

  /** Check if the current viewer can minimize this object.
    */
  def viewerCanMinimize: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanMinimize", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[GistComment, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[GistComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())
}

