package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorsTierOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorsTierOrderField {
  case object CREATED_AT extends SponsorsTierOrderField { val value: String = "CREATED_AT" }
  case object MONTHLY_PRICE_IN_CENTS extends SponsorsTierOrderField { val value: String = "MONTHLY_PRICE_IN_CENTS" }

  implicit val decoder: ScalarDecoder[SponsorsTierOrderField] = {
    case __StringValue("CREATED_AT")             => Right(SponsorsTierOrderField.CREATED_AT)
    case __StringValue("MONTHLY_PRICE_IN_CENTS") => Right(SponsorsTierOrderField.MONTHLY_PRICE_IN_CENTS)
    case other                                   => Left(DecodingError(s"Can't build SponsorsTierOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorsTierOrderField] = {
    case SponsorsTierOrderField.CREATED_AT             => __EnumValue("CREATED_AT")
    case SponsorsTierOrderField.MONTHLY_PRICE_IN_CENTS => __EnumValue("MONTHLY_PRICE_IN_CENTS")
  }

  val values: Vector[SponsorsTierOrderField] = Vector(CREATED_AT, MONTHLY_PRICE_IN_CENTS)
}

