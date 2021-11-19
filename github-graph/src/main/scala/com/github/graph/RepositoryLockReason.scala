package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryLockReason extends scala.Product with scala.Serializable { def value: String }

object RepositoryLockReason {
  case object BILLING extends RepositoryLockReason { val value: String = "BILLING" }
  case object MIGRATING extends RepositoryLockReason { val value: String = "MIGRATING" }
  case object MOVING extends RepositoryLockReason { val value: String = "MOVING" }
  case object RENAME extends RepositoryLockReason { val value: String = "RENAME" }

  implicit val decoder: ScalarDecoder[RepositoryLockReason] = {
    case __StringValue("BILLING")   => Right(RepositoryLockReason.BILLING)
    case __StringValue("MIGRATING") => Right(RepositoryLockReason.MIGRATING)
    case __StringValue("MOVING")    => Right(RepositoryLockReason.MOVING)
    case __StringValue("RENAME")    => Right(RepositoryLockReason.RENAME)
    case other                      => Left(DecodingError(s"Can't build RepositoryLockReason from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryLockReason] = {
    case RepositoryLockReason.BILLING   => __EnumValue("BILLING")
    case RepositoryLockReason.MIGRATING => __EnumValue("MIGRATING")
    case RepositoryLockReason.MOVING    => __EnumValue("MOVING")
    case RepositoryLockReason.RENAME    => __EnumValue("RENAME")
  }

  val values: Vector[RepositoryLockReason] = Vector(BILLING, MIGRATING, MOVING, RENAME)
}

