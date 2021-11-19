package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait MilestoneState extends scala.Product with scala.Serializable { def value: String }

object MilestoneState {
  case object CLOSED extends MilestoneState { val value: String = "CLOSED" }
  case object OPEN extends MilestoneState { val value: String = "OPEN" }

  implicit val decoder: ScalarDecoder[MilestoneState] = {
    case __StringValue("CLOSED") => Right(MilestoneState.CLOSED)
    case __StringValue("OPEN")   => Right(MilestoneState.OPEN)
    case other                   => Left(DecodingError(s"Can't build MilestoneState from input $other"))
  }

  implicit val encoder: ArgEncoder[MilestoneState] = {
    case MilestoneState.CLOSED => __EnumValue("CLOSED")
    case MilestoneState.OPEN   => __EnumValue("OPEN")
  }

  val values: Vector[MilestoneState] = Vector(CLOSED, OPEN)
}

