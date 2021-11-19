package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait StatusState extends scala.Product with scala.Serializable { def value: String }

object StatusState {
  case object ERROR extends StatusState { val value: String = "ERROR" }
  case object EXPECTED extends StatusState { val value: String = "EXPECTED" }
  case object FAILURE extends StatusState { val value: String = "FAILURE" }
  case object PENDING extends StatusState { val value: String = "PENDING" }
  case object SUCCESS extends StatusState { val value: String = "SUCCESS" }

  implicit val decoder: ScalarDecoder[StatusState] = {
    case __StringValue("ERROR")    => Right(StatusState.ERROR)
    case __StringValue("EXPECTED") => Right(StatusState.EXPECTED)
    case __StringValue("FAILURE")  => Right(StatusState.FAILURE)
    case __StringValue("PENDING")  => Right(StatusState.PENDING)
    case __StringValue("SUCCESS")  => Right(StatusState.SUCCESS)
    case other                     => Left(DecodingError(s"Can't build StatusState from input $other"))
  }

  implicit val encoder: ArgEncoder[StatusState] = {
    case StatusState.ERROR    => __EnumValue("ERROR")
    case StatusState.EXPECTED => __EnumValue("EXPECTED")
    case StatusState.FAILURE  => __EnumValue("FAILURE")
    case StatusState.PENDING  => __EnumValue("PENDING")
    case StatusState.SUCCESS  => __EnumValue("SUCCESS")
  }

  val values: Vector[StatusState] = Vector(ERROR, EXPECTED, FAILURE, PENDING, SUCCESS)
}

