package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorshipNewsletterOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorshipNewsletterOrderField {
  case object CREATED_AT extends SponsorshipNewsletterOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[SponsorshipNewsletterOrderField] = {
    case __StringValue("CREATED_AT") => Right(SponsorshipNewsletterOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build SponsorshipNewsletterOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorshipNewsletterOrderField] = { case SponsorshipNewsletterOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[SponsorshipNewsletterOrderField] = Vector(CREATED_AT)
}

