package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IssueTimelineItemsConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[IssueTimelineItemsEdge, A]): SelectionBuilder[IssueTimelineItemsConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Identifies the count of items after applying `before` and `after` filters.
    */
  def filteredCount: SelectionBuilder[IssueTimelineItemsConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("filteredCount", Scalar())

  /** A list of nodes.
    */
  def nodes[A](
    onAddedToProjectEvent: SelectionBuilder[AddedToProjectEvent, A],
    onAssignedEvent: SelectionBuilder[AssignedEvent, A],
    onClosedEvent: SelectionBuilder[ClosedEvent, A],
    onCommentDeletedEvent: SelectionBuilder[CommentDeletedEvent, A],
    onConnectedEvent: SelectionBuilder[ConnectedEvent, A],
    onConvertedNoteToIssueEvent: SelectionBuilder[ConvertedNoteToIssueEvent, A],
    onCrossReferencedEvent: SelectionBuilder[CrossReferencedEvent, A],
    onDemilestonedEvent: SelectionBuilder[DemilestonedEvent, A],
    onDisconnectedEvent: SelectionBuilder[DisconnectedEvent, A],
    onIssueComment: SelectionBuilder[IssueComment, A],
    onLabeledEvent: SelectionBuilder[LabeledEvent, A],
    onLockedEvent: SelectionBuilder[LockedEvent, A],
    onMarkedAsDuplicateEvent: SelectionBuilder[MarkedAsDuplicateEvent, A],
    onMentionedEvent: SelectionBuilder[MentionedEvent, A],
    onMilestonedEvent: SelectionBuilder[MilestonedEvent, A],
    onMovedColumnsInProjectEvent: SelectionBuilder[MovedColumnsInProjectEvent, A],
    onPinnedEvent: SelectionBuilder[PinnedEvent, A],
    onReferencedEvent: SelectionBuilder[ReferencedEvent, A],
    onRemovedFromProjectEvent: SelectionBuilder[RemovedFromProjectEvent, A],
    onRenamedTitleEvent: SelectionBuilder[RenamedTitleEvent, A],
    onReopenedEvent: SelectionBuilder[ReopenedEvent, A],
    onSubscribedEvent: SelectionBuilder[SubscribedEvent, A],
    onTransferredEvent: SelectionBuilder[TransferredEvent, A],
    onUnassignedEvent: SelectionBuilder[UnassignedEvent, A],
    onUnlabeledEvent: SelectionBuilder[UnlabeledEvent, A],
    onUnlockedEvent: SelectionBuilder[UnlockedEvent, A],
    onUnmarkedAsDuplicateEvent: SelectionBuilder[UnmarkedAsDuplicateEvent, A],
    onUnpinnedEvent: SelectionBuilder[UnpinnedEvent, A],
    onUnsubscribedEvent: SelectionBuilder[UnsubscribedEvent, A],
    onUserBlockedEvent: SelectionBuilder[UserBlockedEvent, A]
  ): SelectionBuilder[IssueTimelineItemsConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
        OptionOf(
          ChoiceOf(
            Map(
              "AddedToProjectEvent"        -> Obj(onAddedToProjectEvent),
              "AssignedEvent"              -> Obj(onAssignedEvent),
              "ClosedEvent"                -> Obj(onClosedEvent),
              "CommentDeletedEvent"        -> Obj(onCommentDeletedEvent),
              "ConnectedEvent"             -> Obj(onConnectedEvent),
              "ConvertedNoteToIssueEvent"  -> Obj(onConvertedNoteToIssueEvent),
              "CrossReferencedEvent"       -> Obj(onCrossReferencedEvent),
              "DemilestonedEvent"          -> Obj(onDemilestonedEvent),
              "DisconnectedEvent"          -> Obj(onDisconnectedEvent),
              "IssueComment"               -> Obj(onIssueComment),
              "LabeledEvent"               -> Obj(onLabeledEvent),
              "LockedEvent"                -> Obj(onLockedEvent),
              "MarkedAsDuplicateEvent"     -> Obj(onMarkedAsDuplicateEvent),
              "MentionedEvent"             -> Obj(onMentionedEvent),
              "MilestonedEvent"            -> Obj(onMilestonedEvent),
              "MovedColumnsInProjectEvent" -> Obj(onMovedColumnsInProjectEvent),
              "PinnedEvent"                -> Obj(onPinnedEvent),
              "ReferencedEvent"            -> Obj(onReferencedEvent),
              "RemovedFromProjectEvent"    -> Obj(onRemovedFromProjectEvent),
              "RenamedTitleEvent"          -> Obj(onRenamedTitleEvent),
              "ReopenedEvent"              -> Obj(onReopenedEvent),
              "SubscribedEvent"            -> Obj(onSubscribedEvent),
              "TransferredEvent"           -> Obj(onTransferredEvent),
              "UnassignedEvent"            -> Obj(onUnassignedEvent),
              "UnlabeledEvent"             -> Obj(onUnlabeledEvent),
              "UnlockedEvent"              -> Obj(onUnlockedEvent),
              "UnmarkedAsDuplicateEvent"   -> Obj(onUnmarkedAsDuplicateEvent),
              "UnpinnedEvent"              -> Obj(onUnpinnedEvent),
              "UnsubscribedEvent"          -> Obj(onUnsubscribedEvent),
              "UserBlockedEvent"           -> Obj(onUserBlockedEvent)
            )
          )
        )
      )
    )
  )

  /** Identifies the count of items after applying `before`/`after` filters and `first`/`last`/`skip` slicing.
    */
  def pageCount: SelectionBuilder[IssueTimelineItemsConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("pageCount", Scalar())

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[IssueTimelineItemsConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[IssueTimelineItemsConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())

  /** Identifies the date and time when the timeline was last updated.
    */
  def updatedAt: SelectionBuilder[IssueTimelineItemsConnection, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

