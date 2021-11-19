package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IssueTimelineConnection {

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[IssueTimelineItemEdge, A]): SelectionBuilder[IssueTimelineConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
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
  ): SelectionBuilder[IssueTimelineConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
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
    )
  )

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[IssueTimelineConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[IssueTimelineConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

