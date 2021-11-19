package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorOrderField extends scala.Product with scala.Serializable { def value: String }

object SponsorOrderField {
  case object LOGIN extends SponsorOrderField { val value: String = "LOGIN" }
  case object RELEVANCE extends SponsorOrderField { val value: String = "RELEVANCE" }

  implicit val decoder: ScalarDecoder[SponsorOrderField] = {
    case __StringValue("LOGIN")     => Right(SponsorOrderField.LOGIN)
    case __StringValue("RELEVANCE") => Right(SponsorOrderField.RELEVANCE)
    case other                      => Left(DecodingError(s"Can't build SponsorOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorOrderField] = {
    case SponsorOrderField.LOGIN     => __EnumValue("LOGIN")
    case SponsorOrderField.RELEVANCE => __EnumValue("RELEVANCE")
  }

  val values: Vector[SponsorOrderField] = Vector(LOGIN, RELEVANCE)
}

