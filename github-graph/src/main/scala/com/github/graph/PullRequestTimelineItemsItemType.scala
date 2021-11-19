package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestTimelineItemsItemType extends scala.Product with scala.Serializable { def value: String }

object PullRequestTimelineItemsItemType {
  case object ADDED_TO_PROJECT_EVENT extends PullRequestTimelineItemsItemType { val value: String = "ADDED_TO_PROJECT_EVENT" }
  case object ASSIGNED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "ASSIGNED_EVENT" }
  case object AUTOMATIC_BASE_CHANGE_FAILED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "AUTOMATIC_BASE_CHANGE_FAILED_EVENT" }

  case object AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT extends PullRequestTimelineItemsItemType {
    val value: String = "AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT"
  }
  case object AUTO_MERGE_DISABLED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "AUTO_MERGE_DISABLED_EVENT" }
  case object AUTO_MERGE_ENABLED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "AUTO_MERGE_ENABLED_EVENT" }
  case object AUTO_REBASE_ENABLED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "AUTO_REBASE_ENABLED_EVENT" }
  case object AUTO_SQUASH_ENABLED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "AUTO_SQUASH_ENABLED_EVENT" }
  case object BASE_REF_CHANGED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "BASE_REF_CHANGED_EVENT" }
  case object BASE_REF_DELETED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "BASE_REF_DELETED_EVENT" }
  case object BASE_REF_FORCE_PUSHED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "BASE_REF_FORCE_PUSHED_EVENT" }
  case object CLOSED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "CLOSED_EVENT" }
  case object COMMENT_DELETED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "COMMENT_DELETED_EVENT" }
  case object CONNECTED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "CONNECTED_EVENT" }
  case object CONVERTED_NOTE_TO_ISSUE_EVENT extends PullRequestTimelineItemsItemType { val value: String = "CONVERTED_NOTE_TO_ISSUE_EVENT" }
  case object CONVERT_TO_DRAFT_EVENT extends PullRequestTimelineItemsItemType { val value: String = "CONVERT_TO_DRAFT_EVENT" }
  case object CROSS_REFERENCED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "CROSS_REFERENCED_EVENT" }
  case object DEMILESTONED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "DEMILESTONED_EVENT" }
  case object DEPLOYED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "DEPLOYED_EVENT" }

  case object DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT extends PullRequestTimelineItemsItemType {
    val value: String = "DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT"
  }
  case object DISCONNECTED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "DISCONNECTED_EVENT" }
  case object HEAD_REF_DELETED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "HEAD_REF_DELETED_EVENT" }
  case object HEAD_REF_FORCE_PUSHED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "HEAD_REF_FORCE_PUSHED_EVENT" }
  case object HEAD_REF_RESTORED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "HEAD_REF_RESTORED_EVENT" }
  case object ISSUE_COMMENT extends PullRequestTimelineItemsItemType { val value: String = "ISSUE_COMMENT" }
  case object LABELED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "LABELED_EVENT" }
  case object LOCKED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "LOCKED_EVENT" }
  case object MARKED_AS_DUPLICATE_EVENT extends PullRequestTimelineItemsItemType { val value: String = "MARKED_AS_DUPLICATE_EVENT" }
  case object MENTIONED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "MENTIONED_EVENT" }
  case object MERGED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "MERGED_EVENT" }
  case object MILESTONED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "MILESTONED_EVENT" }
  case object MOVED_COLUMNS_IN_PROJECT_EVENT extends PullRequestTimelineItemsItemType { val value: String = "MOVED_COLUMNS_IN_PROJECT_EVENT" }
  case object PINNED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "PINNED_EVENT" }
  case object PULL_REQUEST_COMMIT extends PullRequestTimelineItemsItemType { val value: String = "PULL_REQUEST_COMMIT" }
  case object PULL_REQUEST_COMMIT_COMMENT_THREAD extends PullRequestTimelineItemsItemType { val value: String = "PULL_REQUEST_COMMIT_COMMENT_THREAD" }
  case object PULL_REQUEST_REVIEW extends PullRequestTimelineItemsItemType { val value: String = "PULL_REQUEST_REVIEW" }
  case object PULL_REQUEST_REVIEW_THREAD extends PullRequestTimelineItemsItemType { val value: String = "PULL_REQUEST_REVIEW_THREAD" }
  case object PULL_REQUEST_REVISION_MARKER extends PullRequestTimelineItemsItemType { val value: String = "PULL_REQUEST_REVISION_MARKER" }
  case object READY_FOR_REVIEW_EVENT extends PullRequestTimelineItemsItemType { val value: String = "READY_FOR_REVIEW_EVENT" }
  case object REFERENCED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REFERENCED_EVENT" }
  case object REMOVED_FROM_PROJECT_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REMOVED_FROM_PROJECT_EVENT" }
  case object RENAMED_TITLE_EVENT extends PullRequestTimelineItemsItemType { val value: String = "RENAMED_TITLE_EVENT" }
  case object REOPENED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REOPENED_EVENT" }
  case object REVIEW_DISMISSED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REVIEW_DISMISSED_EVENT" }
  case object REVIEW_REQUESTED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REVIEW_REQUESTED_EVENT" }
  case object REVIEW_REQUEST_REMOVED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "REVIEW_REQUEST_REMOVED_EVENT" }
  case object SUBSCRIBED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "SUBSCRIBED_EVENT" }
  case object TRANSFERRED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "TRANSFERRED_EVENT" }
  case object UNASSIGNED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNASSIGNED_EVENT" }
  case object UNLABELED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNLABELED_EVENT" }
  case object UNLOCKED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNLOCKED_EVENT" }
  case object UNMARKED_AS_DUPLICATE_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNMARKED_AS_DUPLICATE_EVENT" }
  case object UNPINNED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNPINNED_EVENT" }
  case object UNSUBSCRIBED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "UNSUBSCRIBED_EVENT" }
  case object USER_BLOCKED_EVENT extends PullRequestTimelineItemsItemType { val value: String = "USER_BLOCKED_EVENT" }

  implicit val decoder: ScalarDecoder[PullRequestTimelineItemsItemType] = {
    case __StringValue("ADDED_TO_PROJECT_EVENT")                => Right(PullRequestTimelineItemsItemType.ADDED_TO_PROJECT_EVENT)
    case __StringValue("ASSIGNED_EVENT")                        => Right(PullRequestTimelineItemsItemType.ASSIGNED_EVENT)
    case __StringValue("AUTOMATIC_BASE_CHANGE_FAILED_EVENT")    => Right(PullRequestTimelineItemsItemType.AUTOMATIC_BASE_CHANGE_FAILED_EVENT)
    case __StringValue("AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT") => Right(PullRequestTimelineItemsItemType.AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT)
    case __StringValue("AUTO_MERGE_DISABLED_EVENT")             => Right(PullRequestTimelineItemsItemType.AUTO_MERGE_DISABLED_EVENT)
    case __StringValue("AUTO_MERGE_ENABLED_EVENT")              => Right(PullRequestTimelineItemsItemType.AUTO_MERGE_ENABLED_EVENT)
    case __StringValue("AUTO_REBASE_ENABLED_EVENT")             => Right(PullRequestTimelineItemsItemType.AUTO_REBASE_ENABLED_EVENT)
    case __StringValue("AUTO_SQUASH_ENABLED_EVENT")             => Right(PullRequestTimelineItemsItemType.AUTO_SQUASH_ENABLED_EVENT)
    case __StringValue("BASE_REF_CHANGED_EVENT")                => Right(PullRequestTimelineItemsItemType.BASE_REF_CHANGED_EVENT)
    case __StringValue("BASE_REF_DELETED_EVENT")                => Right(PullRequestTimelineItemsItemType.BASE_REF_DELETED_EVENT)
    case __StringValue("BASE_REF_FORCE_PUSHED_EVENT")           => Right(PullRequestTimelineItemsItemType.BASE_REF_FORCE_PUSHED_EVENT)
    case __StringValue("CLOSED_EVENT")                          => Right(PullRequestTimelineItemsItemType.CLOSED_EVENT)
    case __StringValue("COMMENT_DELETED_EVENT")                 => Right(PullRequestTimelineItemsItemType.COMMENT_DELETED_EVENT)
    case __StringValue("CONNECTED_EVENT")                       => Right(PullRequestTimelineItemsItemType.CONNECTED_EVENT)
    case __StringValue("CONVERTED_NOTE_TO_ISSUE_EVENT")         => Right(PullRequestTimelineItemsItemType.CONVERTED_NOTE_TO_ISSUE_EVENT)
    case __StringValue("CONVERT_TO_DRAFT_EVENT")                => Right(PullRequestTimelineItemsItemType.CONVERT_TO_DRAFT_EVENT)
    case __StringValue("CROSS_REFERENCED_EVENT")                => Right(PullRequestTimelineItemsItemType.CROSS_REFERENCED_EVENT)
    case __StringValue("DEMILESTONED_EVENT")                    => Right(PullRequestTimelineItemsItemType.DEMILESTONED_EVENT)
    case __StringValue("DEPLOYED_EVENT")                        => Right(PullRequestTimelineItemsItemType.DEPLOYED_EVENT)
    case __StringValue("DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT")  => Right(PullRequestTimelineItemsItemType.DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT)
    case __StringValue("DISCONNECTED_EVENT")                    => Right(PullRequestTimelineItemsItemType.DISCONNECTED_EVENT)
    case __StringValue("HEAD_REF_DELETED_EVENT")                => Right(PullRequestTimelineItemsItemType.HEAD_REF_DELETED_EVENT)
    case __StringValue("HEAD_REF_FORCE_PUSHED_EVENT")           => Right(PullRequestTimelineItemsItemType.HEAD_REF_FORCE_PUSHED_EVENT)
    case __StringValue("HEAD_REF_RESTORED_EVENT")               => Right(PullRequestTimelineItemsItemType.HEAD_REF_RESTORED_EVENT)
    case __StringValue("ISSUE_COMMENT")                         => Right(PullRequestTimelineItemsItemType.ISSUE_COMMENT)
    case __StringValue("LABELED_EVENT")                         => Right(PullRequestTimelineItemsItemType.LABELED_EVENT)
    case __StringValue("LOCKED_EVENT")                          => Right(PullRequestTimelineItemsItemType.LOCKED_EVENT)
    case __StringValue("MARKED_AS_DUPLICATE_EVENT")             => Right(PullRequestTimelineItemsItemType.MARKED_AS_DUPLICATE_EVENT)
    case __StringValue("MENTIONED_EVENT")                       => Right(PullRequestTimelineItemsItemType.MENTIONED_EVENT)
    case __StringValue("MERGED_EVENT")                          => Right(PullRequestTimelineItemsItemType.MERGED_EVENT)
    case __StringValue("MILESTONED_EVENT")                      => Right(PullRequestTimelineItemsItemType.MILESTONED_EVENT)
    case __StringValue("MOVED_COLUMNS_IN_PROJECT_EVENT")        => Right(PullRequestTimelineItemsItemType.MOVED_COLUMNS_IN_PROJECT_EVENT)
    case __StringValue("PINNED_EVENT")                          => Right(PullRequestTimelineItemsItemType.PINNED_EVENT)
    case __StringValue("PULL_REQUEST_COMMIT")                   => Right(PullRequestTimelineItemsItemType.PULL_REQUEST_COMMIT)
    case __StringValue("PULL_REQUEST_COMMIT_COMMENT_THREAD")    => Right(PullRequestTimelineItemsItemType.PULL_REQUEST_COMMIT_COMMENT_THREAD)
    case __StringValue("PULL_REQUEST_REVIEW")                   => Right(PullRequestTimelineItemsItemType.PULL_REQUEST_REVIEW)
    case __StringValue("PULL_REQUEST_REVIEW_THREAD")            => Right(PullRequestTimelineItemsItemType.PULL_REQUEST_REVIEW_THREAD)
    case __StringValue("PULL_REQUEST_REVISION_MARKER")          => Right(PullRequestTimelineItemsItemType.PULL_REQUEST_REVISION_MARKER)
    case __StringValue("READY_FOR_REVIEW_EVENT")                => Right(PullRequestTimelineItemsItemType.READY_FOR_REVIEW_EVENT)
    case __StringValue("REFERENCED_EVENT")                      => Right(PullRequestTimelineItemsItemType.REFERENCED_EVENT)
    case __StringValue("REMOVED_FROM_PROJECT_EVENT")            => Right(PullRequestTimelineItemsItemType.REMOVED_FROM_PROJECT_EVENT)
    case __StringValue("RENAMED_TITLE_EVENT")                   => Right(PullRequestTimelineItemsItemType.RENAMED_TITLE_EVENT)
    case __StringValue("REOPENED_EVENT")                        => Right(PullRequestTimelineItemsItemType.REOPENED_EVENT)
    case __StringValue("REVIEW_DISMISSED_EVENT")                => Right(PullRequestTimelineItemsItemType.REVIEW_DISMISSED_EVENT)
    case __StringValue("REVIEW_REQUESTED_EVENT")                => Right(PullRequestTimelineItemsItemType.REVIEW_REQUESTED_EVENT)
    case __StringValue("REVIEW_REQUEST_REMOVED_EVENT")          => Right(PullRequestTimelineItemsItemType.REVIEW_REQUEST_REMOVED_EVENT)
    case __StringValue("SUBSCRIBED_EVENT")                      => Right(PullRequestTimelineItemsItemType.SUBSCRIBED_EVENT)
    case __StringValue("TRANSFERRED_EVENT")                     => Right(PullRequestTimelineItemsItemType.TRANSFERRED_EVENT)
    case __StringValue("UNASSIGNED_EVENT")                      => Right(PullRequestTimelineItemsItemType.UNASSIGNED_EVENT)
    case __StringValue("UNLABELED_EVENT")                       => Right(PullRequestTimelineItemsItemType.UNLABELED_EVENT)
    case __StringValue("UNLOCKED_EVENT")                        => Right(PullRequestTimelineItemsItemType.UNLOCKED_EVENT)
    case __StringValue("UNMARKED_AS_DUPLICATE_EVENT")           => Right(PullRequestTimelineItemsItemType.UNMARKED_AS_DUPLICATE_EVENT)
    case __StringValue("UNPINNED_EVENT")                        => Right(PullRequestTimelineItemsItemType.UNPINNED_EVENT)
    case __StringValue("UNSUBSCRIBED_EVENT")                    => Right(PullRequestTimelineItemsItemType.UNSUBSCRIBED_EVENT)
    case __StringValue("USER_BLOCKED_EVENT")                    => Right(PullRequestTimelineItemsItemType.USER_BLOCKED_EVENT)
    case other                                                  => Left(DecodingError(s"Can't build PullRequestTimelineItemsItemType from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestTimelineItemsItemType] = {
    case PullRequestTimelineItemsItemType.ADDED_TO_PROJECT_EVENT                => __EnumValue("ADDED_TO_PROJECT_EVENT")
    case PullRequestTimelineItemsItemType.ASSIGNED_EVENT                        => __EnumValue("ASSIGNED_EVENT")
    case PullRequestTimelineItemsItemType.AUTOMATIC_BASE_CHANGE_FAILED_EVENT    => __EnumValue("AUTOMATIC_BASE_CHANGE_FAILED_EVENT")
    case PullRequestTimelineItemsItemType.AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT => __EnumValue("AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT")
    case PullRequestTimelineItemsItemType.AUTO_MERGE_DISABLED_EVENT             => __EnumValue("AUTO_MERGE_DISABLED_EVENT")
    case PullRequestTimelineItemsItemType.AUTO_MERGE_ENABLED_EVENT              => __EnumValue("AUTO_MERGE_ENABLED_EVENT")
    case PullRequestTimelineItemsItemType.AUTO_REBASE_ENABLED_EVENT             => __EnumValue("AUTO_REBASE_ENABLED_EVENT")
    case PullRequestTimelineItemsItemType.AUTO_SQUASH_ENABLED_EVENT             => __EnumValue("AUTO_SQUASH_ENABLED_EVENT")
    case PullRequestTimelineItemsItemType.BASE_REF_CHANGED_EVENT                => __EnumValue("BASE_REF_CHANGED_EVENT")
    case PullRequestTimelineItemsItemType.BASE_REF_DELETED_EVENT                => __EnumValue("BASE_REF_DELETED_EVENT")
    case PullRequestTimelineItemsItemType.BASE_REF_FORCE_PUSHED_EVENT           => __EnumValue("BASE_REF_FORCE_PUSHED_EVENT")
    case PullRequestTimelineItemsItemType.CLOSED_EVENT                          => __EnumValue("CLOSED_EVENT")
    case PullRequestTimelineItemsItemType.COMMENT_DELETED_EVENT                 => __EnumValue("COMMENT_DELETED_EVENT")
    case PullRequestTimelineItemsItemType.CONNECTED_EVENT                       => __EnumValue("CONNECTED_EVENT")
    case PullRequestTimelineItemsItemType.CONVERTED_NOTE_TO_ISSUE_EVENT         => __EnumValue("CONVERTED_NOTE_TO_ISSUE_EVENT")
    case PullRequestTimelineItemsItemType.CONVERT_TO_DRAFT_EVENT                => __EnumValue("CONVERT_TO_DRAFT_EVENT")
    case PullRequestTimelineItemsItemType.CROSS_REFERENCED_EVENT                => __EnumValue("CROSS_REFERENCED_EVENT")
    case PullRequestTimelineItemsItemType.DEMILESTONED_EVENT                    => __EnumValue("DEMILESTONED_EVENT")
    case PullRequestTimelineItemsItemType.DEPLOYED_EVENT                        => __EnumValue("DEPLOYED_EVENT")
    case PullRequestTimelineItemsItemType.DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT  => __EnumValue("DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT")
    case PullRequestTimelineItemsItemType.DISCONNECTED_EVENT                    => __EnumValue("DISCONNECTED_EVENT")
    case PullRequestTimelineItemsItemType.HEAD_REF_DELETED_EVENT                => __EnumValue("HEAD_REF_DELETED_EVENT")
    case PullRequestTimelineItemsItemType.HEAD_REF_FORCE_PUSHED_EVENT           => __EnumValue("HEAD_REF_FORCE_PUSHED_EVENT")
    case PullRequestTimelineItemsItemType.HEAD_REF_RESTORED_EVENT               => __EnumValue("HEAD_REF_RESTORED_EVENT")
    case PullRequestTimelineItemsItemType.ISSUE_COMMENT                         => __EnumValue("ISSUE_COMMENT")
    case PullRequestTimelineItemsItemType.LABELED_EVENT                         => __EnumValue("LABELED_EVENT")
    case PullRequestTimelineItemsItemType.LOCKED_EVENT                          => __EnumValue("LOCKED_EVENT")
    case PullRequestTimelineItemsItemType.MARKED_AS_DUPLICATE_EVENT             => __EnumValue("MARKED_AS_DUPLICATE_EVENT")
    case PullRequestTimelineItemsItemType.MENTIONED_EVENT                       => __EnumValue("MENTIONED_EVENT")
    case PullRequestTimelineItemsItemType.MERGED_EVENT                          => __EnumValue("MERGED_EVENT")
    case PullRequestTimelineItemsItemType.MILESTONED_EVENT                      => __EnumValue("MILESTONED_EVENT")
    case PullRequestTimelineItemsItemType.MOVED_COLUMNS_IN_PROJECT_EVENT        => __EnumValue("MOVED_COLUMNS_IN_PROJECT_EVENT")
    case PullRequestTimelineItemsItemType.PINNED_EVENT                          => __EnumValue("PINNED_EVENT")
    case PullRequestTimelineItemsItemType.PULL_REQUEST_COMMIT                   => __EnumValue("PULL_REQUEST_COMMIT")
    case PullRequestTimelineItemsItemType.PULL_REQUEST_COMMIT_COMMENT_THREAD    => __EnumValue("PULL_REQUEST_COMMIT_COMMENT_THREAD")
    case PullRequestTimelineItemsItemType.PULL_REQUEST_REVIEW                   => __EnumValue("PULL_REQUEST_REVIEW")
    case PullRequestTimelineItemsItemType.PULL_REQUEST_REVIEW_THREAD            => __EnumValue("PULL_REQUEST_REVIEW_THREAD")
    case PullRequestTimelineItemsItemType.PULL_REQUEST_REVISION_MARKER          => __EnumValue("PULL_REQUEST_REVISION_MARKER")
    case PullRequestTimelineItemsItemType.READY_FOR_REVIEW_EVENT                => __EnumValue("READY_FOR_REVIEW_EVENT")
    case PullRequestTimelineItemsItemType.REFERENCED_EVENT                      => __EnumValue("REFERENCED_EVENT")
    case PullRequestTimelineItemsItemType.REMOVED_FROM_PROJECT_EVENT            => __EnumValue("REMOVED_FROM_PROJECT_EVENT")
    case PullRequestTimelineItemsItemType.RENAMED_TITLE_EVENT                   => __EnumValue("RENAMED_TITLE_EVENT")
    case PullRequestTimelineItemsItemType.REOPENED_EVENT                        => __EnumValue("REOPENED_EVENT")
    case PullRequestTimelineItemsItemType.REVIEW_DISMISSED_EVENT                => __EnumValue("REVIEW_DISMISSED_EVENT")
    case PullRequestTimelineItemsItemType.REVIEW_REQUESTED_EVENT                => __EnumValue("REVIEW_REQUESTED_EVENT")
    case PullRequestTimelineItemsItemType.REVIEW_REQUEST_REMOVED_EVENT          => __EnumValue("REVIEW_REQUEST_REMOVED_EVENT")
    case PullRequestTimelineItemsItemType.SUBSCRIBED_EVENT                      => __EnumValue("SUBSCRIBED_EVENT")
    case PullRequestTimelineItemsItemType.TRANSFERRED_EVENT                     => __EnumValue("TRANSFERRED_EVENT")
    case PullRequestTimelineItemsItemType.UNASSIGNED_EVENT                      => __EnumValue("UNASSIGNED_EVENT")
    case PullRequestTimelineItemsItemType.UNLABELED_EVENT                       => __EnumValue("UNLABELED_EVENT")
    case PullRequestTimelineItemsItemType.UNLOCKED_EVENT                        => __EnumValue("UNLOCKED_EVENT")
    case PullRequestTimelineItemsItemType.UNMARKED_AS_DUPLICATE_EVENT           => __EnumValue("UNMARKED_AS_DUPLICATE_EVENT")
    case PullRequestTimelineItemsItemType.UNPINNED_EVENT                        => __EnumValue("UNPINNED_EVENT")
    case PullRequestTimelineItemsItemType.UNSUBSCRIBED_EVENT                    => __EnumValue("UNSUBSCRIBED_EVENT")
    case PullRequestTimelineItemsItemType.USER_BLOCKED_EVENT                    => __EnumValue("USER_BLOCKED_EVENT")
  }

  val values: Vector[PullRequestTimelineItemsItemType] = Vector(
    ADDED_TO_PROJECT_EVENT,
    ASSIGNED_EVENT,
    AUTOMATIC_BASE_CHANGE_FAILED_EVENT,
    AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT,
    AUTO_MERGE_DISABLED_EVENT,
    AUTO_MERGE_ENABLED_EVENT,
    AUTO_REBASE_ENABLED_EVENT,
    AUTO_SQUASH_ENABLED_EVENT,
    BASE_REF_CHANGED_EVENT,
    BASE_REF_DELETED_EVENT,
    BASE_REF_FORCE_PUSHED_EVENT,
    CLOSED_EVENT,
    COMMENT_DELETED_EVENT,
    CONNECTED_EVENT,
    CONVERTED_NOTE_TO_ISSUE_EVENT,
    CONVERT_TO_DRAFT_EVENT,
    CROSS_REFERENCED_EVENT,
    DEMILESTONED_EVENT,
    DEPLOYED_EVENT,
    DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT,
    DISCONNECTED_EVENT,
    HEAD_REF_DELETED_EVENT,
    HEAD_REF_FORCE_PUSHED_EVENT,
    HEAD_REF_RESTORED_EVENT,
    ISSUE_COMMENT,
    LABELED_EVENT,
    LOCKED_EVENT,
    MARKED_AS_DUPLICATE_EVENT,
    MENTIONED_EVENT,
    MERGED_EVENT,
    MILESTONED_EVENT,
    MOVED_COLUMNS_IN_PROJECT_EVENT,
    PINNED_EVENT,
    PULL_REQUEST_COMMIT,
    PULL_REQUEST_COMMIT_COMMENT_THREAD,
    PULL_REQUEST_REVIEW,
    PULL_REQUEST_REVIEW_THREAD,
    PULL_REQUEST_REVISION_MARKER,
    READY_FOR_REVIEW_EVENT,
    REFERENCED_EVENT,
    REMOVED_FROM_PROJECT_EVENT,
    RENAMED_TITLE_EVENT,
    REOPENED_EVENT,
    REVIEW_DISMISSED_EVENT,
    REVIEW_REQUESTED_EVENT,
    REVIEW_REQUEST_REMOVED_EVENT,
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

