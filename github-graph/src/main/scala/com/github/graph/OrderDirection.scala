package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrderDirection extends scala.Product with scala.Serializable { def value: String }

object OrderDirection {
  case object ASC extends OrderDirection { val value: String = "ASC" }
  case object DESC extends OrderDirection { val value: String = "DESC" }

  implicit val decoder: ScalarDecoder[OrderDirection] = {
    case __StringValue("ASC")  => Right(OrderDirection.ASC)
    case __StringValue("DESC") => Right(OrderDirection.DESC)
    case other                 => Left(DecodingError(s"Can't build OrderDirection from input $other"))
  }

  implicit val encoder: ArgEncoder[OrderDirection] = {
    case OrderDirection.ASC  => __EnumValue("ASC")
    case OrderDirection.DESC => __EnumValue("DESC")
  }

  val values: Vector[OrderDirection] = Vector(ASC, DESC)
}

