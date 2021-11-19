package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoChangeMergeSettingAuditEntryMergeType extends scala.Product with scala.Serializable { def value: String }

object RepoChangeMergeSettingAuditEntryMergeType {
  case object MERGE extends RepoChangeMergeSettingAuditEntryMergeType { val value: String = "MERGE" }
  case object REBASE extends RepoChangeMergeSettingAuditEntryMergeType { val value: String = "REBASE" }
  case object SQUASH extends RepoChangeMergeSettingAuditEntryMergeType { val value: String = "SQUASH" }

  implicit val decoder: ScalarDecoder[RepoChangeMergeSettingAuditEntryMergeType] = {
    case __StringValue("MERGE")  => Right(RepoChangeMergeSettingAuditEntryMergeType.MERGE)
    case __StringValue("REBASE") => Right(RepoChangeMergeSettingAuditEntryMergeType.REBASE)
    case __StringValue("SQUASH") => Right(RepoChangeMergeSettingAuditEntryMergeType.SQUASH)
    case other                   => Left(DecodingError(s"Can't build RepoChangeMergeSettingAuditEntryMergeType from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoChangeMergeSettingAuditEntryMergeType] = {
    case RepoChangeMergeSettingAuditEntryMergeType.MERGE  => __EnumValue("MERGE")
    case RepoChangeMergeSettingAuditEntryMergeType.REBASE => __EnumValue("REBASE")
    case RepoChangeMergeSettingAuditEntryMergeType.SQUASH => __EnumValue("SQUASH")
  }

  val values: Vector[RepoChangeMergeSettingAuditEntryMergeType] = Vector(MERGE, REBASE, SQUASH)
}

