package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PinnedDiscussionPattern extends scala.Product with scala.Serializable { def value: String }

object PinnedDiscussionPattern {
  case object CHEVRON_UP extends PinnedDiscussionPattern { val value: String = "CHEVRON_UP" }
  case object DOT extends PinnedDiscussionPattern { val value: String = "DOT" }
  case object DOT_FILL extends PinnedDiscussionPattern { val value: String = "DOT_FILL" }
  case object HEART_FILL extends PinnedDiscussionPattern { val value: String = "HEART_FILL" }
  case object PLUS extends PinnedDiscussionPattern { val value: String = "PLUS" }
  case object ZAP extends PinnedDiscussionPattern { val value: String = "ZAP" }

  implicit val decoder: ScalarDecoder[PinnedDiscussionPattern] = {
    case __StringValue("CHEVRON_UP") => Right(PinnedDiscussionPattern.CHEVRON_UP)
    case __StringValue("DOT")        => Right(PinnedDiscussionPattern.DOT)
    case __StringValue("DOT_FILL")   => Right(PinnedDiscussionPattern.DOT_FILL)
    case __StringValue("HEART_FILL") => Right(PinnedDiscussionPattern.HEART_FILL)
    case __StringValue("PLUS")       => Right(PinnedDiscussionPattern.PLUS)
    case __StringValue("ZAP")        => Right(PinnedDiscussionPattern.ZAP)
    case other                       => Left(DecodingError(s"Can't build PinnedDiscussionPattern from input $other"))
  }

  implicit val encoder: ArgEncoder[PinnedDiscussionPattern] = {
    case PinnedDiscussionPattern.CHEVRON_UP => __EnumValue("CHEVRON_UP")
    case PinnedDiscussionPattern.DOT        => __EnumValue("DOT")
    case PinnedDiscussionPattern.DOT_FILL   => __EnumValue("DOT_FILL")
    case PinnedDiscussionPattern.HEART_FILL => __EnumValue("HEART_FILL")
    case PinnedDiscussionPattern.PLUS       => __EnumValue("PLUS")
    case PinnedDiscussionPattern.ZAP        => __EnumValue("ZAP")
  }

  val values: Vector[PinnedDiscussionPattern] = Vector(CHEVRON_UP, DOT, DOT_FILL, HEART_FILL, PLUS, ZAP)
}

