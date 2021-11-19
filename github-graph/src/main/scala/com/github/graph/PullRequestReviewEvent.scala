package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestReviewEvent extends scala.Product with scala.Serializable { def value: String }

object PullRequestReviewEvent {
  case object APPROVE extends PullRequestReviewEvent { val value: String = "APPROVE" }
  case object COMMENT extends PullRequestReviewEvent { val value: String = "COMMENT" }
  case object DISMISS extends PullRequestReviewEvent { val value: String = "DISMISS" }
  case object REQUEST_CHANGES extends PullRequestReviewEvent { val value: String = "REQUEST_CHANGES" }

  implicit val decoder: ScalarDecoder[PullRequestReviewEvent] = {
    case __StringValue("APPROVE")         => Right(PullRequestReviewEvent.APPROVE)
    case __StringValue("COMMENT")         => Right(PullRequestReviewEvent.COMMENT)
    case __StringValue("DISMISS")         => Right(PullRequestReviewEvent.DISMISS)
    case __StringValue("REQUEST_CHANGES") => Right(PullRequestReviewEvent.REQUEST_CHANGES)
    case other                            => Left(DecodingError(s"Can't build PullRequestReviewEvent from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestReviewEvent] = {
    case PullRequestReviewEvent.APPROVE         => __EnumValue("APPROVE")
    case PullRequestReviewEvent.COMMENT         => __EnumValue("COMMENT")
    case PullRequestReviewEvent.DISMISS         => __EnumValue("DISMISS")
    case PullRequestReviewEvent.REQUEST_CHANGES => __EnumValue("REQUEST_CHANGES")
  }

  val values: Vector[PullRequestReviewEvent] = Vector(APPROVE, COMMENT, DISMISS, REQUEST_CHANGES)
}

