package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IpAllowListEntryOrderField extends scala.Product with scala.Serializable { def value: String }

object IpAllowListEntryOrderField {
  case object ALLOW_LIST_VALUE extends IpAllowListEntryOrderField { val value: String = "ALLOW_LIST_VALUE" }
  case object CREATED_AT extends IpAllowListEntryOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[IpAllowListEntryOrderField] = {
    case __StringValue("ALLOW_LIST_VALUE") => Right(IpAllowListEntryOrderField.ALLOW_LIST_VALUE)
    case __StringValue("CREATED_AT")       => Right(IpAllowListEntryOrderField.CREATED_AT)
    case other                             => Left(DecodingError(s"Can't build IpAllowListEntryOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[IpAllowListEntryOrderField] = {
    case IpAllowListEntryOrderField.ALLOW_LIST_VALUE => __EnumValue("ALLOW_LIST_VALUE")
    case IpAllowListEntryOrderField.CREATED_AT       => __EnumValue("CREATED_AT")
  }

  val values: Vector[IpAllowListEntryOrderField] = Vector(ALLOW_LIST_VALUE, CREATED_AT)
}

