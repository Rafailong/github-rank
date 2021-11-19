package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestState extends scala.Product with scala.Serializable { def value: String }

object PullRequestState {
  case object CLOSED extends PullRequestState { val value: String = "CLOSED" }
  case object MERGED extends PullRequestState { val value: String = "MERGED" }
  case object OPEN extends PullRequestState { val value: String = "OPEN" }

  implicit val decoder: ScalarDecoder[PullRequestState] = {
    case __StringValue("CLOSED") => Right(PullRequestState.CLOSED)
    case __StringValue("MERGED") => Right(PullRequestState.MERGED)
    case __StringValue("OPEN")   => Right(PullRequestState.OPEN)
    case other                   => Left(DecodingError(s"Can't build PullRequestState from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestState] = {
    case PullRequestState.CLOSED => __EnumValue("CLOSED")
    case PullRequestState.MERGED => __EnumValue("MERGED")
    case PullRequestState.OPEN   => __EnumValue("OPEN")
  }

  val values: Vector[PullRequestState] = Vector(CLOSED, MERGED, OPEN)
}

