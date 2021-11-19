package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorshipOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorshipOrderField {
  case object CREATED_AT extends SponsorshipOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[SponsorshipOrderField] = {
    case __StringValue("CREATED_AT") => Right(SponsorshipOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build SponsorshipOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorshipOrderField] = { case SponsorshipOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[SponsorshipOrderField] = Vector(CREATED_AT)
}

