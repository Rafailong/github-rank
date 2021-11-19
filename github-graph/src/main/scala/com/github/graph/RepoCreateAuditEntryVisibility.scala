package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoCreateAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoCreateAuditEntryVisibility {
  case object INTERNAL extends RepoCreateAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoCreateAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoCreateAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoCreateAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoCreateAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoCreateAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoCreateAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoCreateAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoCreateAuditEntryVisibility] = {
    case RepoCreateAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoCreateAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoCreateAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoCreateAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

