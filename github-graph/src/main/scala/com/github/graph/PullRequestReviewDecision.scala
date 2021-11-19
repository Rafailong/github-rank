package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestReviewDecision extends scala.Product with scala.Serializable { def value: String }

object PullRequestReviewDecision {
  case object APPROVED extends PullRequestReviewDecision { val value: String = "APPROVED" }
  case object CHANGES_REQUESTED extends PullRequestReviewDecision { val value: String = "CHANGES_REQUESTED" }
  case object REVIEW_REQUIRED extends PullRequestReviewDecision { val value: String = "REVIEW_REQUIRED" }

  implicit val decoder: ScalarDecoder[PullRequestReviewDecision] = {
    case __StringValue("APPROVED")          => Right(PullRequestReviewDecision.APPROVED)
    case __StringValue("CHANGES_REQUESTED") => Right(PullRequestReviewDecision.CHANGES_REQUESTED)
    case __StringValue("REVIEW_REQUIRED")   => Right(PullRequestReviewDecision.REVIEW_REQUIRED)
    case other                              => Left(DecodingError(s"Can't build PullRequestReviewDecision from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestReviewDecision] = {
    case PullRequestReviewDecision.APPROVED          => __EnumValue("APPROVED")
    case PullRequestReviewDecision.CHANGES_REQUESTED => __EnumValue("CHANGES_REQUESTED")
    case PullRequestReviewDecision.REVIEW_REQUIRED   => __EnumValue("REVIEW_REQUIRED")
  }

  val values: Vector[PullRequestReviewDecision] = Vector(APPROVED, CHANGES_REQUESTED, REVIEW_REQUIRED)
}

