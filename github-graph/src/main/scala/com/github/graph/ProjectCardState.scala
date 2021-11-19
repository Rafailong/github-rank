package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectCardState extends scala.Product with scala.Serializable { def value: String }

object ProjectCardState {
  case object CONTENT_ONLY extends ProjectCardState { val value: String = "CONTENT_ONLY" }
  case object NOTE_ONLY extends ProjectCardState { val value: String = "NOTE_ONLY" }
  case object REDACTED extends ProjectCardState { val value: String = "REDACTED" }

  implicit val decoder: ScalarDecoder[ProjectCardState] = {
    case __StringValue("CONTENT_ONLY") => Right(ProjectCardState.CONTENT_ONLY)
    case __StringValue("NOTE_ONLY")    => Right(ProjectCardState.NOTE_ONLY)
    case __StringValue("REDACTED")     => Right(ProjectCardState.REDACTED)
    case other                         => Left(DecodingError(s"Can't build ProjectCardState from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectCardState] = {
    case ProjectCardState.CONTENT_ONLY => __EnumValue("CONTENT_ONLY")
    case ProjectCardState.NOTE_ONLY    => __EnumValue("NOTE_ONLY")
    case ProjectCardState.REDACTED     => __EnumValue("REDACTED")
  }

  val values: Vector[ProjectCardState] = Vector(CONTENT_ONLY, NOTE_ONLY, REDACTED)
}

