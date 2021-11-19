package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestTimelineItemEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[PullRequestTimelineItemEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
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
  ): SelectionBuilder[PullRequestTimelineItemEdge, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
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

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onAssignedEvent: Option[SelectionBuilder[AssignedEvent, A]]                                         = None,
    onBaseRefDeletedEvent: Option[SelectionBuilder[BaseRefDeletedEvent, A]]                             = None,
    onBaseRefForcePushedEvent: Option[SelectionBuilder[BaseRefForcePushedEvent, A]]                     = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                                             = None,
    onCommit: Option[SelectionBuilder[Commit, A]]                                                       = None,
    onCommitCommentThread: Option[SelectionBuilder[CommitCommentThread, A]]                             = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]]                           = None,
    onDemilestonedEvent: Option[SelectionBuilder[DemilestonedEvent, A]]                                 = None,
    onDeployedEvent: Option[SelectionBuilder[DeployedEvent, A]]                                         = None,
    onDeploymentEnvironmentChangedEvent: Option[SelectionBuilder[DeploymentEnvironmentChangedEvent, A]] = None,
    onHeadRefDeletedEvent: Option[SelectionBuilder[HeadRefDeletedEvent, A]]                             = None,
    onHeadRefForcePushedEvent: Option[SelectionBuilder[HeadRefForcePushedEvent, A]]                     = None,
    onHeadRefRestoredEvent: Option[SelectionBuilder[HeadRefRestoredEvent, A]]                           = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                                           = None,
    onLabeledEvent: Option[SelectionBuilder[LabeledEvent, A]]                                           = None,
    onLockedEvent: Option[SelectionBuilder[LockedEvent, A]]                                             = None,
    onMergedEvent: Option[SelectionBuilder[MergedEvent, A]]                                             = None,
    onMilestonedEvent: Option[SelectionBuilder[MilestonedEvent, A]]                                     = None,
    onPullRequestReview: Option[SelectionBuilder[PullRequestReview, A]]                                 = None,
    onPullRequestReviewComment: Option[SelectionBuilder[PullRequestReviewComment, A]]                   = None,
    onPullRequestReviewThread: Option[SelectionBuilder[PullRequestReviewThread, A]]                     = None,
    onReferencedEvent: Option[SelectionBuilder[ReferencedEvent, A]]                                     = None,
    onRenamedTitleEvent: Option[SelectionBuilder[RenamedTitleEvent, A]]                                 = None,
    onReopenedEvent: Option[SelectionBuilder[ReopenedEvent, A]]                                         = None,
    onReviewDismissedEvent: Option[SelectionBuilder[ReviewDismissedEvent, A]]                           = None,
    onReviewRequestRemovedEvent: Option[SelectionBuilder[ReviewRequestRemovedEvent, A]]                 = None,
    onReviewRequestedEvent: Option[SelectionBuilder[ReviewRequestedEvent, A]]                           = None,
    onSubscribedEvent: Option[SelectionBuilder[SubscribedEvent, A]]                                     = None,
    onUnassignedEvent: Option[SelectionBuilder[UnassignedEvent, A]]                                     = None,
    onUnlabeledEvent: Option[SelectionBuilder[UnlabeledEvent, A]]                                       = None,
    onUnlockedEvent: Option[SelectionBuilder[UnlockedEvent, A]]                                         = None,
    onUnsubscribedEvent: Option[SelectionBuilder[UnsubscribedEvent, A]]                                 = None,
    onUserBlockedEvent: Option[SelectionBuilder[UserBlockedEvent, A]]                                   = None
  ): SelectionBuilder[PullRequestTimelineItemEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "AssignedEvent"                     -> onAssignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "BaseRefDeletedEvent"               -> onBaseRefDeletedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "BaseRefForcePushedEvent"           -> onBaseRefForcePushedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ClosedEvent"                       -> onClosedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Commit"                            -> onCommit.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "CommitCommentThread"               -> onCommitCommentThread.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "CrossReferencedEvent"              -> onCrossReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DemilestonedEvent"                 -> onDemilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DeployedEvent"                     -> onDeployedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DeploymentEnvironmentChangedEvent" -> onDeploymentEnvironmentChangedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "HeadRefDeletedEvent"               -> onHeadRefDeletedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "HeadRefForcePushedEvent"           -> onHeadRefForcePushedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "HeadRefRestoredEvent"              -> onHeadRefRestoredEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "IssueComment"                      -> onIssueComment.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LabeledEvent"                      -> onLabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LockedEvent"                       -> onLockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MergedEvent"                       -> onMergedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MilestonedEvent"                   -> onMilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequestReview"                 -> onPullRequestReview.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequestReviewComment"          -> onPullRequestReviewComment.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequestReviewThread"           -> onPullRequestReviewThread.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReferencedEvent"                   -> onReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RenamedTitleEvent"                 -> onRenamedTitleEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReopenedEvent"                     -> onReopenedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReviewDismissedEvent"              -> onReviewDismissedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReviewRequestRemovedEvent"         -> onReviewRequestRemovedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReviewRequestedEvent"              -> onReviewRequestedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "SubscribedEvent"                   -> onSubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnassignedEvent"                   -> onUnassignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlabeledEvent"                    -> onUnlabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlockedEvent"                     -> onUnlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnsubscribedEvent"                 -> onUnsubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UserBlockedEvent"                  -> onUserBlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

