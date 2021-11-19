package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequest {

  /** Reason that the conversation was locked.
    */
  def activeLockReason: SelectionBuilder[PullRequest, Option[LockReason]] =
    _root_.caliban.client.SelectionBuilder.Field("activeLockReason", OptionOf(Scalar()))

  /** The number of additions in this pull request.
    */
  def additions: SelectionBuilder[PullRequest, Int] = _root_.caliban.client.SelectionBuilder.Field("additions", Scalar())

  /** A list of Users assigned to this object.
    */
  def assignees[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def authorAssociation: SelectionBuilder[PullRequest, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** Returns the auto-merge request object if one exists for this pull request.
    */
  def autoMergeRequest[A](innerSelection: SelectionBuilder[AutoMergeRequest, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("autoMergeRequest", OptionOf(Obj(innerSelection)))

  /** Identifies the base Ref associated with the pull request.
    */
  def baseRef[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("baseRef", OptionOf(Obj(innerSelection)))

  /** Identifies the name of the base Ref associated with the pull request, even if the ref has been deleted.
    */
  def baseRefName: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("baseRefName", Scalar())

  /** Identifies the oid of the base ref associated with the pull request, even if the ref has been deleted.
    */
  def baseRefOid: SelectionBuilder[PullRequest, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("baseRefOid", Scalar())

  /** The repository associated with this pull request's base Ref.
    */
  def baseRepository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("baseRepository", OptionOf(Obj(innerSelection)))

  /** The body as Markdown.
    */
  def body: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[PullRequest, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The body rendered to text.
    */
  def bodyText: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** Whether or not the pull request is rebaseable.
    */
  def canBeRebased: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("canBeRebased", Scalar())

  /** The number of changed files in this pull request.
    */
  def changedFiles: SelectionBuilder[PullRequest, Int] = _root_.caliban.client.SelectionBuilder.Field("changedFiles", Scalar())

  /** The HTTP path for the checks of this pull request.
    */
  def checksResourcePath: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("checksResourcePath", Scalar())

  /** The HTTP URL for the checks of this pull request.
    */
  def checksUrl: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("checksUrl", Scalar())

  /** `true` if the pull request is closed
    */
  def closed: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("closed", Scalar())

  /** Identifies the date and time when the object was closed.
    */
  def closedAt: SelectionBuilder[PullRequest, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("closedAt", OptionOf(Scalar()))

  /** List of issues that were may be closed by this pull request
    */
  def closingIssuesReferences[A](
    after: Option[String]       = None,
    before: Option[String]      = None,
    first: Option[Int]          = None,
    last: Option[Int]           = None,
    orderBy: Option[IssueOrder] = None
  )(innerSelection: SelectionBuilder[IssueConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[IssueOrder]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "closingIssuesReferences",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "IssueOrder")(encoder4)
    )
  )

  /** A list of comments associated with the pull request.
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
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** A list of commits present in this pull request's head branch not present in the base branch.
    */
  def commits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PullRequestCommitConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "commits",
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
  def createdAt: SelectionBuilder[PullRequest, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[PullRequest, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The number of deletions in this pull request.
    */
  def deletions: SelectionBuilder[PullRequest, Int] = _root_.caliban.client.SelectionBuilder.Field("deletions", Scalar())

  /** The actor who edited this pull request's body.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Lists the files changed within this pull request.
    */
  def files[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PullRequestChangedFileConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "files",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Identifies the head Ref associated with the pull request.
    */
  def headRef[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("headRef", OptionOf(Obj(innerSelection)))

  /** Identifies the name of the head Ref associated with the pull request, even if the ref has been deleted.
    */
  def headRefName: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("headRefName", Scalar())

  /** Identifies the oid of the head ref associated with the pull request, even if the ref has been deleted.
    */
  def headRefOid: SelectionBuilder[PullRequest, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("headRefOid", Scalar())

  /** The repository associated with this pull request's head Ref.
    */
  def headRepository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("headRepository", OptionOf(Obj(innerSelection)))

  /** The owner of the repository associated with this pull request's head Ref.
    */
  def headRepositoryOwner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "headRepositoryOwner",
    OptionOf(ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))
  )

  /** The hovercard information for this issue
    */
  def hovercard[A](includeNotificationContexts: Option[Boolean] = None)(
    innerSelection: SelectionBuilder[Hovercard, A]
  )(implicit encoder0: ArgEncoder[Option[Boolean]]): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "hovercard",
    Obj(innerSelection),
    arguments = List(Argument("includeNotificationContexts", includeNotificationContexts, "Boolean")(encoder0))
  )
  def id: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** The head and base repositories are different.
    */
  def isCrossRepository: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCrossRepository", Scalar())

  /** Identifies if the pull request is a draft.
    */
  def isDraft: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDraft", Scalar())

  /** Is this pull request read by the viewer
    */
  def isReadByViewer: SelectionBuilder[PullRequest, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("isReadByViewer", OptionOf(Scalar()))

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
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def lastEditedAt: SelectionBuilder[PullRequest, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** A list of latest reviews per user associated with the pull request.
    */
  def latestOpinionatedReviews[A](
    after: Option[String]        = None,
    before: Option[String]       = None,
    first: Option[Int]           = None,
    last: Option[Int]            = None,
    writersOnly: Option[Boolean] = None
  )(innerSelection: SelectionBuilder[PullRequestReviewConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "latestOpinionatedReviews",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("writersOnly", writersOnly, "Boolean")(encoder4)
    )
  )

  /** A list of latest reviews per user associated with the pull request that are not also pending review.
    */
  def latestReviews[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PullRequestReviewConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "latestReviews",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** `true` if the pull request is locked
    */
  def locked: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("locked", Scalar())

  /** Indicates whether maintainers can modify the pull request.
    */
  def maintainerCanModify: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("maintainerCanModify", Scalar())

  /** The commit that was created when this pull request was merged.
    */
  def mergeCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("mergeCommit", OptionOf(Obj(innerSelection)))

  /** Detailed information about the current pull request merge state status.
    */
  def mergeStateStatus: SelectionBuilder[PullRequest, MergeStateStatus] = _root_.caliban.client.SelectionBuilder.Field("mergeStateStatus", Scalar())

  /** Whether or not the pull request can be merged based on the existence of merge conflicts.
    */
  def mergeable: SelectionBuilder[PullRequest, MergeableState] = _root_.caliban.client.SelectionBuilder.Field("mergeable", Scalar())

  /** Whether or not the pull request was merged.
    */
  def merged: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("merged", Scalar())

  /** The date and time that the pull request was merged.
    */
  def mergedAt: SelectionBuilder[PullRequest, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("mergedAt", OptionOf(Scalar()))

  /** The actor who merged the pull request.
    */
  def mergedBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "mergedBy",
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

  /** Identifies the milestone associated with the pull request.
    */
  def milestone[A](innerSelection: SelectionBuilder[Milestone, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("milestone", OptionOf(Obj(innerSelection)))

  /** Identifies the pull request number.
    */
  def number: SelectionBuilder[PullRequest, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** A list of Users that are participating in the Pull Request conversation.
    */
  def participants[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "participants",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The permalink to the pull request.
    */
  def permalink: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("permalink", Scalar())

  /** The commit that GitHub automatically generated to test if this pull request
    * could be merged. This field will not return a value if the pull request is
    * merged, or if the test merge commit is still being generated. See the
    * `mergeable` field for more details on the mergeability of the pull request.
    */
  def potentialMergeCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("potentialMergeCommit", OptionOf(Obj(innerSelection)))

  /** List of project cards associated with this pull request.
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
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def publishedAt: SelectionBuilder[PullRequest, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[PullRequest, Option[List[A]]] =
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
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequest, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this pull request.
    */
  def resourcePath: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP path for reverting this pull request.
    */
  def revertResourcePath: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("revertResourcePath", Scalar())

  /** The HTTP URL for reverting this pull request.
    */
  def revertUrl: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("revertUrl", Scalar())

  /** The current status of this pull request with respect to code review.
    */
  def reviewDecision: SelectionBuilder[PullRequest, Option[PullRequestReviewDecision]] =
    _root_.caliban.client.SelectionBuilder.Field("reviewDecision", OptionOf(Scalar()))

  /** A list of review requests associated with the pull request.
    */
  def reviewRequests[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ReviewRequestConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "reviewRequests",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The list of all review threads for this pull request.
    */
  def reviewThreads[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PullRequestReviewThreadConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reviewThreads",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of reviews associated with the pull request.
    */
  def reviews[A](
    after: Option[String]                        = None,
    author: Option[String]                       = None,
    before: Option[String]                       = None,
    first: Option[Int]                           = None,
    last: Option[Int]                            = None,
    states: Option[List[PullRequestReviewState]] = None
  )(innerSelection: SelectionBuilder[PullRequestReviewConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[List[PullRequestReviewState]]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "reviews",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("author", author, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("states", states, "[PullRequestReviewState!]")(encoder5)
    )
  )

  /** Identifies the state of the pull request.
    */
  def state: SelectionBuilder[PullRequest, PullRequestState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** A list of reviewer suggestions based on commit history and past review comments.
    */
  def suggestedReviewers[A](innerSelection: SelectionBuilder[SuggestedReviewer, A]): SelectionBuilder[PullRequest, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("suggestedReviewers", ListOf(OptionOf(Obj(innerSelection))))

  /** A list of events, comments, commits, etc. associated with the pull request.
    */
  @deprecated("`timeline` will be removed Use PullRequest.timelineItems instead. Removal on 2020-10-01 UTC.", "")
  def timeline[A](
    after: Option[String]   = None,
    before: Option[String]  = None,
    first: Option[Int]      = None,
    last: Option[Int]       = None,
    since: Option[DateTime] = None
  )(innerSelection: SelectionBuilder[PullRequestTimelineConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[DateTime]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** A list of events, comments, commits, etc. associated with the pull request.
    */
  def timelineItems[A](
    after: Option[String]                                     = None,
    before: Option[String]                                    = None,
    first: Option[Int]                                        = None,
    itemTypes: Option[List[PullRequestTimelineItemsItemType]] = None,
    last: Option[Int]                                         = None,
    since: Option[DateTime]                                   = None,
    skip: Option[Int]                                         = None
  )(innerSelection: SelectionBuilder[PullRequestTimelineItemsConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[List[PullRequestTimelineItemsItemType]]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[DateTime]],
    encoder6: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "timelineItems",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("itemTypes", itemTypes, "[PullRequestTimelineItemsItemType!]")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("since", since, "DateTime")(encoder5),
      Argument("skip", skip, "Int")(encoder6)
    )
  )

  /** Identifies the pull request title.
    */
  def title: SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Identifies the pull request title rendered to HTML.
    */
  def titleHTML: SelectionBuilder[PullRequest, HTML] = _root_.caliban.client.SelectionBuilder.Field("titleHTML", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[PullRequest, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this pull request.
    */
  def url: SelectionBuilder[PullRequest, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "userContentEdits",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Whether or not the viewer can apply suggestion.
    */
  def viewerCanApplySuggestion: SelectionBuilder[PullRequest, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanApplySuggestion", Scalar())

  /** Check if the viewer can restore the deleted head ref.
    */
  def viewerCanDeleteHeadRef: SelectionBuilder[PullRequest, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanDeleteHeadRef", Scalar())

  /** Whether or not the viewer can disable auto-merge
    */
  def viewerCanDisableAutoMerge: SelectionBuilder[PullRequest, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanDisableAutoMerge", Scalar())

  /** Whether or not the viewer can enable auto-merge
    */
  def viewerCanEnableAutoMerge: SelectionBuilder[PullRequest, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanEnableAutoMerge", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[PullRequest, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[PullRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())

  /** The latest review given from the viewer.
    */
  def viewerLatestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerLatestReview", OptionOf(Obj(innerSelection)))

  /** The person who has requested the viewer for review on this pull request.
    */
  def viewerLatestReviewRequest[A](innerSelection: SelectionBuilder[ReviewRequest, A]): SelectionBuilder[PullRequest, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerLatestReviewRequest", OptionOf(Obj(innerSelection)))

  /** The merge body text for the viewer and method.
    */
  def viewerMergeBodyText(
    mergeType: Option[PullRequestMergeMethod] = None
  )(implicit encoder0: ArgEncoder[Option[PullRequestMergeMethod]]): SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder
    .Field("viewerMergeBodyText", Scalar(), arguments = List(Argument("mergeType", mergeType, "PullRequestMergeMethod")(encoder0)))

  /** The merge headline text for the viewer and method.
    */
  def viewerMergeHeadlineText(
    mergeType: Option[PullRequestMergeMethod] = None
  )(implicit encoder0: ArgEncoder[Option[PullRequestMergeMethod]]): SelectionBuilder[PullRequest, String] = _root_.caliban.client.SelectionBuilder
    .Field("viewerMergeHeadlineText", Scalar(), arguments = List(Argument("mergeType", mergeType, "PullRequestMergeMethod")(encoder0)))

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[PullRequest, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))
}

