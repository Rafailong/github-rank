package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestTimelineItemsConnection {

  /** A list of edges.
    */
  def edges[A](
    innerSelection: SelectionBuilder[PullRequestTimelineItemsEdge, A]
  ): SelectionBuilder[PullRequestTimelineItemsConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Identifies the count of items after applying `before` and `after` filters.
    */
  def filteredCount: SelectionBuilder[PullRequestTimelineItemsConnection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("filteredCount", Scalar())

  /** A list of nodes.
    */
  def nodes[A](
    onAddedToProjectEvent: SelectionBuilder[AddedToProjectEvent, A],
    onAssignedEvent: SelectionBuilder[AssignedEvent, A],
    onAutoMergeDisabledEvent: SelectionBuilder[AutoMergeDisabledEvent, A],
    onAutoMergeEnabledEvent: SelectionBuilder[AutoMergeEnabledEvent, A],
    onAutoRebaseEnabledEvent: SelectionBuilder[AutoRebaseEnabledEvent, A],
    onAutoSquashEnabledEvent: SelectionBuilder[AutoSquashEnabledEvent, A],
    onAutomaticBaseChangeFailedEvent: SelectionBuilder[AutomaticBaseChangeFailedEvent, A],
    onAutomaticBaseChangeSucceededEvent: SelectionBuilder[AutomaticBaseChangeSucceededEvent, A],
    onBaseRefChangedEvent: SelectionBuilder[BaseRefChangedEvent, A],
    onBaseRefDeletedEvent: SelectionBuilder[BaseRefDeletedEvent, A],
    onBaseRefForcePushedEvent: SelectionBuilder[BaseRefForcePushedEvent, A],
    onClosedEvent: SelectionBuilder[ClosedEvent, A],
    onCommentDeletedEvent: SelectionBuilder[CommentDeletedEvent, A],
    onConnectedEvent: SelectionBuilder[ConnectedEvent, A],
    onConvertToDraftEvent: SelectionBuilder[ConvertToDraftEvent, A],
    onConvertedNoteToIssueEvent: SelectionBuilder[ConvertedNoteToIssueEvent, A],
    onCrossReferencedEvent: SelectionBuilder[CrossReferencedEvent, A],
    onDemilestonedEvent: SelectionBuilder[DemilestonedEvent, A],
    onDeployedEvent: SelectionBuilder[DeployedEvent, A],
    onDeploymentEnvironmentChangedEvent: SelectionBuilder[DeploymentEnvironmentChangedEvent, A],
    onDisconnectedEvent: SelectionBuilder[DisconnectedEvent, A],
    onHeadRefDeletedEvent: SelectionBuilder[HeadRefDeletedEvent, A],
    onHeadRefForcePushedEvent: SelectionBuilder[HeadRefForcePushedEvent, A],
    onHeadRefRestoredEvent: SelectionBuilder[HeadRefRestoredEvent, A],
    onIssueComment: SelectionBuilder[IssueComment, A],
    onLabeledEvent: SelectionBuilder[LabeledEvent, A],
    onLockedEvent: SelectionBuilder[LockedEvent, A],
    onMarkedAsDuplicateEvent: SelectionBuilder[MarkedAsDuplicateEvent, A],
    onMentionedEvent: SelectionBuilder[MentionedEvent, A],
    onMergedEvent: SelectionBuilder[MergedEvent, A],
    onMilestonedEvent: SelectionBuilder[MilestonedEvent, A],
    onMovedColumnsInProjectEvent: SelectionBuilder[MovedColumnsInProjectEvent, A],
    onPinnedEvent: SelectionBuilder[PinnedEvent, A],
    onPullRequestCommit: SelectionBuilder[PullRequestCommit, A],
    onPullRequestCommitCommentThread: SelectionBuilder[PullRequestCommitCommentThread, A],
    onPullRequestReview: SelectionBuilder[PullRequestReview, A],
    onPullRequestReviewThread: SelectionBuilder[PullRequestReviewThread, A],
    onPullRequestRevisionMarker: SelectionBuilder[PullRequestRevisionMarker, A],
    onReadyForReviewEvent: SelectionBuilder[ReadyForReviewEvent, A],
    onReferencedEvent: SelectionBuilder[ReferencedEvent, A],
    onRemovedFromProjectEvent: SelectionBuilder[RemovedFromProjectEvent, A],
    onRenamedTitleEvent: SelectionBuilder[RenamedTitleEvent, A],
    onReopenedEvent: SelectionBuilder[ReopenedEvent, A],
    onReviewDismissedEvent: SelectionBuilder[ReviewDismissedEvent, A],
    onReviewRequestRemovedEvent: SelectionBuilder[ReviewRequestRemovedEvent, A],
    onReviewRequestedEvent: SelectionBuilder[ReviewRequestedEvent, A],
    onSubscribedEvent: SelectionBuilder[SubscribedEvent, A],
    onTransferredEvent: SelectionBuilder[TransferredEvent, A],
    onUnassignedEvent: SelectionBuilder[UnassignedEvent, A],
    onUnlabeledEvent: SelectionBuilder[UnlabeledEvent, A],
    onUnlockedEvent: SelectionBuilder[UnlockedEvent, A],
    onUnmarkedAsDuplicateEvent: SelectionBuilder[UnmarkedAsDuplicateEvent, A],
    onUnpinnedEvent: SelectionBuilder[UnpinnedEvent, A],
    onUnsubscribedEvent: SelectionBuilder[UnsubscribedEvent, A],
    onUserBlockedEvent: SelectionBuilder[UserBlockedEvent, A]
  ): SelectionBuilder[PullRequestTimelineItemsConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
        OptionOf(
          ChoiceOf(
            Map(
              "AddedToProjectEvent"               -> Obj(onAddedToProjectEvent),
              "AssignedEvent"                     -> Obj(onAssignedEvent),
              "AutoMergeDisabledEvent"            -> Obj(onAutoMergeDisabledEvent),
              "AutoMergeEnabledEvent"             -> Obj(onAutoMergeEnabledEvent),
              "AutoRebaseEnabledEvent"            -> Obj(onAutoRebaseEnabledEvent),
              "AutoSquashEnabledEvent"            -> Obj(onAutoSquashEnabledEvent),
              "AutomaticBaseChangeFailedEvent"    -> Obj(onAutomaticBaseChangeFailedEvent),
              "AutomaticBaseChangeSucceededEvent" -> Obj(onAutomaticBaseChangeSucceededEvent),
              "BaseRefChangedEvent"               -> Obj(onBaseRefChangedEvent),
              "BaseRefDeletedEvent"               -> Obj(onBaseRefDeletedEvent),
              "BaseRefForcePushedEvent"           -> Obj(onBaseRefForcePushedEvent),
              "ClosedEvent"                       -> Obj(onClosedEvent),
              "CommentDeletedEvent"               -> Obj(onCommentDeletedEvent),
              "ConnectedEvent"                    -> Obj(onConnectedEvent),
              "ConvertToDraftEvent"               -> Obj(onConvertToDraftEvent),
              "ConvertedNoteToIssueEvent"         -> Obj(onConvertedNoteToIssueEvent),
              "CrossReferencedEvent"              -> Obj(onCrossReferencedEvent),
              "DemilestonedEvent"                 -> Obj(onDemilestonedEvent),
              "DeployedEvent"                     -> Obj(onDeployedEvent),
              "DeploymentEnvironmentChangedEvent" -> Obj(onDeploymentEnvironmentChangedEvent),
              "DisconnectedEvent"                 -> Obj(onDisconnectedEvent),
              "HeadRefDeletedEvent"               -> Obj(onHeadRefDeletedEvent),
              "HeadRefForcePushedEvent"           -> Obj(onHeadRefForcePushedEvent),
              "HeadRefRestoredEvent"              -> Obj(onHeadRefRestoredEvent),
              "IssueComment"                      -> Obj(onIssueComment),
              "LabeledEvent"                      -> Obj(onLabeledEvent),
              "LockedEvent"                       -> Obj(onLockedEvent),
              "MarkedAsDuplicateEvent"            -> Obj(onMarkedAsDuplicateEvent),
              "MentionedEvent"                    -> Obj(onMentionedEvent),
              "MergedEvent"                       -> Obj(onMergedEvent),
              "MilestonedEvent"                   -> Obj(onMilestonedEvent),
              "MovedColumnsInProjectEvent"        -> Obj(onMovedColumnsInProjectEvent),
              "PinnedEvent"                       -> Obj(onPinnedEvent),
              "PullRequestCommit"                 -> Obj(onPullRequestCommit),
              "PullRequestCommitCommentThread"    -> Obj(onPullRequestCommitCommentThread),
              "PullRequestReview"                 -> Obj(onPullRequestReview),
              "PullRequestReviewThread"           -> Obj(onPullRequestReviewThread),
              "PullRequestRevisionMarker"         -> Obj(onPullRequestRevisionMarker),
              "ReadyForReviewEvent"               -> Obj(onReadyForReviewEvent),
              "ReferencedEvent"                   -> Obj(onReferencedEvent),
              "RemovedFromProjectEvent"           -> Obj(onRemovedFromProjectEvent),
              "RenamedTitleEvent"                 -> Obj(onRenamedTitleEvent),
              "ReopenedEvent"                     -> Obj(onReopenedEvent),
              "ReviewDismissedEvent"              -> Obj(onReviewDismissedEvent),
              "ReviewRequestRemovedEvent"         -> Obj(onReviewRequestRemovedEvent),
              "ReviewRequestedEvent"              -> Obj(onReviewRequestedEvent),
              "SubscribedEvent"                   -> Obj(onSubscribedEvent),
              "TransferredEvent"                  -> Obj(onTransferredEvent),
              "UnassignedEvent"                   -> Obj(onUnassignedEvent),
              "UnlabeledEvent"                    -> Obj(onUnlabeledEvent),
              "UnlockedEvent"                     -> Obj(onUnlockedEvent),
              "UnmarkedAsDuplicateEvent"          -> Obj(onUnmarkedAsDuplicateEvent),
              "UnpinnedEvent"                     -> Obj(onUnpinnedEvent),
              "UnsubscribedEvent"                 -> Obj(onUnsubscribedEvent),
              "UserBlockedEvent"                  -> Obj(onUserBlockedEvent)
            )
          )
        )
      )
    )
  )

  /** Identifies the count of items after applying `before`/`after` filters and `first`/`last`/`skip` slicing.
    */
  def pageCount: SelectionBuilder[PullRequestTimelineItemsConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("pageCount", Scalar())

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[PullRequestTimelineItemsConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[PullRequestTimelineItemsConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** Identifies the date and time when the timeline was last updated.
    */
  def updatedAt: SelectionBuilder[PullRequestTimelineItemsConnection, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

