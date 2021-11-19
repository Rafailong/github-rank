package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SavedReplyOrderField extends scala.Product with scala.Serializable { def value: String }

object SavedReplyOrderField {
  case object UPDATED_AT extends SavedReplyOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[SavedReplyOrderField] = {
    case __StringValue("UPDATED_AT") => Right(SavedReplyOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build SavedReplyOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SavedReplyOrderField] = { case SavedReplyOrderField.UPDATED_AT =>
    __EnumValue("UPDATED_AT")
  }

  val values: Vector[SavedReplyOrderField] = Vector(UPDATED_AT)
}

