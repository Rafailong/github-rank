package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoRemoveMemberAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoRemoveMemberAuditEntryVisibility {
  case object INTERNAL extends RepoRemoveMemberAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoRemoveMemberAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoRemoveMemberAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoRemoveMemberAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoRemoveMemberAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoRemoveMemberAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoRemoveMemberAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoRemoveMemberAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoRemoveMemberAuditEntryVisibility] = {
    case RepoRemoveMemberAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoRemoveMemberAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoRemoveMemberAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoRemoveMemberAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

