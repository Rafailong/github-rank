package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MinimizeCommentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[MinimizeCommentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The comment that was minimized.
    */
  def minimizedComment[A](
    onCommitComment: Option[SelectionBuilder[CommitComment, A]]                       = None,
    onDiscussionComment: Option[SelectionBuilder[DiscussionComment, A]]               = None,
    onGistComment: Option[SelectionBuilder[GistComment, A]]                           = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                         = None,
    onPullRequestReviewComment: Option[SelectionBuilder[PullRequestReviewComment, A]] = None
  ): SelectionBuilder[MinimizeCommentPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "minimizedComment",
    OptionOf(
      ChoiceOf(
        Map(
          "CommitComment"            -> onCommitComment,
          "DiscussionComment"        -> onDiscussionComment,
          "GistComment"              -> onGistComment,
          "IssueComment"             -> onIssueComment,
          "PullRequestReviewComment" -> onPullRequestReviewComment
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )
}

