package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoAddMemberAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoAddMemberAuditEntryVisibility {
  case object INTERNAL extends RepoAddMemberAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoAddMemberAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoAddMemberAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoAddMemberAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoAddMemberAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoAddMemberAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoAddMemberAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoAddMemberAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoAddMemberAuditEntryVisibility] = {
    case RepoAddMemberAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoAddMemberAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoAddMemberAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoAddMemberAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

