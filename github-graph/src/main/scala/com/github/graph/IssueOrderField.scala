package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IssueOrderField extends scala.Product with scala.Serializable { def value: String }

object IssueOrderField {
  case object COMMENTS extends IssueOrderField { val value: String = "COMMENTS" }
  case object CREATED_AT extends IssueOrderField { val value: String = "CREATED_AT" }
  case object UPDATED_AT extends IssueOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[IssueOrderField] = {
    case __StringValue("COMMENTS")   => Right(IssueOrderField.COMMENTS)
    case __StringValue("CREATED_AT") => Right(IssueOrderField.CREATED_AT)
    case __StringValue("UPDATED_AT") => Right(IssueOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build IssueOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[IssueOrderField] = {
    case IssueOrderField.COMMENTS   => __EnumValue("COMMENTS")
    case IssueOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case IssueOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[IssueOrderField] = Vector(COMMENTS, CREATED_AT, UPDATED_AT)
}

