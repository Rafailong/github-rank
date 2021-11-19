package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamDiscussionOrderField extends scala.Product with scala.Serializable { def value: String }

object TeamDiscussionOrderField {
  case object CREATED_AT extends TeamDiscussionOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[TeamDiscussionOrderField] = {
    case __StringValue("CREATED_AT") => Right(TeamDiscussionOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build TeamDiscussionOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamDiscussionOrderField] = { case TeamDiscussionOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[TeamDiscussionOrderField] = Vector(CREATED_AT)
}

