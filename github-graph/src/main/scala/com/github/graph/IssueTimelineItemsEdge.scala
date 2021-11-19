package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IssueTimelineItemsEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[IssueTimelineItemsEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
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
  ): SelectionBuilder[IssueTimelineItemsEdge, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
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

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onAddedToProjectEvent: Option[SelectionBuilder[AddedToProjectEvent, A]]               = None,
    onAssignedEvent: Option[SelectionBuilder[AssignedEvent, A]]                           = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                               = None,
    onCommentDeletedEvent: Option[SelectionBuilder[CommentDeletedEvent, A]]               = None,
    onConnectedEvent: Option[SelectionBuilder[ConnectedEvent, A]]                         = None,
    onConvertedNoteToIssueEvent: Option[SelectionBuilder[ConvertedNoteToIssueEvent, A]]   = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]]             = None,
    onDemilestonedEvent: Option[SelectionBuilder[DemilestonedEvent, A]]                   = None,
    onDisconnectedEvent: Option[SelectionBuilder[DisconnectedEvent, A]]                   = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                             = None,
    onLabeledEvent: Option[SelectionBuilder[LabeledEvent, A]]                             = None,
    onLockedEvent: Option[SelectionBuilder[LockedEvent, A]]                               = None,
    onMarkedAsDuplicateEvent: Option[SelectionBuilder[MarkedAsDuplicateEvent, A]]         = None,
    onMentionedEvent: Option[SelectionBuilder[MentionedEvent, A]]                         = None,
    onMilestonedEvent: Option[SelectionBuilder[MilestonedEvent, A]]                       = None,
    onMovedColumnsInProjectEvent: Option[SelectionBuilder[MovedColumnsInProjectEvent, A]] = None,
    onPinnedEvent: Option[SelectionBuilder[PinnedEvent, A]]                               = None,
    onReferencedEvent: Option[SelectionBuilder[ReferencedEvent, A]]                       = None,
    onRemovedFromProjectEvent: Option[SelectionBuilder[RemovedFromProjectEvent, A]]       = None,
    onRenamedTitleEvent: Option[SelectionBuilder[RenamedTitleEvent, A]]                   = None,
    onReopenedEvent: Option[SelectionBuilder[ReopenedEvent, A]]                           = None,
    onSubscribedEvent: Option[SelectionBuilder[SubscribedEvent, A]]                       = None,
    onTransferredEvent: Option[SelectionBuilder[TransferredEvent, A]]                     = None,
    onUnassignedEvent: Option[SelectionBuilder[UnassignedEvent, A]]                       = None,
    onUnlabeledEvent: Option[SelectionBuilder[UnlabeledEvent, A]]                         = None,
    onUnlockedEvent: Option[SelectionBuilder[UnlockedEvent, A]]                           = None,
    onUnmarkedAsDuplicateEvent: Option[SelectionBuilder[UnmarkedAsDuplicateEvent, A]]     = None,
    onUnpinnedEvent: Option[SelectionBuilder[UnpinnedEvent, A]]                           = None,
    onUnsubscribedEvent: Option[SelectionBuilder[UnsubscribedEvent, A]]                   = None,
    onUserBlockedEvent: Option[SelectionBuilder[UserBlockedEvent, A]]                     = None
  ): SelectionBuilder[IssueTimelineItemsEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "AddedToProjectEvent"        -> onAddedToProjectEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "AssignedEvent"              -> onAssignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ClosedEvent"                -> onClosedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "CommentDeletedEvent"        -> onCommentDeletedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ConnectedEvent"             -> onConnectedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ConvertedNoteToIssueEvent"  -> onConvertedNoteToIssueEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "CrossReferencedEvent"       -> onCrossReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DemilestonedEvent"          -> onDemilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DisconnectedEvent"          -> onDisconnectedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "IssueComment"               -> onIssueComment.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LabeledEvent"               -> onLabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LockedEvent"                -> onLockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MarkedAsDuplicateEvent"     -> onMarkedAsDuplicateEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MentionedEvent"             -> onMentionedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MilestonedEvent"            -> onMilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MovedColumnsInProjectEvent" -> onMovedColumnsInProjectEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PinnedEvent"                -> onPinnedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReferencedEvent"            -> onReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RemovedFromProjectEvent"    -> onRemovedFromProjectEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RenamedTitleEvent"          -> onRenamedTitleEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReopenedEvent"              -> onReopenedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "SubscribedEvent"            -> onSubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TransferredEvent"           -> onTransferredEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnassignedEvent"            -> onUnassignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlabeledEvent"             -> onUnlabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlockedEvent"              -> onUnlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnmarkedAsDuplicateEvent"   -> onUnmarkedAsDuplicateEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnpinnedEvent"              -> onUnpinnedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnsubscribedEvent"          -> onUnsubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UserBlockedEvent"           -> onUserBlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

