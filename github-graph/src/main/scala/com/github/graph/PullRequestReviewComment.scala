package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestReviewComment {

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PullRequestReviewComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def authorAssociation: SelectionBuilder[PullRequestReviewComment, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** The comment body of this review comment.
    */
  def body: SelectionBuilder[PullRequestReviewComment, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[PullRequestReviewComment, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The comment body of this review comment rendered as plain text.
    */
  def bodyText: SelectionBuilder[PullRequestReviewComment, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** Identifies the commit associated with the comment.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequestReviewComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** Identifies when the comment was created.
    */
  def createdAt: SelectionBuilder[PullRequestReviewComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[PullRequestReviewComment, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The diff hunk to which the comment applies.
    */
  def diffHunk: SelectionBuilder[PullRequestReviewComment, String] = _root_.caliban.client.SelectionBuilder.Field("diffHunk", Scalar())

  /** Identifies when the comment was created in a draft state.
    */
  def draftedAt: SelectionBuilder[PullRequestReviewComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("draftedAt", Scalar())

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PullRequestReviewComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def id: SelectionBuilder[PullRequestReviewComment, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[PullRequestReviewComment, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** Returns whether or not a comment has been minimized.
    */
  def isMinimized: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isMinimized", Scalar())

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[PullRequestReviewComment, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** Returns why the comment was minimized.
    */
  def minimizedReason: SelectionBuilder[PullRequestReviewComment, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("minimizedReason", OptionOf(Scalar()))

  /** Identifies the original commit associated with the comment.
    */
  def originalCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequestReviewComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("originalCommit", OptionOf(Obj(innerSelection)))

  /** The original line index in the diff to which the comment applies.
    */
  def originalPosition: SelectionBuilder[PullRequestReviewComment, Int] = _root_.caliban.client.SelectionBuilder.Field("originalPosition", Scalar())

  /** Identifies when the comment body is outdated
    */
  def outdated: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("outdated", Scalar())

  /** The path to which the comment applies.
    */
  def path: SelectionBuilder[PullRequestReviewComment, String] = _root_.caliban.client.SelectionBuilder.Field("path", Scalar())

  /** The line index in the diff to which the comment applies.
    */
  def position: SelectionBuilder[PullRequestReviewComment, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("position", OptionOf(Scalar()))

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[PullRequestReviewComment, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** The pull request associated with this review comment.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[PullRequestReviewComment, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The pull request review associated with this review comment.
    */
  def pullRequestReview[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[PullRequestReviewComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestReview", OptionOf(Obj(innerSelection)))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[PullRequestReviewComment, Option[List[A]]] =
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
  ): SelectionBuilder[PullRequestReviewComment, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The comment this is a reply to.
    */
  def replyTo[A](innerSelection: SelectionBuilder[PullRequestReviewComment, A]): SelectionBuilder[PullRequestReviewComment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("replyTo", OptionOf(Obj(innerSelection)))

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequestReviewComment, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path permalink for this review comment.
    */
  def resourcePath: SelectionBuilder[PullRequestReviewComment, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the state of the comment.
    */
  def state: SelectionBuilder[PullRequestReviewComment, PullRequestReviewCommentState] =
    _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** Identifies when the comment was last updated.
    */
  def updatedAt: SelectionBuilder[PullRequestReviewComment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL permalink for this review comment.
    */
  def url: SelectionBuilder[PullRequestReviewComment, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequestReviewComment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def viewerCanDelete: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelete", Scalar())

  /** Check if the current viewer can minimize this object.
    */
  def viewerCanMinimize: SelectionBuilder[PullRequestReviewComment, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanMinimize", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Reasons why the current viewer can not update this comment.
    */
  def viewerCannotUpdateReasons: SelectionBuilder[PullRequestReviewComment, List[CommentCannotUpdateReason]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCannotUpdateReasons", ListOf(Scalar()))

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[PullRequestReviewComment, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())
}

