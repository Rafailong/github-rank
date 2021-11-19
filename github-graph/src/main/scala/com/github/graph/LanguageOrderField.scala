package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait LanguageOrderField extends scala.Product with scala.Serializable { def value: String }

object LanguageOrderField {
  case object SIZE extends LanguageOrderField { val value: String = "SIZE" }

  implicit val decoder: ScalarDecoder[LanguageOrderField] = {
    case __StringValue("SIZE") => Right(LanguageOrderField.SIZE)
    case other                 => Left(DecodingError(s"Can't build LanguageOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[LanguageOrderField] = { case LanguageOrderField.SIZE =>
    __EnumValue("SIZE")
  }

  val values: Vector[LanguageOrderField] = Vector(SIZE)
}

