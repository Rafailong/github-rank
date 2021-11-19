package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DiscussionComment {

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[DiscussionComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Author's association with the subject of the comment.
    */
  def authorAssociation: SelectionBuilder[DiscussionComment, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** The body as Markdown.
    */
  def body: SelectionBuilder[DiscussionComment, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[DiscussionComment, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The body rendered to text.
    */
  def bodyText: SelectionBuilder[DiscussionComment, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[DiscussionComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[DiscussionComment, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The time when this replied-to comment was deleted
    */
  def deletedAt: SelectionBuilder[DiscussionComment, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("deletedAt", OptionOf(Scalar()))

  /** The discussion this comment was created in
    */
  def discussion[A](innerSelection: SelectionBuilder[Discussion, A]): SelectionBuilder[DiscussionComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("discussion", OptionOf(Obj(innerSelection)))

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[DiscussionComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def id: SelectionBuilder[DiscussionComment, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[DiscussionComment, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** Has this comment been chosen as the answer of its discussion?
    */
  def isAnswer: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isAnswer", Scalar())

  /** Returns whether or not a comment has been minimized.
    */
  def isMinimized: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isMinimized", Scalar())

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[DiscussionComment, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** Returns why the comment was minimized.
    */
  def minimizedReason: SelectionBuilder[DiscussionComment, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("minimizedReason", OptionOf(Scalar()))

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[DiscussionComment, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[DiscussionComment, Option[List[A]]] =
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
  ): SelectionBuilder[DiscussionComment, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The threaded replies to this comment.
    */
  def replies[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DiscussionCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DiscussionComment, A] = _root_.caliban.client.SelectionBuilder.Field(
    "replies",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The discussion comment this comment is a reply to
    */
  def replyTo[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[DiscussionComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("replyTo", OptionOf(Obj(innerSelection)))

  /** The path for this discussion comment.
    */
  def resourcePath: SelectionBuilder[DiscussionComment, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[DiscussionComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** Number of upvotes that this subject has received.
    */
  def upvoteCount: SelectionBuilder[DiscussionComment, Int] = _root_.caliban.client.SelectionBuilder.Field("upvoteCount", Scalar())

  /** The URL for this discussion comment.
    */
  def url: SelectionBuilder[DiscussionComment, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DiscussionComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def viewerCanDelete: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelete", Scalar())

  /** Can the current user mark this comment as an answer?
    */
  def viewerCanMarkAsAnswer: SelectionBuilder[DiscussionComment, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanMarkAsAnswer", Scalar())

  /** Check if the current viewer can minimize this object.
    */
  def viewerCanMinimize: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanMinimize", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Can the current user unmark this comment as an answer?
    */
  def viewerCanUnmarkAsAnswer: SelectionBuilder[DiscussionComment, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanUnmarkAsAnswer", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Whether or not the current user can add or remove an upvote on this subject.
    */
  def viewerCanUpvote: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpvote", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[DiscussionComment, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())

  /** Whether or not the current user has already upvoted this subject.
    */
  def viewerHasUpvoted: SelectionBuilder[DiscussionComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasUpvoted", Scalar())
}

