package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IssueCommentOrderField extends scala.Product with scala.Serializable { def value: String }

object IssueCommentOrderField {
  case object UPDATED_AT extends IssueCommentOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[IssueCommentOrderField] = {
    case __StringValue("UPDATED_AT") => Right(IssueCommentOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build IssueCommentOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[IssueCommentOrderField] = { case IssueCommentOrderField.UPDATED_AT =>
    __EnumValue("UPDATED_AT")
  }

  val values: Vector[IssueCommentOrderField] = Vector(UPDATED_AT)
}

