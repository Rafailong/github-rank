package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait MergeStateStatus extends scala.Product with scala.Serializable { def value: String }

object MergeStateStatus {
  case object BEHIND extends MergeStateStatus { val value: String = "BEHIND" }
  case object BLOCKED extends MergeStateStatus { val value: String = "BLOCKED" }
  case object CLEAN extends MergeStateStatus { val value: String = "CLEAN" }
  case object DIRTY extends MergeStateStatus { val value: String = "DIRTY" }
  case object DRAFT extends MergeStateStatus { val value: String = "DRAFT" }
  case object HAS_HOOKS extends MergeStateStatus { val value: String = "HAS_HOOKS" }
  case object UNKNOWN extends MergeStateStatus { val value: String = "UNKNOWN" }
  case object UNSTABLE extends MergeStateStatus { val value: String = "UNSTABLE" }

  implicit val decoder: ScalarDecoder[MergeStateStatus] = {
    case __StringValue("BEHIND")    => Right(MergeStateStatus.BEHIND)
    case __StringValue("BLOCKED")   => Right(MergeStateStatus.BLOCKED)
    case __StringValue("CLEAN")     => Right(MergeStateStatus.CLEAN)
    case __StringValue("DIRTY")     => Right(MergeStateStatus.DIRTY)
    case __StringValue("DRAFT")     => Right(MergeStateStatus.DRAFT)
    case __StringValue("HAS_HOOKS") => Right(MergeStateStatus.HAS_HOOKS)
    case __StringValue("UNKNOWN")   => Right(MergeStateStatus.UNKNOWN)
    case __StringValue("UNSTABLE")  => Right(MergeStateStatus.UNSTABLE)
    case other                      => Left(DecodingError(s"Can't build MergeStateStatus from input $other"))
  }

  implicit val encoder: ArgEncoder[MergeStateStatus] = {
    case MergeStateStatus.BEHIND    => __EnumValue("BEHIND")
    case MergeStateStatus.BLOCKED   => __EnumValue("BLOCKED")
    case MergeStateStatus.CLEAN     => __EnumValue("CLEAN")
    case MergeStateStatus.DIRTY     => __EnumValue("DIRTY")
    case MergeStateStatus.DRAFT     => __EnumValue("DRAFT")
    case MergeStateStatus.HAS_HOOKS => __EnumValue("HAS_HOOKS")
    case MergeStateStatus.UNKNOWN   => __EnumValue("UNKNOWN")
    case MergeStateStatus.UNSTABLE  => __EnumValue("UNSTABLE")
  }

  val values: Vector[MergeStateStatus] = Vector(BEHIND, BLOCKED, CLEAN, DIRTY, DRAFT, HAS_HOOKS, UNKNOWN, UNSTABLE)
}

