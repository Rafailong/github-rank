package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DeploymentReviewState extends scala.Product with scala.Serializable { def value: String }

object DeploymentReviewState {
  case object APPROVED extends DeploymentReviewState { val value: String = "APPROVED" }
  case object REJECTED extends DeploymentReviewState { val value: String = "REJECTED" }

  implicit val decoder: ScalarDecoder[DeploymentReviewState] = {
    case __StringValue("APPROVED") => Right(DeploymentReviewState.APPROVED)
    case __StringValue("REJECTED") => Right(DeploymentReviewState.REJECTED)
    case other                     => Left(DecodingError(s"Can't build DeploymentReviewState from input $other"))
  }

  implicit val encoder: ArgEncoder[DeploymentReviewState] = {
    case DeploymentReviewState.APPROVED => __EnumValue("APPROVED")
    case DeploymentReviewState.REJECTED => __EnumValue("REJECTED")
  }

  val values: Vector[DeploymentReviewState] = Vector(APPROVED, REJECTED)
}

