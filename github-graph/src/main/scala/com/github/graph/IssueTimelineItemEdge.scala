package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IssueTimelineItemEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[IssueTimelineItemEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    onAssignedEvent: SelectionBuilder[AssignedEvent, A],
    onClosedEvent: SelectionBuilder[ClosedEvent, A],
    onCommit: SelectionBuilder[Commit, A],
    onCrossReferencedEvent: SelectionBuilder[CrossReferencedEvent, A],
    onDemilestonedEvent: SelectionBuilder[DemilestonedEvent, A],
    onIssueComment: SelectionBuilder[IssueComment, A],
    onLabeledEvent: SelectionBuilder[LabeledEvent, A],
    onLockedEvent: SelectionBuilder[LockedEvent, A],
    onMilestonedEvent: SelectionBuilder[MilestonedEvent, A],
    onReferencedEvent: SelectionBuilder[ReferencedEvent, A],
    onRenamedTitleEvent: SelectionBuilder[RenamedTitleEvent, A],
    onReopenedEvent: SelectionBuilder[ReopenedEvent, A],
    onSubscribedEvent: SelectionBuilder[SubscribedEvent, A],
    onTransferredEvent: SelectionBuilder[TransferredEvent, A],
    onUnassignedEvent: SelectionBuilder[UnassignedEvent, A],
    onUnlabeledEvent: SelectionBuilder[UnlabeledEvent, A],
    onUnlockedEvent: SelectionBuilder[UnlockedEvent, A],
    onUnsubscribedEvent: SelectionBuilder[UnsubscribedEvent, A],
    onUserBlockedEvent: SelectionBuilder[UserBlockedEvent, A]
  ): SelectionBuilder[IssueTimelineItemEdge, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "AssignedEvent"        -> Obj(onAssignedEvent),
          "ClosedEvent"          -> Obj(onClosedEvent),
          "Commit"               -> Obj(onCommit),
          "CrossReferencedEvent" -> Obj(onCrossReferencedEvent),
          "DemilestonedEvent"    -> Obj(onDemilestonedEvent),
          "IssueComment"         -> Obj(onIssueComment),
          "LabeledEvent"         -> Obj(onLabeledEvent),
          "LockedEvent"          -> Obj(onLockedEvent),
          "MilestonedEvent"      -> Obj(onMilestonedEvent),
          "ReferencedEvent"      -> Obj(onReferencedEvent),
          "RenamedTitleEvent"    -> Obj(onRenamedTitleEvent),
          "ReopenedEvent"        -> Obj(onReopenedEvent),
          "SubscribedEvent"      -> Obj(onSubscribedEvent),
          "TransferredEvent"     -> Obj(onTransferredEvent),
          "UnassignedEvent"      -> Obj(onUnassignedEvent),
          "UnlabeledEvent"       -> Obj(onUnlabeledEvent),
          "UnlockedEvent"        -> Obj(onUnlockedEvent),
          "UnsubscribedEvent"    -> Obj(onUnsubscribedEvent),
          "UserBlockedEvent"     -> Obj(onUserBlockedEvent)
        )
      )
    )
  )

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onAssignedEvent: Option[SelectionBuilder[AssignedEvent, A]]               = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                   = None,
    onCommit: Option[SelectionBuilder[Commit, A]]                             = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]] = None,
    onDemilestonedEvent: Option[SelectionBuilder[DemilestonedEvent, A]]       = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                 = None,
    onLabeledEvent: Option[SelectionBuilder[LabeledEvent, A]]                 = None,
    onLockedEvent: Option[SelectionBuilder[LockedEvent, A]]                   = None,
    onMilestonedEvent: Option[SelectionBuilder[MilestonedEvent, A]]           = None,
    onReferencedEvent: Option[SelectionBuilder[ReferencedEvent, A]]           = None,
    onRenamedTitleEvent: Option[SelectionBuilder[RenamedTitleEvent, A]]       = None,
    onReopenedEvent: Option[SelectionBuilder[ReopenedEvent, A]]               = None,
    onSubscribedEvent: Option[SelectionBuilder[SubscribedEvent, A]]           = None,
    onTransferredEvent: Option[SelectionBuilder[TransferredEvent, A]]         = None,
    onUnassignedEvent: Option[SelectionBuilder[UnassignedEvent, A]]           = None,
    onUnlabeledEvent: Option[SelectionBuilder[UnlabeledEvent, A]]             = None,
    onUnlockedEvent: Option[SelectionBuilder[UnlockedEvent, A]]               = None,
    onUnsubscribedEvent: Option[SelectionBuilder[UnsubscribedEvent, A]]       = None,
    onUserBlockedEvent: Option[SelectionBuilder[UserBlockedEvent, A]]         = None
  ): SelectionBuilder[IssueTimelineItemEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "AssignedEvent"        -> onAssignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ClosedEvent"          -> onClosedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Commit"               -> onCommit.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "CrossReferencedEvent" -> onCrossReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "DemilestonedEvent"    -> onDemilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "IssueComment"         -> onIssueComment.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LabeledEvent"         -> onLabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "LockedEvent"          -> onLockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MilestonedEvent"      -> onMilestonedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReferencedEvent"      -> onReferencedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RenamedTitleEvent"    -> onRenamedTitleEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "ReopenedEvent"        -> onReopenedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "SubscribedEvent"      -> onSubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TransferredEvent"     -> onTransferredEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnassignedEvent"      -> onUnassignedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlabeledEvent"       -> onUnlabeledEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnlockedEvent"        -> onUnlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UnsubscribedEvent"    -> onUnsubscribedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "UserBlockedEvent"     -> onUserBlockedEvent.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

