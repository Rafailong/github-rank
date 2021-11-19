package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TopicSuggestionDeclineReason extends scala.Product with scala.Serializable { def value: String }

object TopicSuggestionDeclineReason {
  case object NOT_RELEVANT extends TopicSuggestionDeclineReason { val value: String = "NOT_RELEVANT" }
  case object PERSONAL_PREFERENCE extends TopicSuggestionDeclineReason { val value: String = "PERSONAL_PREFERENCE" }
  case object TOO_GENERAL extends TopicSuggestionDeclineReason { val value: String = "TOO_GENERAL" }
  case object TOO_SPECIFIC extends TopicSuggestionDeclineReason { val value: String = "TOO_SPECIFIC" }

  implicit val decoder: ScalarDecoder[TopicSuggestionDeclineReason] = {
    case __StringValue("NOT_RELEVANT")        => Right(TopicSuggestionDeclineReason.NOT_RELEVANT)
    case __StringValue("PERSONAL_PREFERENCE") => Right(TopicSuggestionDeclineReason.PERSONAL_PREFERENCE)
    case __StringValue("TOO_GENERAL")         => Right(TopicSuggestionDeclineReason.TOO_GENERAL)
    case __StringValue("TOO_SPECIFIC")        => Right(TopicSuggestionDeclineReason.TOO_SPECIFIC)
    case other                                => Left(DecodingError(s"Can't build TopicSuggestionDeclineReason from input $other"))
  }

  implicit val encoder: ArgEncoder[TopicSuggestionDeclineReason] = {
    case TopicSuggestionDeclineReason.NOT_RELEVANT        => __EnumValue("NOT_RELEVANT")
    case TopicSuggestionDeclineReason.PERSONAL_PREFERENCE => __EnumValue("PERSONAL_PREFERENCE")
    case TopicSuggestionDeclineReason.TOO_GENERAL         => __EnumValue("TOO_GENERAL")
    case TopicSuggestionDeclineReason.TOO_SPECIFIC        => __EnumValue("TOO_SPECIFIC")
  }

  val values: Vector[TopicSuggestionDeclineReason] = Vector(NOT_RELEVANT, PERSONAL_PREFERENCE, TOO_GENERAL, TOO_SPECIFIC)
}

