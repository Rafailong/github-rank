package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseAdministratorInvitationOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseAdministratorInvitationOrderField {
  case object CREATED_AT extends EnterpriseAdministratorInvitationOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[EnterpriseAdministratorInvitationOrderField] = {
    case __StringValue("CREATED_AT") => Right(EnterpriseAdministratorInvitationOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build EnterpriseAdministratorInvitationOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseAdministratorInvitationOrderField] = { case EnterpriseAdministratorInvitationOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[EnterpriseAdministratorInvitationOrderField] = Vector(CREATED_AT)
}

