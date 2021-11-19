package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseServerUserAccountsUploadOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseServerUserAccountsUploadOrderField {
  case object CREATED_AT extends EnterpriseServerUserAccountsUploadOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[EnterpriseServerUserAccountsUploadOrderField] = {
    case __StringValue("CREATED_AT") => Right(EnterpriseServerUserAccountsUploadOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build EnterpriseServerUserAccountsUploadOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountsUploadOrderField] = { case EnterpriseServerUserAccountsUploadOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[EnterpriseServerUserAccountsUploadOrderField] = Vector(CREATED_AT)
}

