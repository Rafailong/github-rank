package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CheckStatusState extends scala.Product with scala.Serializable { def value: String }

object CheckStatusState {
  case object COMPLETED extends CheckStatusState { val value: String = "COMPLETED" }
  case object IN_PROGRESS extends CheckStatusState { val value: String = "IN_PROGRESS" }
  case object PENDING extends CheckStatusState { val value: String = "PENDING" }
  case object QUEUED extends CheckStatusState { val value: String = "QUEUED" }
  case object REQUESTED extends CheckStatusState { val value: String = "REQUESTED" }
  case object WAITING extends CheckStatusState { val value: String = "WAITING" }

  implicit val decoder: ScalarDecoder[CheckStatusState] = {
    case __StringValue("COMPLETED")   => Right(CheckStatusState.COMPLETED)
    case __StringValue("IN_PROGRESS") => Right(CheckStatusState.IN_PROGRESS)
    case __StringValue("PENDING")     => Right(CheckStatusState.PENDING)
    case __StringValue("QUEUED")      => Right(CheckStatusState.QUEUED)
    case __StringValue("REQUESTED")   => Right(CheckStatusState.REQUESTED)
    case __StringValue("WAITING")     => Right(CheckStatusState.WAITING)
    case other                        => Left(DecodingError(s"Can't build CheckStatusState from input $other"))
  }

  implicit val encoder: ArgEncoder[CheckStatusState] = {
    case CheckStatusState.COMPLETED   => __EnumValue("COMPLETED")
    case CheckStatusState.IN_PROGRESS => __EnumValue("IN_PROGRESS")
    case CheckStatusState.PENDING     => __EnumValue("PENDING")
    case CheckStatusState.QUEUED      => __EnumValue("QUEUED")
    case CheckStatusState.REQUESTED   => __EnumValue("REQUESTED")
    case CheckStatusState.WAITING     => __EnumValue("WAITING")
  }

  val values: Vector[CheckStatusState] = Vector(COMPLETED, IN_PROGRESS, PENDING, QUEUED, REQUESTED, WAITING)
}

