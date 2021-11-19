package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ProjectOrderField extends scala.Product with scala.Serializable { def value: String }

object ProjectOrderField {
  case object CREATED_AT extends ProjectOrderField { val value: String = "CREATED_AT" }
  case object NAME extends ProjectOrderField { val value: String = "NAME" }
  case object UPDATED_AT extends ProjectOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[ProjectOrderField] = {
    case __StringValue("CREATED_AT") => Right(ProjectOrderField.CREATED_AT)
    case __StringValue("NAME")       => Right(ProjectOrderField.NAME)
    case __StringValue("UPDATED_AT") => Right(ProjectOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build ProjectOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[ProjectOrderField] = {
    case ProjectOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case ProjectOrderField.NAME       => __EnumValue("NAME")
    case ProjectOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[ProjectOrderField] = Vector(CREATED_AT, NAME, UPDATED_AT)
}

