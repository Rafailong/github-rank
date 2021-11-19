package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PackageFileOrderField extends scala.Product with scala.Serializable { def value: String }

object PackageFileOrderField {
  case object CREATED_AT extends PackageFileOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[PackageFileOrderField] = {
    case __StringValue("CREATED_AT") => Right(PackageFileOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build PackageFileOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[PackageFileOrderField] = { case PackageFileOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[PackageFileOrderField] = Vector(CREATED_AT)
}

