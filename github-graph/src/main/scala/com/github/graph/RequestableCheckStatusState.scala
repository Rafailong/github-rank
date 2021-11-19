package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RequestableCheckStatusState extends scala.Product with scala.Serializable { def value: String }

object RequestableCheckStatusState {
  case object COMPLETED extends RequestableCheckStatusState { val value: String = "COMPLETED" }
  case object IN_PROGRESS extends RequestableCheckStatusState { val value: String = "IN_PROGRESS" }
  case object PENDING extends RequestableCheckStatusState { val value: String = "PENDING" }
  case object QUEUED extends RequestableCheckStatusState { val value: String = "QUEUED" }
  case object WAITING extends RequestableCheckStatusState { val value: String = "WAITING" }

  implicit val decoder: ScalarDecoder[RequestableCheckStatusState] = {
    case __StringValue("COMPLETED")   => Right(RequestableCheckStatusState.COMPLETED)
    case __StringValue("IN_PROGRESS") => Right(RequestableCheckStatusState.IN_PROGRESS)
    case __StringValue("PENDING")     => Right(RequestableCheckStatusState.PENDING)
    case __StringValue("QUEUED")      => Right(RequestableCheckStatusState.QUEUED)
    case __StringValue("WAITING")     => Right(RequestableCheckStatusState.WAITING)
    case other                        => Left(DecodingError(s"Can't build RequestableCheckStatusState from input $other"))
  }

  implicit val encoder: ArgEncoder[RequestableCheckStatusState] = {
    case RequestableCheckStatusState.COMPLETED   => __EnumValue("COMPLETED")
    case RequestableCheckStatusState.IN_PROGRESS => __EnumValue("IN_PROGRESS")
    case RequestableCheckStatusState.PENDING     => __EnumValue("PENDING")
    case RequestableCheckStatusState.QUEUED      => __EnumValue("QUEUED")
    case RequestableCheckStatusState.WAITING     => __EnumValue("WAITING")
  }

  val values: Vector[RequestableCheckStatusState] = Vector(COMPLETED, IN_PROGRESS, PENDING, QUEUED, WAITING)
}

