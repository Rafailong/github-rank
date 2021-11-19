package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamOrderField extends scala.Product with scala.Serializable { def value: String }

object TeamOrderField {
  case object NAME extends TeamOrderField { val value: String = "NAME" }

  implicit val decoder: ScalarDecoder[TeamOrderField] = {
    case __StringValue("NAME") => Right(TeamOrderField.NAME)
    case other                 => Left(DecodingError(s"Can't build TeamOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamOrderField] = { case TeamOrderField.NAME =>
    __EnumValue("NAME")
  }

  val values: Vector[TeamOrderField] = Vector(NAME)
}

