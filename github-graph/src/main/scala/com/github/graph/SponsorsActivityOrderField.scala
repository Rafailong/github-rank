package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorsActivityOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorsActivityOrderField {
  case object TIMESTAMP extends SponsorsActivityOrderField { val value: String = "TIMESTAMP" }

  implicit val decoder: ScalarDecoder[SponsorsActivityOrderField] = {
    case __StringValue("TIMESTAMP") => Right(SponsorsActivityOrderField.TIMESTAMP)
    case other                      => Left(DecodingError(s"Can't build SponsorsActivityOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorsActivityOrderField] = { case SponsorsActivityOrderField.TIMESTAMP =>
    __EnumValue("TIMESTAMP")
  }

  val values: Vector[SponsorsActivityOrderField] = Vector(TIMESTAMP)
}

