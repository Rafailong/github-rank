package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IssueState extends scala.Product with scala.Serializable { def value: String }

object IssueState {
  case object CLOSED extends IssueState { val value: String = "CLOSED" }
  case object OPEN extends IssueState { val value: String = "OPEN" }

  implicit val decoder: ScalarDecoder[IssueState] = {
    case __StringValue("CLOSED") => Right(IssueState.CLOSED)
    case __StringValue("OPEN")   => Right(IssueState.OPEN)
    case other                   => Left(DecodingError(s"Can't build IssueState from input $other"))
  }

  implicit val encoder: ArgEncoder[IssueState] = {
    case IssueState.CLOSED => __EnumValue("CLOSED")
    case IssueState.OPEN   => __EnumValue("OPEN")
  }

  val values: Vector[IssueState] = Vector(CLOSED, OPEN)
}

