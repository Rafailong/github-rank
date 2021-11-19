package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectCardArchivedState extends scala.Product with scala.Serializable { def value: String }

object ProjectCardArchivedState {
  case object ARCHIVED extends ProjectCardArchivedState { val value: String = "ARCHIVED" }
  case object NOT_ARCHIVED extends ProjectCardArchivedState { val value: String = "NOT_ARCHIVED" }

  implicit val decoder: ScalarDecoder[ProjectCardArchivedState] = {
    case __StringValue("ARCHIVED")     => Right(ProjectCardArchivedState.ARCHIVED)
    case __StringValue("NOT_ARCHIVED") => Right(ProjectCardArchivedState.NOT_ARCHIVED)
    case other                         => Left(DecodingError(s"Can't build ProjectCardArchivedState from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectCardArchivedState] = {
    case ProjectCardArchivedState.ARCHIVED     => __EnumValue("ARCHIVED")
    case ProjectCardArchivedState.NOT_ARCHIVED => __EnumValue("NOT_ARCHIVED")
  }

  val values: Vector[ProjectCardArchivedState] = Vector(ARCHIVED, NOT_ARCHIVED)
}

