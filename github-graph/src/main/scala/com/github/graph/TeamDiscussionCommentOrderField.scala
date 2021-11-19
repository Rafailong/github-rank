package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamDiscussionCommentOrderField extends scala.Product with scala.Serializable { def value: String }

object TeamDiscussionCommentOrderField {
  case object NUMBER extends TeamDiscussionCommentOrderField { val value: String = "NUMBER" }

  implicit val decoder: ScalarDecoder[TeamDiscussionCommentOrderField] = {
    case __StringValue("NUMBER") => Right(TeamDiscussionCommentOrderField.NUMBER)
    case other                   => Left(DecodingError(s"Can't build TeamDiscussionCommentOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamDiscussionCommentOrderField] = { case TeamDiscussionCommentOrderField.NUMBER =>
    __EnumValue("NUMBER")
  }

  val values: Vector[TeamDiscussionCommentOrderField] = Vector(NUMBER)
}

