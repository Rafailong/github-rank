package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CheckConclusionState extends scala.Product with scala.Serializable { def value: String }

object CheckConclusionState {
  case object ACTION_REQUIRED extends CheckConclusionState { val value: String = "ACTION_REQUIRED" }
  case object CANCELLED extends CheckConclusionState { val value: String = "CANCELLED" }
  case object FAILURE extends CheckConclusionState { val value: String = "FAILURE" }
  case object NEUTRAL extends CheckConclusionState { val value: String = "NEUTRAL" }
  case object SKIPPED extends CheckConclusionState { val value: String = "SKIPPED" }
  case object STALE extends CheckConclusionState { val value: String = "STALE" }
  case object STARTUP_FAILURE extends CheckConclusionState { val value: String = "STARTUP_FAILURE" }
  case object SUCCESS extends CheckConclusionState { val value: String = "SUCCESS" }
  case object TIMED_OUT extends CheckConclusionState { val value: String = "TIMED_OUT" }

  implicit val decoder: ScalarDecoder[CheckConclusionState] = {
    case __StringValue("ACTION_REQUIRED") => Right(CheckConclusionState.ACTION_REQUIRED)
    case __StringValue("CANCELLED")       => Right(CheckConclusionState.CANCELLED)
    case __StringValue("FAILURE")         => Right(CheckConclusionState.FAILURE)
    case __StringValue("NEUTRAL")         => Right(CheckConclusionState.NEUTRAL)
    case __StringValue("SKIPPED")         => Right(CheckConclusionState.SKIPPED)
    case __StringValue("STALE")           => Right(CheckConclusionState.STALE)
    case __StringValue("STARTUP_FAILURE") => Right(CheckConclusionState.STARTUP_FAILURE)
    case __StringValue("SUCCESS")         => Right(CheckConclusionState.SUCCESS)
    case __StringValue("TIMED_OUT")       => Right(CheckConclusionState.TIMED_OUT)
    case other                            => Left(DecodingError(s"Can't build CheckConclusionState from input $other"))
  }

  implicit val encoder: ArgEncoder[CheckConclusionState] = {
    case CheckConclusionState.ACTION_REQUIRED => __EnumValue("ACTION_REQUIRED")
    case CheckConclusionState.CANCELLED       => __EnumValue("CANCELLED")
    case CheckConclusionState.FAILURE         => __EnumValue("FAILURE")
    case CheckConclusionState.NEUTRAL         => __EnumValue("NEUTRAL")
    case CheckConclusionState.SKIPPED         => __EnumValue("SKIPPED")
    case CheckConclusionState.STALE           => __EnumValue("STALE")
    case CheckConclusionState.STARTUP_FAILURE => __EnumValue("STARTUP_FAILURE")
    case CheckConclusionState.SUCCESS         => __EnumValue("SUCCESS")
    case CheckConclusionState.TIMED_OUT       => __EnumValue("TIMED_OUT")
  }

  val values: Vector[CheckConclusionState] = Vector(ACTION_REQUIRED, CANCELLED, FAILURE, NEUTRAL, SKIPPED, STALE, STARTUP_FAILURE, SUCCESS, TIMED_OUT)
}

