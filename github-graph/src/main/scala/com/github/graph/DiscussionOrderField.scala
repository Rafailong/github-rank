package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DiscussionOrderField extends scala.Product with scala.Serializable { def value: String }

object DiscussionOrderField {
  case object CREATED_AT extends DiscussionOrderField { val value: String = "CREATED_AT" }
  case object UPDATED_AT extends DiscussionOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[DiscussionOrderField] = {
    case __StringValue("CREATED_AT") => Right(DiscussionOrderField.CREATED_AT)
    case __StringValue("UPDATED_AT") => Right(DiscussionOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build DiscussionOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[DiscussionOrderField] = {
    case DiscussionOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case DiscussionOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[DiscussionOrderField] = Vector(CREATED_AT, UPDATED_AT)
}

