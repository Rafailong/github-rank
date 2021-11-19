package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IssueTimelineItemsItemType extends scala.Product with scala.Serializable { def value: String }

object IssueTimelineItemsItemType {
  case object ADDED_TO_PROJECT_EVENT extends IssueTimelineItemsItemType { val value: String = "ADDED_TO_PROJECT_EVENT" }
  case object ASSIGNED_EVENT extends IssueTimelineItemsItemType { val value: String = "ASSIGNED_EVENT" }
  case object CLOSED_EVENT extends IssueTimelineItemsItemType { val value: String = "CLOSED_EVENT" }
  case object COMMENT_DELETED_EVENT extends IssueTimelineItemsItemType { val value: String = "COMMENT_DELETED_EVENT" }
  case object CONNECTED_EVENT extends IssueTimelineItemsItemType { val value: String = "CONNECTED_EVENT" }
  case object CONVERTED_NOTE_TO_ISSUE_EVENT extends IssueTimelineItemsItemType { val value: String = "CONVERTED_NOTE_TO_ISSUE_EVENT" }
  case object CROSS_REFERENCED_EVENT extends IssueTimelineItemsItemType { val value: String = "CROSS_REFERENCED_EVENT" }
  case object DEMILESTONED_EVENT extends IssueTimelineItemsItemType { val value: String = "DEMILESTONED_EVENT" }
  case object DISCONNECTED_EVENT extends IssueTimelineItemsItemType { val value: String = "DISCONNECTED_EVENT" }
  case object ISSUE_COMMENT extends IssueTimelineItemsItemType { val value: String = "ISSUE_COMMENT" }
  case object LABELED_EVENT extends IssueTimelineItemsItemType { val value: String = "LABELED_EVENT" }
  case object LOCKED_EVENT extends IssueTimelineItemsItemType { val value: String = "LOCKED_EVENT" }
  case object MARKED_AS_DUPLICATE_EVENT extends IssueTimelineItemsItemType { val value: String = "MARKED_AS_DUPLICATE_EVENT" }
  case object MENTIONED_EVENT extends IssueTimelineItemsItemType { val value: String = "MENTIONED_EVENT" }
  case object MILESTONED_EVENT extends IssueTimelineItemsItemType { val value: String = "MILESTONED_EVENT" }
  case object MOVED_COLUMNS_IN_PROJECT_EVENT extends IssueTimelineItemsItemType { val value: String = "MOVED_COLUMNS_IN_PROJECT_EVENT" }
  case object PINNED_EVENT extends IssueTimelineItemsItemType { val value: String = "PINNED_EVENT" }
  case object REFERENCED_EVENT extends IssueTimelineItemsItemType { val value: String = "REFERENCED_EVENT" }
  case object REMOVED_FROM_PROJECT_EVENT extends IssueTimelineItemsItemType { val value: String = "REMOVED_FROM_PROJECT_EVENT" }
  case object RENAMED_TITLE_EVENT extends IssueTimelineItemsItemType { val value: String = "RENAMED_TITLE_EVENT" }
  case object REOPENED_EVENT extends IssueTimelineItemsItemType { val value: String = "REOPENED_EVENT" }
  case object SUBSCRIBED_EVENT extends IssueTimelineItemsItemType { val value: String = "SUBSCRIBED_EVENT" }
  case object TRANSFERRED_EVENT extends IssueTimelineItemsItemType { val value: String = "TRANSFERRED_EVENT" }
  case object UNASSIGNED_EVENT extends IssueTimelineItemsItemType { val value: String = "UNASSIGNED_EVENT" }
  case object UNLABELED_EVENT extends IssueTimelineItemsItemType { val value: String = "UNLABELED_EVENT" }
  case object UNLOCKED_EVENT extends IssueTimelineItemsItemType { val value: String = "UNLOCKED_EVENT" }
  case object UNMARKED_AS_DUPLICATE_EVENT extends IssueTimelineItemsItemType { val value: String = "UNMARKED_AS_DUPLICATE_EVENT" }
  case object UNPINNED_EVENT extends IssueTimelineItemsItemType { val value: String = "UNPINNED_EVENT" }
  case object UNSUBSCRIBED_EVENT extends IssueTimelineItemsItemType { val value: String = "UNSUBSCRIBED_EVENT" }
  case object USER_BLOCKED_EVENT extends IssueTimelineItemsItemType { val value: String = "USER_BLOCKED_EVENT" }

  implicit val decoder: ScalarDecoder[IssueTimelineItemsItemType] = {
    case __StringValue("ADDED_TO_PROJECT_EVENT")         => Right(IssueTimelineItemsItemType.ADDED_TO_PROJECT_EVENT)
    case __StringValue("ASSIGNED_EVENT")                 => Right(IssueTimelineItemsItemType.ASSIGNED_EVENT)
    case __StringValue("CLOSED_EVENT")                   => Right(IssueTimelineItemsItemType.CLOSED_EVENT)
    case __StringValue("COMMENT_DELETED_EVENT")          => Right(IssueTimelineItemsItemType.COMMENT_DELETED_EVENT)
    case __StringValue("CONNECTED_EVENT")                => Right(IssueTimelineItemsItemType.CONNECTED_EVENT)
    case __StringValue("CONVERTED_NOTE_TO_ISSUE_EVENT")  => Right(IssueTimelineItemsItemType.CONVERTED_NOTE_TO_ISSUE_EVENT)
    case __StringValue("CROSS_REFERENCED_EVENT")         => Right(IssueTimelineItemsItemType.CROSS_REFERENCED_EVENT)
    case __StringValue("DEMILESTONED_EVENT")             => Right(IssueTimelineItemsItemType.DEMILESTONED_EVENT)
    case __StringValue("DISCONNECTED_EVENT")             => Right(IssueTimelineItemsItemType.DISCONNECTED_EVENT)
    case __StringValue("ISSUE_COMMENT")                  => Right(IssueTimelineItemsItemType.ISSUE_COMMENT)
    case __StringValue("LABELED_EVENT")                  => Right(IssueTimelineItemsItemType.LABELED_EVENT)
    case __StringValue("LOCKED_EVENT")                   => Right(IssueTimelineItemsItemType.LOCKED_EVENT)
    case __StringValue("MARKED_AS_DUPLICATE_EVENT")      => Right(IssueTimelineItemsItemType.MARKED_AS_DUPLICATE_EVENT)
    case __StringValue("MENTIONED_EVENT")                => Right(IssueTimelineItemsItemType.MENTIONED_EVENT)
    case __StringValue("MILESTONED_EVENT")               => Right(IssueTimelineItemsItemType.MILESTONED_EVENT)
    case __StringValue("MOVED_COLUMNS_IN_PROJECT_EVENT") => Right(IssueTimelineItemsItemType.MOVED_COLUMNS_IN_PROJECT_EVENT)
    case __StringValue("PINNED_EVENT")                   => Right(IssueTimelineItemsItemType.PINNED_EVENT)
    case __StringValue("REFERENCED_EVENT")               => Right(IssueTimelineItemsItemType.REFERENCED_EVENT)
    case __StringValue("REMOVED_FROM_PROJECT_EVENT")     => Right(IssueTimelineItemsItemType.REMOVED_FROM_PROJECT_EVENT)
    case __StringValue("RENAMED_TITLE_EVENT")            => Right(IssueTimelineItemsItemType.RENAMED_TITLE_EVENT)
    case __StringValue("REOPENED_EVENT")                 => Right(IssueTimelineItemsItemType.REOPENED_EVENT)
    case __StringValue("SUBSCRIBED_EVENT")               => Right(IssueTimelineItemsItemType.SUBSCRIBED_EVENT)
    case __StringValue("TRANSFERRED_EVENT")              => Right(IssueTimelineItemsItemType.TRANSFERRED_EVENT)
    case __StringValue("UNASSIGNED_EVENT")               => Right(IssueTimelineItemsItemType.UNASSIGNED_EVENT)
    case __StringValue("UNLABELED_EVENT")                => Right(IssueTimelineItemsItemType.UNLABELED_EVENT)
    case __StringValue("UNLOCKED_EVENT")                 => Right(IssueTimelineItemsItemType.UNLOCKED_EVENT)
    case __StringValue("UNMARKED_AS_DUPLICATE_EVENT")    => Right(IssueTimelineItemsItemType.UNMARKED_AS_DUPLICATE_EVENT)
    case __StringValue("UNPINNED_EVENT")                 => Right(IssueTimelineItemsItemType.UNPINNED_EVENT)
    case __StringValue("UNSUBSCRIBED_EVENT")             => Right(IssueTimelineItemsItemType.UNSUBSCRIBED_EVENT)
    case __StringValue("USER_BLOCKED_EVENT")             => Right(IssueTimelineItemsItemType.USER_BLOCKED_EVENT)
    case other                                           => Left(DecodingError(s"Can't build IssueTimelineItemsItemType from input $other"))
  }

  implicit val encoder: ArgEncoder[IssueTimelineItemsItemType] = {
    case IssueTimelineItemsItemType.ADDED_TO_PROJECT_EVENT         => __EnumValue("ADDED_TO_PROJECT_EVENT")
    case IssueTimelineItemsItemType.ASSIGNED_EVENT                 => __EnumValue("ASSIGNED_EVENT")
    case IssueTimelineItemsItemType.CLOSED_EVENT                   => __EnumValue("CLOSED_EVENT")
    case IssueTimelineItemsItemType.COMMENT_DELETED_EVENT          => __EnumValue("COMMENT_DELETED_EVENT")
    case IssueTimelineItemsItemType.CONNECTED_EVENT                => __EnumValue("CONNECTED_EVENT")
    case IssueTimelineItemsItemType.CONVERTED_NOTE_TO_ISSUE_EVENT  => __EnumValue("CONVERTED_NOTE_TO_ISSUE_EVENT")
    case IssueTimelineItemsItemType.CROSS_REFERENCED_EVENT         => __EnumValue("CROSS_REFERENCED_EVENT")
    case IssueTimelineItemsItemType.DEMILESTONED_EVENT             => __EnumValue("DEMILESTONED_EVENT")
    case IssueTimelineItemsItemType.DISCONNECTED_EVENT             => __EnumValue("DISCONNECTED_EVENT")
    case IssueTimelineItemsItemType.ISSUE_COMMENT                  => __EnumValue("ISSUE_COMMENT")
    case IssueTimelineItemsItemType.LABELED_EVENT                  => __EnumValue("LABELED_EVENT")
    case IssueTimelineItemsItemType.LOCKED_EVENT                   => __EnumValue("LOCKED_EVENT")
    case IssueTimelineItemsItemType.MARKED_AS_DUPLICATE_EVENT      => __EnumValue("MARKED_AS_DUPLICATE_EVENT")
    case IssueTimelineItemsItemType.MENTIONED_EVENT                => __EnumValue("MENTIONED_EVENT")
    case IssueTimelineItemsItemType.MILESTONED_EVENT               => __EnumValue("MILESTONED_EVENT")
    case IssueTimelineItemsItemType.MOVED_COLUMNS_IN_PROJECT_EVENT => __EnumValue("MOVED_COLUMNS_IN_PROJECT_EVENT")
    case IssueTimelineItemsItemType.PINNED_EVENT                   => __EnumValue("PINNED_EVENT")
    case IssueTimelineItemsItemType.REFERENCED_EVENT               => __EnumValue("REFERENCED_EVENT")
    case IssueTimelineItemsItemType.REMOVED_FROM_PROJECT_EVENT     => __EnumValue("REMOVED_FROM_PROJECT_EVENT")
    case IssueTimelineItemsItemType.RENAMED_TITLE_EVENT            => __EnumValue("RENAMED_TITLE_EVENT")
    case IssueTimelineItemsItemType.REOPENED_EVENT                 => __EnumValue("REOPENED_EVENT")
    case IssueTimelineItemsItemType.SUBSCRIBED_EVENT               => __EnumValue("SUBSCRIBED_EVENT")
    case IssueTimelineItemsItemType.TRANSFERRED_EVENT              => __EnumValue("TRANSFERRED_EVENT")
    case IssueTimelineItemsItemType.UNASSIGNED_EVENT               => __EnumValue("UNASSIGNED_EVENT")
    case IssueTimelineItemsItemType.UNLABELED_EVENT                => __EnumValue("UNLABELED_EVENT")
    case IssueTimelineItemsItemType.UNLOCKED_EVENT                 => __EnumValue("UNLOCKED_EVENT")
    case IssueTimelineItemsItemType.UNMARKED_AS_DUPLICATE_EVENT    => __EnumValue("UNMARKED_AS_DUPLICATE_EVENT")
    case IssueTimelineItemsItemType.UNPINNED_EVENT                 => __EnumValue("UNPINNED_EVENT")
    case IssueTimelineItemsItemType.UNSUBSCRIBED_EVENT             => __EnumValue("UNSUBSCRIBED_EVENT")
    case IssueTimelineItemsItemType.USER_BLOCKED_EVENT             => __EnumValue("USER_BLOCKED_EVENT")
  }

  val values: Vector[IssueTimelineItemsItemType] = Vector(
    ADDED_TO_PROJECT_EVENT,
    ASSIGNED_EVENT,
    CLOSED_EVENT,
    COMMENT_DELETED_EVENT,
    CONNECTED_EVENT,
    CONVERTED_NOTE_TO_ISSUE_EVENT,
    CROSS_REFERENCED_EVENT,
    DEMILESTONED_EVENT,
    DISCONNECTED_EVENT,
    ISSUE_COMMENT,
    LABELED_EVENT,
    LOCKED_EVENT,
    MARKED_AS_DUPLICATE_EVENT,
    MENTIONED_EVENT,
    MILESTONED_EVENT,
    MOVED_COLUMNS_IN_PROJECT_EVENT,
    PINNED_EVENT,
    REFERENCED_EVENT,
    REMOVED_FROM_PROJECT_EVENT,
    RENAMED_TITLE_EVENT,
    REOPENED_EVENT,
    SUBSCRIBED_EVENT,
    TRANSFERRED_EVENT,
    UNASSIGNED_EVENT,
    UNLABELED_EVENT,
    UNLOCKED_EVENT,
    UNMARKED_AS_DUPLICATE_EVENT,
    UNPINNED_EVENT,
    UNSUBSCRIBED_EVENT,
    USER_BLOCKED_EVENT
  )
}

