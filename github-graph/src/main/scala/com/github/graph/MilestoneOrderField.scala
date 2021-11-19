package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait MilestoneOrderField extends scala.Product with scala.Serializable { def value: String }

object MilestoneOrderField {
  case object CREATED_AT extends MilestoneOrderField { val value: String = "CREATED_AT" }
  case object DUE_DATE extends MilestoneOrderField { val value: String = "DUE_DATE" }
  case object NUMBER extends MilestoneOrderField { val value: String = "NUMBER" }
  case object UPDATED_AT extends MilestoneOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[MilestoneOrderField] = {
    case __StringValue("CREATED_AT") => Right(MilestoneOrderField.CREATED_AT)
    case __StringValue("DUE_DATE")   => Right(MilestoneOrderField.DUE_DATE)
    case __StringValue("NUMBER")     => Right(MilestoneOrderField.NUMBER)
    case __StringValue("UPDATED_AT") => Right(MilestoneOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build MilestoneOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[MilestoneOrderField] = {
    case MilestoneOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case MilestoneOrderField.DUE_DATE   => __EnumValue("DUE_DATE")
    case MilestoneOrderField.NUMBER     => __EnumValue("NUMBER")
    case MilestoneOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[MilestoneOrderField] = Vector(CREATED_AT, DUE_DATE, NUMBER, UPDATED_AT)
}

