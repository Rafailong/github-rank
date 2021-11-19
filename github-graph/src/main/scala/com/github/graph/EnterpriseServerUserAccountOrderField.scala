package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseServerUserAccountOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseServerUserAccountOrderField {
  case object LOGIN extends EnterpriseServerUserAccountOrderField { val value: String = "LOGIN" }
  case object REMOTE_CREATED_AT extends EnterpriseServerUserAccountOrderField { val value: String = "REMOTE_CREATED_AT" }

  implicit val decoder: ScalarDecoder[EnterpriseServerUserAccountOrderField] = {
    case __StringValue("LOGIN")             => Right(EnterpriseServerUserAccountOrderField.LOGIN)
    case __StringValue("REMOTE_CREATED_AT") => Right(EnterpriseServerUserAccountOrderField.REMOTE_CREATED_AT)
    case other                              => Left(DecodingError(s"Can't build EnterpriseServerUserAccountOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountOrderField] = {
    case EnterpriseServerUserAccountOrderField.LOGIN             => __EnumValue("LOGIN")
    case EnterpriseServerUserAccountOrderField.REMOTE_CREATED_AT => __EnumValue("REMOTE_CREATED_AT")
  }

  val values: Vector[EnterpriseServerUserAccountOrderField] = Vector(LOGIN, REMOTE_CREATED_AT)
}

