package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PackageOrderField extends scala.Product with scala.Serializable { def value: String }

object PackageOrderField {
  case object CREATED_AT extends PackageOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[PackageOrderField] = {
    case __StringValue("CREATED_AT") => Right(PackageOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build PackageOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[PackageOrderField] = { case PackageOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[PackageOrderField] = Vector(CREATED_AT)
}

