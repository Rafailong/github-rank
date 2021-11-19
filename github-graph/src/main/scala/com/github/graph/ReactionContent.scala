package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ReactionContent extends scala.Product with scala.Serializable { def value: String }

object ReactionContent {
  case object CONFUSED extends ReactionContent { val value: String = "CONFUSED" }
  case object EYES extends ReactionContent { val value: String = "EYES" }
  case object HEART extends ReactionContent { val value: String = "HEART" }
  case object HOORAY extends ReactionContent { val value: String = "HOORAY" }
  case object LAUGH extends ReactionContent { val value: String = "LAUGH" }
  case object ROCKET extends ReactionContent { val value: String = "ROCKET" }
  case object THUMBS_DOWN extends ReactionContent { val value: String = "THUMBS_DOWN" }
  case object THUMBS_UP extends ReactionContent { val value: String = "THUMBS_UP" }

  implicit val decoder: ScalarDecoder[ReactionContent] = {
    case __StringValue("CONFUSED")    => Right(ReactionContent.CONFUSED)
    case __StringValue("EYES")        => Right(ReactionContent.EYES)
    case __StringValue("HEART")       => Right(ReactionContent.HEART)
    case __StringValue("HOORAY")      => Right(ReactionContent.HOORAY)
    case __StringValue("LAUGH")       => Right(ReactionContent.LAUGH)
    case __StringValue("ROCKET")      => Right(ReactionContent.ROCKET)
    case __StringValue("THUMBS_DOWN") => Right(ReactionContent.THUMBS_DOWN)
    case __StringValue("THUMBS_UP")   => Right(ReactionContent.THUMBS_UP)
    case other                        => Left(DecodingError(s"Can't build ReactionContent from input $other"))
  }

  implicit val encoder: ArgEncoder[ReactionContent] = {
    case ReactionContent.CONFUSED    => __EnumValue("CONFUSED")
    case ReactionContent.EYES        => __EnumValue("EYES")
    case ReactionContent.HEART       => __EnumValue("HEART")
    case ReactionContent.HOORAY      => __EnumValue("HOORAY")
    case ReactionContent.LAUGH       => __EnumValue("LAUGH")
    case ReactionContent.ROCKET      => __EnumValue("ROCKET")
    case ReactionContent.THUMBS_DOWN => __EnumValue("THUMBS_DOWN")
    case ReactionContent.THUMBS_UP   => __EnumValue("THUMBS_UP")
  }

  val values: Vector[ReactionContent] = Vector(CONFUSED, EYES, HEART, HOORAY, LAUGH, ROCKET, THUMBS_DOWN, THUMBS_UP)
}

