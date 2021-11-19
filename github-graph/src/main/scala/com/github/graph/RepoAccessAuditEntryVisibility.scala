package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoAccessAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoAccessAuditEntryVisibility {
  case object INTERNAL extends RepoAccessAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoAccessAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoAccessAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoAccessAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoAccessAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoAccessAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoAccessAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoAccessAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoAccessAuditEntryVisibility] = {
    case RepoAccessAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoAccessAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoAccessAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoAccessAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

