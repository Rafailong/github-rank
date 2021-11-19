package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CommitContributionOrderField extends scala.Product with scala.Serializable { def value: String }

object CommitContributionOrderField {
  case object COMMIT_COUNT extends CommitContributionOrderField { val value: String = "COMMIT_COUNT" }
  case object OCCURRED_AT extends CommitContributionOrderField { val value: String = "OCCURRED_AT" }

  implicit val decoder: ScalarDecoder[CommitContributionOrderField] = {
    case __StringValue("COMMIT_COUNT") => Right(CommitContributionOrderField.COMMIT_COUNT)
    case __StringValue("OCCURRED_AT")  => Right(CommitContributionOrderField.OCCURRED_AT)
    case other                         => Left(DecodingError(s"Can't build CommitContributionOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[CommitContributionOrderField] = {
    case CommitContributionOrderField.COMMIT_COUNT => __EnumValue("COMMIT_COUNT")
    case CommitContributionOrderField.OCCURRED_AT  => __EnumValue("OCCURRED_AT")
  }

  val values: Vector[CommitContributionOrderField] = Vector(COMMIT_COUNT, OCCURRED_AT)
}

