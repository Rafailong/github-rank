package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait UserStatusOrderField extends scala.Product with scala.Serializable { def value: String }

object UserStatusOrderField {
  case object UPDATED_AT extends UserStatusOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[UserStatusOrderField] = {
    case __StringValue("UPDATED_AT") => Right(UserStatusOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build UserStatusOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[UserStatusOrderField] = { case UserStatusOrderField.UPDATED_AT =>
    __EnumValue("UPDATED_AT")
  }

  val values: Vector[UserStatusOrderField] = Vector(UPDATED_AT)
}

