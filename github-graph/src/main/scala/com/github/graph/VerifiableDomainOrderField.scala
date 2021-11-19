package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait VerifiableDomainOrderField extends scala.Product with scala.Serializable { def value: String }

object VerifiableDomainOrderField {
  case object CREATED_AT extends VerifiableDomainOrderField { val value: String = "CREATED_AT" }
  case object DOMAIN extends VerifiableDomainOrderField { val value: String = "DOMAIN" }

  implicit val decoder: ScalarDecoder[VerifiableDomainOrderField] = {
    case __StringValue("CREATED_AT") => Right(VerifiableDomainOrderField.CREATED_AT)
    case __StringValue("DOMAIN")     => Right(VerifiableDomainOrderField.DOMAIN)
    case other                       => Left(DecodingError(s"Can't build VerifiableDomainOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[VerifiableDomainOrderField] = {
    case VerifiableDomainOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case VerifiableDomainOrderField.DOMAIN     => __EnumValue("DOMAIN")
  }

  val values: Vector[VerifiableDomainOrderField] = Vector(CREATED_AT, DOMAIN)
}

