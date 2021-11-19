package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseServerInstallationOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseServerInstallationOrderField {
  case object CREATED_AT extends EnterpriseServerInstallationOrderField { val value: String = "CREATED_AT" }
  case object CUSTOMER_NAME extends EnterpriseServerInstallationOrderField { val value: String = "CUSTOMER_NAME" }
  case object HOST_NAME extends EnterpriseServerInstallationOrderField { val value: String = "HOST_NAME" }

  implicit val decoder: ScalarDecoder[EnterpriseServerInstallationOrderField] = {
    case __StringValue("CREATED_AT")    => Right(EnterpriseServerInstallationOrderField.CREATED_AT)
    case __StringValue("CUSTOMER_NAME") => Right(EnterpriseServerInstallationOrderField.CUSTOMER_NAME)
    case __StringValue("HOST_NAME")     => Right(EnterpriseServerInstallationOrderField.HOST_NAME)
    case other                          => Left(DecodingError(s"Can't build EnterpriseServerInstallationOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseServerInstallationOrderField] = {
    case EnterpriseServerInstallationOrderField.CREATED_AT    => __EnumValue("CREATED_AT")
    case EnterpriseServerInstallationOrderField.CUSTOMER_NAME => __EnumValue("CUSTOMER_NAME")
    case EnterpriseServerInstallationOrderField.HOST_NAME     => __EnumValue("HOST_NAME")
  }

  val values: Vector[EnterpriseServerInstallationOrderField] = Vector(CREATED_AT, CUSTOMER_NAME, HOST_NAME)
}

