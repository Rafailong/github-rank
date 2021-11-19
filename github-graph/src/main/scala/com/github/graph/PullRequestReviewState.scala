package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestReviewState extends scala.Product with scala.Serializable { def value: String }

object PullRequestReviewState {
  case object APPROVED extends PullRequestReviewState { val value: String = "APPROVED" }
  case object CHANGES_REQUESTED extends PullRequestReviewState { val value: String = "CHANGES_REQUESTED" }
  case object COMMENTED extends PullRequestReviewState { val value: String = "COMMENTED" }
  case object DISMISSED extends PullRequestReviewState { val value: String = "DISMISSED" }
  case object PENDING extends PullRequestReviewState { val value: String = "PENDING" }

  implicit val decoder: ScalarDecoder[PullRequestReviewState] = {
    case __StringValue("APPROVED")          => Right(PullRequestReviewState.APPROVED)
    case __StringValue("CHANGES_REQUESTED") => Right(PullRequestReviewState.CHANGES_REQUESTED)
    case __StringValue("COMMENTED")         => Right(PullRequestReviewState.COMMENTED)
    case __StringValue("DISMISSED")         => Right(PullRequestReviewState.DISMISSED)
    case __StringValue("PENDING")           => Right(PullRequestReviewState.PENDING)
    case other                              => Left(DecodingError(s"Can't build PullRequestReviewState from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestReviewState] = {
    case PullRequestReviewState.APPROVED          => __EnumValue("APPROVED")
    case PullRequestReviewState.CHANGES_REQUESTED => __EnumValue("CHANGES_REQUESTED")
    case PullRequestReviewState.COMMENTED         => __EnumValue("COMMENTED")
    case PullRequestReviewState.DISMISSED         => __EnumValue("DISMISSED")
    case PullRequestReviewState.PENDING           => __EnumValue("PENDING")
  }

  val values: Vector[PullRequestReviewState] = Vector(APPROVED, CHANGES_REQUESTED, COMMENTED, DISMISSED, PENDING)
}

