package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Issue {

  /** Reason that the conversation was locked.
    */
  def activeLockReason: SelectionBuilder[Issue, Option[LockReason]] =
    _root_.caliban.client.SelectionBuilder.Field("activeLockReason", OptionOf(Scalar()))

  /** A list of Users assigned to this object.
    */
  def assignees[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "assignees",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Issue, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def authorAssociation: SelectionBuilder[Issue, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** Identifies the body of the issue.
    */
  def body: SelectionBuilder[Issue, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[Issue, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The http path for this issue body
    */
  def bodyResourcePath: SelectionBuilder[Issue, URI] = _root_.caliban.client.SelectionBuilder.Field("bodyResourcePath", Scalar())

  /** Identifies the body of the issue rendered to text.
    */
  def bodyText: SelectionBuilder[Issue, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** The http URL for this issue body
    */
  def bodyUrl: SelectionBuilder[Issue, URI] = _root_.caliban.client.SelectionBuilder.Field("bodyUrl", Scalar())

  /** `true` if the object is closed (definition of closed may depend on type)
    */
  def closed: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("closed", Scalar())

  /** Identifies the date and time when the object was closed.
    */
  def closedAt: SelectionBuilder[Issue, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("closedAt", OptionOf(Scalar()))

  /** A list of comments associated with the Issue.
    */
  def comments[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[IssueCommentOrder] = None
  )(innerSelection: SelectionBuilder[IssueCommentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[IssueCommentOrder]]
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "IssueCommentOrder")(encoder4)
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Issue, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Issue, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Issue, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The hovercard information for this issue
    */
  def hovercard[A](includeNotificationContexts: Option[Boolean] = None)(
    innerSelection: SelectionBuilder[Hovercard, A]
  )(implicit encoder0: ArgEncoder[Option[Boolean]]): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "hovercard",
    Obj(innerSelection),
    arguments = List(Argument("includeNotificationContexts", includeNotificationContexts, "Boolean")(encoder0))
  )
  def id: SelectionBuilder[Issue, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** Indicates whether or not this issue is currently pinned to the repository issues list
    */
  def isPinned: SelectionBuilder[Issue, Option[Boolean]] = _root_.caliban.client.SelectionBuilder.Field("isPinned", OptionOf(Scalar()))

  /** Is this issue read by the viewer
    */
  def isReadByViewer: SelectionBuilder[Issue, Option[Boolean]] = _root_.caliban.client.SelectionBuilder.Field("isReadByViewer", OptionOf(Scalar()))

  /** A list of labels associated with the object.
    */
  def labels[A](
    after: Option[String]       = None,
    before: Option[String]      = None,
    first: Option[Int]          = None,
    last: Option[Int]           = None,
    orderBy: Option[LabelOrder] = None
  )(innerSelection: SelectionBuilder[LabelConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[LabelOrder]]
  ): SelectionBuilder[Issue, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "labels",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "LabelOrder")(encoder4)
    )
  )

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[Issue, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** `true` if the object is locked
    */
  def locked: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("locked", Scalar())

  /** Identifies the milestone associated with the issue.
    */
  def milestone[A](innerSelection: SelectionBuilder[Milestone, A]): SelectionBuilder[Issue, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("milestone", OptionOf(Obj(innerSelection)))

  /** Identifies the issue number.
    */
  def number: SelectionBuilder[Issue, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** A list of Users that are participating in the Issue conversation.
    */
  def participants[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "participants",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** List of project cards associated with this issue.
    */
  def projectCards[A](
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
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "projectCards",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("archivedStates", archivedStates, "[ProjectCardArchivedState]")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4)
    )
  )

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[Issue, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[Issue, Option[List[A]]] =
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
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Issue, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this issue
    */
  def resourcePath: SelectionBuilder[Issue, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the state of the issue.
    */
  def state: SelectionBuilder[Issue, IssueState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** A list of events, comments, commits, etc. associated with the issue.
    */
  @deprecated("`timeline` will be removed Use Issue.timelineItems instead. Removal on 2020-10-01 UTC.", "")
  def timeline[A](
    after: Option[String]   = None,
    before: Option[String]  = None,
    first: Option[Int]      = None,
    last: Option[Int]       = None,
    since: Option[DateTime] = None
  )(innerSelection: SelectionBuilder[IssueTimelineConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[DateTime]]
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "timeline",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("since", since, "DateTime")(encoder4)
    )
  )

  /** A list of events, comments, commits, etc. associated with the issue.
    */
  def timelineItems[A](
    after: Option[String]                               = None,
    before: Option[String]                              = None,
    first: Option[Int]                                  = None,
    itemTypes: Option[List[IssueTimelineItemsItemType]] = None,
    last: Option[Int]                                   = None,
    since: Option[DateTime]                             = None,
    skip: Option[Int]                                   = None
  )(innerSelection: SelectionBuilder[IssueTimelineItemsConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[List[IssueTimelineItemsItemType]]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[DateTime]],
    encoder6: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Issue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "timelineItems",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("itemTypes", itemTypes, "[IssueTimelineItemsItemType!]")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("since", since, "DateTime")(encoder5),
      Argument("skip", skip, "Int")(encoder6)
    )
  )

  /** Identifies the issue title.
    */
  def title: SelectionBuilder[Issue, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Identifies the issue title rendered to HTML.
    */
  def titleHTML: SelectionBuilder[Issue, String] = _root_.caliban.client.SelectionBuilder.Field("titleHTML", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Issue, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this issue
    */
  def url: SelectionBuilder[Issue, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Issue, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "userContentEdits",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[Issue, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[Issue, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[Issue, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))
}

