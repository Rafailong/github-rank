package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ReactionOrderField extends scala.Product with scala.Serializable { def value: String }

object ReactionOrderField {
  case object CREATED_AT extends ReactionOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[ReactionOrderField] = {
    case __StringValue("CREATED_AT") => Right(ReactionOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build ReactionOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[ReactionOrderField] = { case ReactionOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[ReactionOrderField] = Vector(CREATED_AT)
}

