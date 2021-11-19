package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepoDestroyAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepoDestroyAuditEntryVisibility {
  case object INTERNAL extends RepoDestroyAuditEntryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepoDestroyAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepoDestroyAuditEntryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepoDestroyAuditEntryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepoDestroyAuditEntryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepoDestroyAuditEntryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepoDestroyAuditEntryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepoDestroyAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepoDestroyAuditEntryVisibility] = {
    case RepoDestroyAuditEntryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepoDestroyAuditEntryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepoDestroyAuditEntryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepoDestroyAuditEntryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

