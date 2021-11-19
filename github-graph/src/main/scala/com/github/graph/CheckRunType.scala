package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CheckRunType extends scala.Product with scala.Serializable { def value: String }

object CheckRunType {
  case object ALL extends CheckRunType { val value: String = "ALL" }
  case object LATEST extends CheckRunType { val value: String = "LATEST" }

  implicit val decoder: ScalarDecoder[CheckRunType] = {
    case __StringValue("ALL")    => Right(CheckRunType.ALL)
    case __StringValue("LATEST") => Right(CheckRunType.LATEST)
    case other                   => Left(DecodingError(s"Can't build CheckRunType from input $other"))
  }

  implicit val encoder: ArgEncoder[CheckRunType] = {
    case CheckRunType.ALL    => __EnumValue("ALL")
    case CheckRunType.LATEST => __EnumValue("LATEST")
  }

  val values: Vector[CheckRunType] = Vector(ALL, LATEST)
}

