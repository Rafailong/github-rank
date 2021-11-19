package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Reaction {

  /** Identifies the emoji reaction.
    */
  def content: SelectionBuilder[Reaction, ReactionContent] = _root_.caliban.client.SelectionBuilder.Field("content", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Reaction, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Reaction, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[Reaction, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The reactable piece of content
    */
  def reactable[A](
    onCommitComment: Option[SelectionBuilder[CommitComment, A]]                       = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]                             = None,
    onDiscussionComment: Option[SelectionBuilder[DiscussionComment, A]]               = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                                       = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                         = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]                           = None,
    onPullRequestReview: Option[SelectionBuilder[PullRequestReview, A]]               = None,
    onPullRequestReviewComment: Option[SelectionBuilder[PullRequestReviewComment, A]] = None,
    onRelease: Option[SelectionBuilder[Release, A]]                                   = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]]                     = None,
    onTeamDiscussionComment: Option[SelectionBuilder[TeamDiscussionComment, A]]       = None
  ): SelectionBuilder[Reaction, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reactable",
    ChoiceOf(
      Map(
        "CommitComment"            -> onCommitComment,
        "Discussion"               -> onDiscussion,
        "DiscussionComment"        -> onDiscussionComment,
        "Issue"                    -> onIssue,
        "IssueComment"             -> onIssueComment,
        "PullRequest"              -> onPullRequest,
        "PullRequestReview"        -> onPullRequestReview,
        "PullRequestReviewComment" -> onPullRequestReviewComment,
        "Release"                  -> onRelease,
        "TeamDiscussion"           -> onTeamDiscussion,
        "TeamDiscussionComment"    -> onTeamDiscussionComment
      ).collect { case (k, Some(v)) => k -> Obj(v) }
    )
  )

  /** Identifies the user who created this reaction.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Reaction, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

