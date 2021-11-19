package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TeamDiscussion {

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[TeamDiscussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Author's association with the discussion's team.
    */
  def authorAssociation: SelectionBuilder[TeamDiscussion, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** The body as Markdown.
    */
  def body: SelectionBuilder[TeamDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[TeamDiscussion, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The body rendered to text.
    */
  def bodyText: SelectionBuilder[TeamDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** Identifies the discussion body hash.
    */
  def bodyVersion: SelectionBuilder[TeamDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("bodyVersion", Scalar())

  /** A list of comments on this discussion.
    */
  def comments[A](
    after: Option[String]                       = None,
    before: Option[String]                      = None,
    first: Option[Int]                          = None,
    fromComment: Option[Int]                    = None,
    last: Option[Int]                           = None,
    orderBy: Option[TeamDiscussionCommentOrder] = None
  )(innerSelection: SelectionBuilder[TeamDiscussionCommentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[TeamDiscussionCommentOrder]]
  ): SelectionBuilder[TeamDiscussion, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("fromComment", fromComment, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "TeamDiscussionCommentOrder")(encoder5)
    )
  )

  /** The HTTP path for discussion comments
    */
  def commentsResourcePath: SelectionBuilder[TeamDiscussion, URI] = _root_.caliban.client.SelectionBuilder.Field("commentsResourcePath", Scalar())

  /** The HTTP URL for discussion comments
    */
  def commentsUrl: SelectionBuilder[TeamDiscussion, URI] = _root_.caliban.client.SelectionBuilder.Field("commentsUrl", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[TeamDiscussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[TeamDiscussion, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[TeamDiscussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def id: SelectionBuilder[TeamDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** Whether or not the discussion is pinned.
    */
  def isPinned: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPinned", Scalar())

  /** Whether or not the discussion is only visible to team members and org admins.
    */
  def isPrivate: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPrivate", Scalar())

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[TeamDiscussion, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** Identifies the discussion within its team.
    */
  def number: SelectionBuilder[TeamDiscussion, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[TeamDiscussion, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[TeamDiscussion, Option[List[A]]] =
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
  ): SelectionBuilder[TeamDiscussion, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The HTTP path for this discussion
    */
  def resourcePath: SelectionBuilder[TeamDiscussion, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The team that defines the context of this discussion.
    */
  def team[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[TeamDiscussion, A] =
    _root_.caliban.client.SelectionBuilder.Field("team", Obj(innerSelection))

  /** The title of the discussion
    */
  def title: SelectionBuilder[TeamDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[TeamDiscussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this discussion
    */
  def url: SelectionBuilder[TeamDiscussion, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[TeamDiscussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def viewerCanDelete: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelete", Scalar())

  /** Whether or not the current viewer can pin this discussion.
    */
  def viewerCanPin: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanPin", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[TeamDiscussion, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[TeamDiscussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[TeamDiscussion, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))
}

