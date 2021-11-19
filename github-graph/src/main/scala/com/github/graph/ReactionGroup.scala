package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReactionGroup {

  /** Identifies the emoji reaction.
    */
  def content: SelectionBuilder[ReactionGroup, ReactionContent] = _root_.caliban.client.SelectionBuilder.Field("content", Scalar())

  /** Identifies when the reaction was created.
    */
  def createdAt: SelectionBuilder[ReactionGroup, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("createdAt", OptionOf(Scalar()))

  /** Reactors to the reaction subject with the emotion represented by this reaction group.
    */
  def reactors[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ReactorConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ReactionGroup, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reactors",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The subject that was reacted to.
    */
  def subject[A](
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
  ): SelectionBuilder[ReactionGroup, A] = _root_.caliban.client.SelectionBuilder.Field(
    "subject",
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

  /** Users who have reacted to the reaction subject with the emotion represented by this reaction group
    */
  @deprecated("Reactors can now be mannequins, bots, and organizations. Use the `reactors` field instead. Removal on 2021-10-01 UTC.", "")
  def users[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ReactingUserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ReactionGroup, A] = _root_.caliban.client.SelectionBuilder.Field(
    "users",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Whether or not the authenticated user has left a reaction on the subject.
    */
  def viewerHasReacted: SelectionBuilder[ReactionGroup, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasReacted", Scalar())
}

