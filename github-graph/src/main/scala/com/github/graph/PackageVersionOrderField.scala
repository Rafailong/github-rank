package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PackageVersionOrderField extends scala.Product with scala.Serializable { def value: String }

object PackageVersionOrderField {
  case object CREATED_AT extends PackageVersionOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[PackageVersionOrderField] = {
    case __StringValue("CREATED_AT") => Right(PackageVersionOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build PackageVersionOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[PackageVersionOrderField] = { case PackageVersionOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[PackageVersionOrderField] = Vector(CREATED_AT)
}

