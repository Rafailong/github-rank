package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait MergeableState extends scala.Product with scala.Serializable { def value: String }

object MergeableState {
  case object CONFLICTING extends MergeableState { val value: String = "CONFLICTING" }
  case object MERGEABLE extends MergeableState { val value: String = "MERGEABLE" }
  case object UNKNOWN extends MergeableState { val value: String = "UNKNOWN" }

  implicit val decoder: ScalarDecoder[MergeableState] = {
    case __StringValue("CONFLICTING") => Right(MergeableState.CONFLICTING)
    case __StringValue("MERGEABLE")   => Right(MergeableState.MERGEABLE)
    case __StringValue("UNKNOWN")     => Right(MergeableState.UNKNOWN)
    case other                        => Left(DecodingError(s"Can't build MergeableState from input $other"))
  }

  implicit val encoder: ArgEncoder[MergeableState] = {
    case MergeableState.CONFLICTING => __EnumValue("CONFLICTING")
    case MergeableState.MERGEABLE   => __EnumValue("MERGEABLE")
    case MergeableState.UNKNOWN     => __EnumValue("UNKNOWN")
  }

  val values: Vector[MergeableState] = Vector(CONFLICTING, MERGEABLE, UNKNOWN)
}

