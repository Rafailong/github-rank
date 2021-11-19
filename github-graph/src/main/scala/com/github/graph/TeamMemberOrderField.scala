package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamMemberOrderField extends scala.Product with scala.Serializable { def value: String }

object TeamMemberOrderField {
  case object CREATED_AT extends TeamMemberOrderField { val value: String = "CREATED_AT" }
  case object LOGIN extends TeamMemberOrderField { val value: String = "LOGIN" }

  implicit val decoder: ScalarDecoder[TeamMemberOrderField] = {
    case __StringValue("CREATED_AT") => Right(TeamMemberOrderField.CREATED_AT)
    case __StringValue("LOGIN")      => Right(TeamMemberOrderField.LOGIN)
    case other                       => Left(DecodingError(s"Can't build TeamMemberOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamMemberOrderField] = {
    case TeamMemberOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case TeamMemberOrderField.LOGIN      => __EnumValue("LOGIN")
  }

  val values: Vector[TeamMemberOrderField] = Vector(CREATED_AT, LOGIN)
}

