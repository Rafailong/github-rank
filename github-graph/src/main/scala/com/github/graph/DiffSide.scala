package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DiffSide extends scala.Product with scala.Serializable { def value: String }

object DiffSide {
  case object LEFT extends DiffSide { val value: String = "LEFT" }
  case object RIGHT extends DiffSide { val value: String = "RIGHT" }

  implicit val decoder: ScalarDecoder[DiffSide] = {
    case __StringValue("LEFT")  => Right(DiffSide.LEFT)
    case __StringValue("RIGHT") => Right(DiffSide.RIGHT)
    case other                  => Left(DecodingError(s"Can't build DiffSide from input $other"))
  }

  implicit val encoder: ArgEncoder[DiffSide] = {
    case DiffSide.LEFT  => __EnumValue("LEFT")
    case DiffSide.RIGHT => __EnumValue("RIGHT")
  }

  val values: Vector[DiffSide] = Vector(LEFT, RIGHT)
}

