package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait AuditLogOrderField extends scala.Product with scala.Serializable { def value: String }

object AuditLogOrderField {
  case object CREATED_AT extends AuditLogOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[AuditLogOrderField] = {
    case __StringValue("CREATED_AT") => Right(AuditLogOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build AuditLogOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[AuditLogOrderField] = { case AuditLogOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[AuditLogOrderField] = Vector(CREATED_AT)
}

