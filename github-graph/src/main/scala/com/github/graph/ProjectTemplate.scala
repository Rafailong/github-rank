package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectTemplate extends scala.Product with scala.Serializable { def value: String }

object ProjectTemplate {
  case object AUTOMATED_KANBAN_V2 extends ProjectTemplate { val value: String = "AUTOMATED_KANBAN_V2" }
  case object AUTOMATED_REVIEWS_KANBAN extends ProjectTemplate { val value: String = "AUTOMATED_REVIEWS_KANBAN" }
  case object BASIC_KANBAN extends ProjectTemplate { val value: String = "BASIC_KANBAN" }
  case object BUG_TRIAGE extends ProjectTemplate { val value: String = "BUG_TRIAGE" }

  implicit val decoder: ScalarDecoder[ProjectTemplate] = {
    case __StringValue("AUTOMATED_KANBAN_V2")      => Right(ProjectTemplate.AUTOMATED_KANBAN_V2)
    case __StringValue("AUTOMATED_REVIEWS_KANBAN") => Right(ProjectTemplate.AUTOMATED_REVIEWS_KANBAN)
    case __StringValue("BASIC_KANBAN")             => Right(ProjectTemplate.BASIC_KANBAN)
    case __StringValue("BUG_TRIAGE")               => Right(ProjectTemplate.BUG_TRIAGE)
    case other                                     => Left(DecodingError(s"Can't build ProjectTemplate from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectTemplate] = {
    case ProjectTemplate.AUTOMATED_KANBAN_V2      => __EnumValue("AUTOMATED_KANBAN_V2")
    case ProjectTemplate.AUTOMATED_REVIEWS_KANBAN => __EnumValue("AUTOMATED_REVIEWS_KANBAN")
    case ProjectTemplate.BASIC_KANBAN             => __EnumValue("BASIC_KANBAN")
    case ProjectTemplate.BUG_TRIAGE               => __EnumValue("BUG_TRIAGE")
  }

  val values: Vector[ProjectTemplate] = Vector(AUTOMATED_KANBAN_V2, AUTOMATED_REVIEWS_KANBAN, BASIC_KANBAN, BUG_TRIAGE)
}

