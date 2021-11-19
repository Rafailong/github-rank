package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectColumnPurpose extends scala.Product with scala.Serializable { def value: String }

object ProjectColumnPurpose {
  case object DONE extends ProjectColumnPurpose { val value: String = "DONE" }
  case object IN_PROGRESS extends ProjectColumnPurpose { val value: String = "IN_PROGRESS" }
  case object TODO extends ProjectColumnPurpose { val value: String = "TODO" }

  implicit val decoder: ScalarDecoder[ProjectColumnPurpose] = {
    case __StringValue("DONE")        => Right(ProjectColumnPurpose.DONE)
    case __StringValue("IN_PROGRESS") => Right(ProjectColumnPurpose.IN_PROGRESS)
    case __StringValue("TODO")        => Right(ProjectColumnPurpose.TODO)
    case other                        => Left(DecodingError(s"Can't build ProjectColumnPurpose from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectColumnPurpose] = {
    case ProjectColumnPurpose.DONE        => __EnumValue("DONE")
    case ProjectColumnPurpose.IN_PROGRESS => __EnumValue("IN_PROGRESS")
    case ProjectColumnPurpose.TODO        => __EnumValue("TODO")
  }

  val values: Vector[ProjectColumnPurpose] = Vector(DONE, IN_PROGRESS, TODO)
}

