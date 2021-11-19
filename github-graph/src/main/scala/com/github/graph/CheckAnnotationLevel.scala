package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CheckAnnotationLevel extends scala.Product with scala.Serializable { def value: String }

object CheckAnnotationLevel {
  case object FAILURE extends CheckAnnotationLevel { val value: String = "FAILURE" }
  case object NOTICE extends CheckAnnotationLevel { val value: String = "NOTICE" }
  case object WARNING extends CheckAnnotationLevel { val value: String = "WARNING" }

  implicit val decoder: ScalarDecoder[CheckAnnotationLevel] = {
    case __StringValue("FAILURE") => Right(CheckAnnotationLevel.FAILURE)
    case __StringValue("NOTICE")  => Right(CheckAnnotationLevel.NOTICE)
    case __StringValue("WARNING") => Right(CheckAnnotationLevel.WARNING)
    case other                    => Left(DecodingError(s"Can't build CheckAnnotationLevel from input $other"))
  }

  implicit val encoder: ArgEncoder[CheckAnnotationLevel] = {
    case CheckAnnotationLevel.FAILURE => __EnumValue("FAILURE")
    case CheckAnnotationLevel.NOTICE  => __EnumValue("NOTICE")
    case CheckAnnotationLevel.WARNING => __EnumValue("WARNING")
  }

  val values: Vector[CheckAnnotationLevel] = Vector(FAILURE, NOTICE, WARNING)
}

