package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddReactionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddReactionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The reaction object.
    */
  def reaction[A](innerSelection: SelectionBuilder[Reaction, A]): SelectionBuilder[AddReactionPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("reaction", OptionOf(Obj(innerSelection)))

  /** The reactable subject.
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
  ): SelectionBuilder[AddReactionPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "subject",
    OptionOf(
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
  )
}

