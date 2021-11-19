package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait GistOrderField extends scala.Product with scala.Serializable { def value: String }

object GistOrderField {
  case object CREATED_AT extends GistOrderField { val value: String = "CREATED_AT" }
  case object PUSHED_AT extends GistOrderField { val value: String = "PUSHED_AT" }
  case object UPDATED_AT extends GistOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[GistOrderField] = {
    case __StringValue("CREATED_AT") => Right(GistOrderField.CREATED_AT)
    case __StringValue("PUSHED_AT")  => Right(GistOrderField.PUSHED_AT)
    case __StringValue("UPDATED_AT") => Right(GistOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build GistOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[GistOrderField] = {
    case GistOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case GistOrderField.PUSHED_AT  => __EnumValue("PUSHED_AT")
    case GistOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[GistOrderField] = Vector(CREATED_AT, PUSHED_AT, UPDATED_AT)
}

