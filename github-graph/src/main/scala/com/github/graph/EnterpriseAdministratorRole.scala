package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseAdministratorRole extends scala.Product with scala.Serializable { def value: String }

object EnterpriseAdministratorRole {
  case object BILLING_MANAGER extends EnterpriseAdministratorRole { val value: String = "BILLING_MANAGER" }
  case object OWNER extends EnterpriseAdministratorRole { val value: String = "OWNER" }

  implicit val decoder: ScalarDecoder[EnterpriseAdministratorRole] = {
    case __StringValue("BILLING_MANAGER") => Right(EnterpriseAdministratorRole.BILLING_MANAGER)
    case __StringValue("OWNER")           => Right(EnterpriseAdministratorRole.OWNER)
    case other                            => Left(DecodingError(s"Can't build EnterpriseAdministratorRole from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseAdministratorRole] = {
    case EnterpriseAdministratorRole.BILLING_MANAGER => __EnumValue("BILLING_MANAGER")
    case EnterpriseAdministratorRole.OWNER           => __EnumValue("OWNER")
  }

  val values: Vector[EnterpriseAdministratorRole] = Vector(BILLING_MANAGER, OWNER)
}

