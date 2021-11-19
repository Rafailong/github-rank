package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PinnedDiscussionGradient extends scala.Product with scala.Serializable { def value: String }

object PinnedDiscussionGradient {
  case object BLUE_MINT extends PinnedDiscussionGradient { val value: String = "BLUE_MINT" }
  case object BLUE_PURPLE extends PinnedDiscussionGradient { val value: String = "BLUE_PURPLE" }
  case object PINK_BLUE extends PinnedDiscussionGradient { val value: String = "PINK_BLUE" }
  case object PURPLE_CORAL extends PinnedDiscussionGradient { val value: String = "PURPLE_CORAL" }
  case object RED_ORANGE extends PinnedDiscussionGradient { val value: String = "RED_ORANGE" }

  implicit val decoder: ScalarDecoder[PinnedDiscussionGradient] = {
    case __StringValue("BLUE_MINT")    => Right(PinnedDiscussionGradient.BLUE_MINT)
    case __StringValue("BLUE_PURPLE")  => Right(PinnedDiscussionGradient.BLUE_PURPLE)
    case __StringValue("PINK_BLUE")    => Right(PinnedDiscussionGradient.PINK_BLUE)
    case __StringValue("PURPLE_CORAL") => Right(PinnedDiscussionGradient.PURPLE_CORAL)
    case __StringValue("RED_ORANGE")   => Right(PinnedDiscussionGradient.RED_ORANGE)
    case other                         => Left(DecodingError(s"Can't build PinnedDiscussionGradient from input $other"))
  }

  implicit val encoder: ArgEncoder[PinnedDiscussionGradient] = {
    case PinnedDiscussionGradient.BLUE_MINT    => __EnumValue("BLUE_MINT")
    case PinnedDiscussionGradient.BLUE_PURPLE  => __EnumValue("BLUE_PURPLE")
    case PinnedDiscussionGradient.PINK_BLUE    => __EnumValue("PINK_BLUE")
    case PinnedDiscussionGradient.PURPLE_CORAL => __EnumValue("PURPLE_CORAL")
    case PinnedDiscussionGradient.RED_ORANGE   => __EnumValue("RED_ORANGE")
  }

  val values: Vector[PinnedDiscussionGradient] = Vector(BLUE_MINT, BLUE_PURPLE, PINK_BLUE, PURPLE_CORAL, RED_ORANGE)
}

