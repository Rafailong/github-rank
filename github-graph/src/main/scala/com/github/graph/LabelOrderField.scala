package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait LabelOrderField extends scala.Product with scala.Serializable { def value: String }

object LabelOrderField {
  case object CREATED_AT extends LabelOrderField { val value: String = "CREATED_AT" }
  case object NAME extends LabelOrderField { val value: String = "NAME" }

  implicit val decoder: ScalarDecoder[LabelOrderField] = {
    case __StringValue("CREATED_AT") => Right(LabelOrderField.CREATED_AT)
    case __StringValue("NAME")       => Right(LabelOrderField.NAME)
    case other                       => Left(DecodingError(s"Can't build LabelOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[LabelOrderField] = {
    case LabelOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case LabelOrderField.NAME       => __EnumValue("NAME")
  }

  val values: Vector[LabelOrderField] = Vector(CREATED_AT, NAME)
}

