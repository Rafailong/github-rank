package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestUpdateState extends scala.Product with scala.Serializable { def value: String }

object PullRequestUpdateState {
  case object CLOSED extends PullRequestUpdateState { val value: String = "CLOSED" }
  case object OPEN extends PullRequestUpdateState { val value: String = "OPEN" }

  implicit val decoder: ScalarDecoder[PullRequestUpdateState] = {
    case __StringValue("CLOSED") => Right(PullRequestUpdateState.CLOSED)
    case __StringValue("OPEN")   => Right(PullRequestUpdateState.OPEN)
    case other                   => Left(DecodingError(s"Can't build PullRequestUpdateState from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestUpdateState] = {
    case PullRequestUpdateState.CLOSED => __EnumValue("CLOSED")
    case PullRequestUpdateState.OPEN   => __EnumValue("OPEN")
  }

  val values: Vector[PullRequestUpdateState] = Vector(CLOSED, OPEN)
}

