package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestOrderField extends scala.Product with scala.Serializable { def value: String }

object PullRequestOrderField {
  case object CREATED_AT extends PullRequestOrderField { val value: String = "CREATED_AT" }
  case object UPDATED_AT extends PullRequestOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[PullRequestOrderField] = {
    case __StringValue("CREATED_AT") => Right(PullRequestOrderField.CREATED_AT)
    case __StringValue("UPDATED_AT") => Right(PullRequestOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build PullRequestOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestOrderField] = {
    case PullRequestOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case PullRequestOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[PullRequestOrderField] = Vector(CREATED_AT, UPDATED_AT)
}

