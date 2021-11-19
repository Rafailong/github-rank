package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SecurityAdvisoryOrderField extends scala.Product with scala.Serializable { def value: String }

object SecurityAdvisoryOrderField {
  case object PUBLISHED_AT extends SecurityAdvisoryOrderField { val value: String = "PUBLISHED_AT" }
  case object UPDATED_AT extends SecurityAdvisoryOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[SecurityAdvisoryOrderField] = {
    case __StringValue("PUBLISHED_AT") => Right(SecurityAdvisoryOrderField.PUBLISHED_AT)
    case __StringValue("UPDATED_AT")   => Right(SecurityAdvisoryOrderField.UPDATED_AT)
    case other                         => Left(DecodingError(s"Can't build SecurityAdvisoryOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SecurityAdvisoryOrderField] = {
    case SecurityAdvisoryOrderField.PUBLISHED_AT => __EnumValue("PUBLISHED_AT")
    case SecurityAdvisoryOrderField.UPDATED_AT   => __EnumValue("UPDATED_AT")
  }

  val values: Vector[SecurityAdvisoryOrderField] = Vector(PUBLISHED_AT, UPDATED_AT)
}

