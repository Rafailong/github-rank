package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoArchivedAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoArchivedAuditEntryVisibility {
  case object INTERNAL extends RepoArchivedAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoArchivedAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoArchivedAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoArchivedAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoArchivedAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoArchivedAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoArchivedAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoArchivedAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoArchivedAuditEntryVisibility] = {
    case RepoArchivedAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoArchivedAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoArchivedAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoArchivedAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

