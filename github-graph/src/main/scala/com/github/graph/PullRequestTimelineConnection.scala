package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestTimelineConnection {

  /** A list of edges.
    */
  def edges[A](
    innerSelection: SelectionBuilder[PullRequestTimelineItemEdge, A]
  ): SelectionBuilder[PullRequestTimelineConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
    onAssignedEvent: SelectionBuilder[AssignedEvent, A],
    onBaseRefDeletedEvent: SelectionBuilder[BaseRefDeletedEvent, A],
    onBaseRefForcePushedEvent: SelectionBuilder[BaseRefForcePushedEvent, A],
    onClosedEvent: SelectionBuilder[ClosedEvent, A],
    onCommit: SelectionBuilder[Commit, A],
    onCommitCommentThread: SelectionBuilder[CommitCommentThread, A],
    onCrossReferencedEvent: SelectionBuilder[CrossReferencedEvent, A],
    onDemilestonedEvent: SelectionBuilder[DemilestonedEvent, A],
    onDeployedEvent: SelectionBuilder[DeployedEvent, A],
    onDeploymentEnvironmentChangedEvent: SelectionBuilder[DeploymentEnvironmentChangedEvent, A],
    onHeadRefDeletedEvent: SelectionBuilder[HeadRefDeletedEvent, A],
    onHeadRefForcePushedEvent: SelectionBuilder[HeadRefForcePushedEvent, A],
    onHeadRefRestoredEvent: SelectionBuilder[HeadRefRestoredEvent, A],
    onIssueComment: SelectionBuilder[IssueComment, A],
    onLabeledEvent: SelectionBuilder[LabeledEvent, A],
    onLockedEvent: SelectionBuilder[LockedEvent, A],
    onMergedEvent: SelectionBuilder[MergedEvent, A],
    onMilestonedEvent: SelectionBuilder[MilestonedEvent, A],
    onPullRequestReview: SelectionBuilder[PullRequestReview, A],
    onPullRequestReviewComment: SelectionBuilder[PullRequestReviewComment, A],
    onPullRequestReviewThread: SelectionBuilder[PullRequestReviewThread, A],
    onReferencedEvent: SelectionBuilder[ReferencedEvent, A],
    onRenamedTitleEvent: SelectionBuilder[RenamedTitleEvent, A],
    onReopenedEvent: SelectionBuilder[ReopenedEvent, A],
    onReviewDismissedEvent: SelectionBuilder[ReviewDismissedEvent, A],
    onReviewRequestRemovedEvent: SelectionBuilder[ReviewRequestRemovedEvent, A],
    onReviewRequestedEvent: SelectionBuilder[ReviewRequestedEvent, A],
    onSubscribedEvent: SelectionBuilder[SubscribedEvent, A],
    onUnassignedEvent: SelectionBuilder[UnassignedEvent, A],
    onUnlabeledEvent: SelectionBuilder[UnlabeledEvent, A],
    onUnlockedEvent: SelectionBuilder[UnlockedEvent, A],
    onUnsubscribedEvent: SelectionBuilder[UnsubscribedEvent, A],
    onUserBlockedEvent: SelectionBuilder[UserBlockedEvent, A]
  ): SelectionBuilder[PullRequestTimelineConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
        OptionOf(
          ChoiceOf(
            Map(
              "AssignedEvent"                     -> Obj(onAssignedEvent),
              "BaseRefDeletedEvent"               -> Obj(onBaseRefDeletedEvent),
              "BaseRefForcePushedEvent"           -> Obj(onBaseRefForcePushedEvent),
              "ClosedEvent"                       -> Obj(onClosedEvent),
              "Commit"                            -> Obj(onCommit),
              "CommitCommentThread"               -> Obj(onCommitCommentThread),
              "CrossReferencedEvent"              -> Obj(onCrossReferencedEvent),
              "DemilestonedEvent"                 -> Obj(onDemilestonedEvent),
              "DeployedEvent"                     -> Obj(onDeployedEvent),
              "DeploymentEnvironmentChangedEvent" -> Obj(onDeploymentEnvironmentChangedEvent),
              "HeadRefDeletedEvent"               -> Obj(onHeadRefDeletedEvent),
              "HeadRefForcePushedEvent"           -> Obj(onHeadRefForcePushedEvent),
              "HeadRefRestoredEvent"              -> Obj(onHeadRefRestoredEvent),
              "IssueComment"                      -> Obj(onIssueComment),
              "LabeledEvent"                      -> Obj(onLabeledEvent),
              "LockedEvent"                       -> Obj(onLockedEvent),
              "MergedEvent"                       -> Obj(onMergedEvent),
              "MilestonedEvent"                   -> Obj(onMilestonedEvent),
              "PullRequestReview"                 -> Obj(onPullRequestReview),
              "PullRequestReviewComment"          -> Obj(onPullRequestReviewComment),
              "PullRequestReviewThread"           -> Obj(onPullRequestReviewThread),
              "ReferencedEvent"                   -> Obj(onReferencedEvent),
              "RenamedTitleEvent"                 -> Obj(onRenamedTitleEvent),
              "ReopenedEvent"                     -> Obj(onReopenedEvent),
              "ReviewDismissedEvent"              -> Obj(onReviewDismissedEvent),
              "ReviewRequestRemovedEvent"         -> Obj(onReviewRequestRemovedEvent),
              "ReviewRequestedEvent"              -> Obj(onReviewRequestedEvent),
              "SubscribedEvent"                   -> Obj(onSubscribedEvent),
              "UnassignedEvent"                   -> Obj(onUnassignedEvent),
              "UnlabeledEvent"                    -> Obj(onUnlabeledEvent),
              "UnlockedEvent"                     -> Obj(onUnlockedEvent),
              "UnsubscribedEvent"                 -> Obj(onUnsubscribedEvent),
              "UserBlockedEvent"                  -> Obj(onUserBlockedEvent)
            )
          )
        )
      )
    )
  )

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[PullRequestTimelineConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[PullRequestTimelineConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

