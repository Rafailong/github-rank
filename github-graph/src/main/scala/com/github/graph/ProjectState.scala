package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectState extends scala.Product with scala.Serializable { def value: String }

object ProjectState {
  case object CLOSED extends ProjectState { val value: String = "CLOSED" }
  case object OPEN extends ProjectState { val value: String = "OPEN" }

  implicit val decoder: ScalarDecoder[ProjectState] = {
    case __StringValue("CLOSED") => Right(ProjectState.CLOSED)
    case __StringValue("OPEN")   => Right(ProjectState.OPEN)
    case other                   => Left(DecodingError(s"Can't build ProjectState from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectState] = {
    case ProjectState.CLOSED => __EnumValue("CLOSED")
    case ProjectState.OPEN   => __EnumValue("OPEN")
  }

  val values: Vector[ProjectState] = Vector(CLOSED, OPEN)
}

