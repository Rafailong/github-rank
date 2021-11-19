package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamReviewAssignmentAlgorithm extends scala.Product with scala.Serializable { def value: String }

object TeamReviewAssignmentAlgorithm {
  case object LOAD_BALANCE extends TeamReviewAssignmentAlgorithm { val value: String = "LOAD_BALANCE" }
  case object ROUND_ROBIN extends TeamReviewAssignmentAlgorithm { val value: String = "ROUND_ROBIN" }

  implicit val decoder: ScalarDecoder[TeamReviewAssignmentAlgorithm] = {
    case __StringValue("LOAD_BALANCE") => Right(TeamReviewAssignmentAlgorithm.LOAD_BALANCE)
    case __StringValue("ROUND_ROBIN")  => Right(TeamReviewAssignmentAlgorithm.ROUND_ROBIN)
    case other                         => Left(DecodingError(s"Can't build TeamReviewAssignmentAlgorithm from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamReviewAssignmentAlgorithm] = {
    case TeamReviewAssignmentAlgorithm.LOAD_BALANCE => __EnumValue("LOAD_BALANCE")
    case TeamReviewAssignmentAlgorithm.ROUND_ROBIN  => __EnumValue("ROUND_ROBIN")
  }

  val values: Vector[TeamReviewAssignmentAlgorithm] = Vector(LOAD_BALANCE, ROUND_ROBIN)
}

