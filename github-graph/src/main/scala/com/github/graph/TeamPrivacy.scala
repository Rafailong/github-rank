package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamPrivacy extends scala.Product with scala.Serializable { def value: String }

object TeamPrivacy {
  case object SECRET extends TeamPrivacy { val value: String = "SECRET" }
  case object VISIBLE extends TeamPrivacy { val value: String = "VISIBLE" }

  implicit val decoder: ScalarDecoder[TeamPrivacy] = {
    case __StringValue("SECRET")  => Right(TeamPrivacy.SECRET)
    case __StringValue("VISIBLE") => Right(TeamPrivacy.VISIBLE)
    case other                    => Left(DecodingError(s"Can't build TeamPrivacy from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamPrivacy] = {
    case TeamPrivacy.SECRET  => __EnumValue("SECRET")
    case TeamPrivacy.VISIBLE => __EnumValue("VISIBLE")
  }

  val values: Vector[TeamPrivacy] = Vector(SECRET, VISIBLE)
}

