package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PullRequestMergeMethod extends scala.Product with scala.Serializable { def value: String }

object PullRequestMergeMethod {
  case object MERGE extends PullRequestMergeMethod { val value: String = "MERGE" }
  case object REBASE extends PullRequestMergeMethod { val value: String = "REBASE" }
  case object SQUASH extends PullRequestMergeMethod { val value: String = "SQUASH" }

  implicit val decoder: ScalarDecoder[PullRequestMergeMethod] = {
    case __StringValue("MERGE")  => Right(PullRequestMergeMethod.MERGE)
    case __StringValue("REBASE") => Right(PullRequestMergeMethod.REBASE)
    case __StringValue("SQUASH") => Right(PullRequestMergeMethod.SQUASH)
    case other                   => Left(DecodingError(s"Can't build PullRequestMergeMethod from input $other"))
  }

  implicit val encoder: ArgEncoder[PullRequestMergeMethod] = {
    case PullRequestMergeMethod.MERGE  => __EnumValue("MERGE")
    case PullRequestMergeMethod.REBASE => __EnumValue("REBASE")
    case PullRequestMergeMethod.SQUASH => __EnumValue("SQUASH")
  }

  val values: Vector[PullRequestMergeMethod] = Vector(MERGE, REBASE, SQUASH)
}

