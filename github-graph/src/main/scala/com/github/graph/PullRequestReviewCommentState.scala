package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestReviewCommentState extends scala.Product with scala.Serializable { def value: String }

object PullRequestReviewCommentState {
  case object PENDING extends PullRequestReviewCommentState { val value: String = "PENDING" }
  case object SUBMITTED extends PullRequestReviewCommentState { val value: String = "SUBMITTED" }

  implicit val decoder: ScalarDecoder[PullRequestReviewCommentState] = {
    case __StringValue("PENDING")   => Right(PullRequestReviewCommentState.PENDING)
    case __StringValue("SUBMITTED") => Right(PullRequestReviewCommentState.SUBMITTED)
    case other                      => Left(DecodingError(s"Can't build PullRequestReviewCommentState from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestReviewCommentState] = {
    case PullRequestReviewCommentState.PENDING   => __EnumValue("PENDING")
    case PullRequestReviewCommentState.SUBMITTED => __EnumValue("SUBMITTED")
  }

  val values: Vector[PullRequestReviewCommentState] = Vector(PENDING, SUBMITTED)
}

