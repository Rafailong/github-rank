package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ReleaseOrderField extends scala.Product with scala.Serializable { def value: String }

object ReleaseOrderField {
  case object CREATED_AT extends ReleaseOrderField { val value: String = "CREATED_AT" }
  case object NAME extends ReleaseOrderField { val value: String = "NAME" }

  implicit val decoder: ScalarDecoder[ReleaseOrderField] = {
    case __StringValue("CREATED_AT") => Right(ReleaseOrderField.CREATED_AT)
    case __StringValue("NAME")       => Right(ReleaseOrderField.NAME)
    case other                       => Left(DecodingError(s"Can't build ReleaseOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[ReleaseOrderField] = {
    case ReleaseOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case ReleaseOrderField.NAME       => __EnumValue("NAME")
  }

  val values: Vector[ReleaseOrderField] = Vector(CREATED_AT, NAME)
}

