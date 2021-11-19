package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrganizationOrderField extends scala.Product with scala.Serializable { def value: String }

object OrganizationOrderField {
  case object CREATED_AT extends OrganizationOrderField { val value: String = "CREATED_AT" }
  case object LOGIN extends OrganizationOrderField { val value: String = "LOGIN" }

  implicit val decoder: ScalarDecoder[OrganizationOrderField] = {
    case __StringValue("CREATED_AT") => Right(OrganizationOrderField.CREATED_AT)
    case __StringValue("LOGIN")      => Right(OrganizationOrderField.LOGIN)
    case other                       => Left(DecodingError(s"Can't build OrganizationOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[OrganizationOrderField] = {
    case OrganizationOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case OrganizationOrderField.LOGIN      => __EnumValue("LOGIN")
  }

  val values: Vector[OrganizationOrderField] = Vector(CREATED_AT, LOGIN)
}

