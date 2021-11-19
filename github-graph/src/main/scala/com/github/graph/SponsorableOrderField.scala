package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorableOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorableOrderField {
  case object LOGIN extends SponsorableOrderField { val value: String = "LOGIN" }

  implicit val decoder: ScalarDecoder[SponsorableOrderField] = {
    case __StringValue("LOGIN") => Right(SponsorableOrderField.LOGIN)
    case other                  => Left(DecodingError(s"Can't build SponsorableOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorableOrderField] = { case SponsorableOrderField.LOGIN =>
    __EnumValue("LOGIN")
  }

  val values: Vector[SponsorableOrderField] = Vector(LOGIN)
}

