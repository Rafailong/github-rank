package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseMemberOrderField extends scala.Product with scala.Serializable { def value: String }

object EnterpriseMemberOrderField {
  case object CREATED_AT extends EnterpriseMemberOrderField { val value: String = "CREATED_AT" }
  case object LOGIN extends EnterpriseMemberOrderField { val value: String = "LOGIN" }

  implicit val decoder: ScalarDecoder[EnterpriseMemberOrderField] = {
    case __StringValue("CREATED_AT") => Right(EnterpriseMemberOrderField.CREATED_AT)
    case __StringValue("LOGIN")      => Right(EnterpriseMemberOrderField.LOGIN)
    case other                       => Left(DecodingError(s"Can't build EnterpriseMemberOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseMemberOrderField] = {
    case EnterpriseMemberOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case EnterpriseMemberOrderField.LOGIN      => __EnumValue("LOGIN")
  }

  val values: Vector[EnterpriseMemberOrderField] = Vector(CREATED_AT, LOGIN)
}

