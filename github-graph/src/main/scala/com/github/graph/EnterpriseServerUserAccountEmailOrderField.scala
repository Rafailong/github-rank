package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseServerUserAccountEmailOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseServerUserAccountEmailOrderField {
  case object EMAIL extends EnterpriseServerUserAccountEmailOrderField { val value: String = "EMAIL" }

  implicit val decoder: ScalarDecoder[EnterpriseServerUserAccountEmailOrderField] = {
    case __StringValue("EMAIL") => Right(EnterpriseServerUserAccountEmailOrderField.EMAIL)
    case other                  => Left(DecodingError(s"Can't build EnterpriseServerUserAccountEmailOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountEmailOrderField] = { case EnterpriseServerUserAccountEmailOrderField.EMAIL =>
    __EnumValue("EMAIL")
  }

  val values: Vector[EnterpriseServerUserAccountEmailOrderField] = Vector(EMAIL)
}

