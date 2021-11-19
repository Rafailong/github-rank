package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryInteractionLimitExpiry extends scala.Product with scala.Serializable { def value: String }

object RepositoryInteractionLimitExpiry {
  case object ONE_DAY extends RepositoryInteractionLimitExpiry { val value: String = "ONE_DAY" }
  case object ONE_MONTH extends RepositoryInteractionLimitExpiry { val value: String = "ONE_MONTH" }
  case object ONE_WEEK extends RepositoryInteractionLimitExpiry { val value: String = "ONE_WEEK" }
  case object SIX_MONTHS extends RepositoryInteractionLimitExpiry { val value: String = "SIX_MONTHS" }
  case object THREE_DAYS extends RepositoryInteractionLimitExpiry { val value: String = "THREE_DAYS" }

  implicit val decoder: ScalarDecoder[RepositoryInteractionLimitExpiry] = {
    case __StringValue("ONE_DAY")    => Right(RepositoryInteractionLimitExpiry.ONE_DAY)
    case __StringValue("ONE_MONTH")  => Right(RepositoryInteractionLimitExpiry.ONE_MONTH)
    case __StringValue("ONE_WEEK")   => Right(RepositoryInteractionLimitExpiry.ONE_WEEK)
    case __StringValue("SIX_MONTHS") => Right(RepositoryInteractionLimitExpiry.SIX_MONTHS)
    case __StringValue("THREE_DAYS") => Right(RepositoryInteractionLimitExpiry.THREE_DAYS)
    case other                       => Left(DecodingError(s"Can't build RepositoryInteractionLimitExpiry from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryInteractionLimitExpiry] = {
    case RepositoryInteractionLimitExpiry.ONE_DAY    => __EnumValue("ONE_DAY")
    case RepositoryInteractionLimitExpiry.ONE_MONTH  => __EnumValue("ONE_MONTH")
    case RepositoryInteractionLimitExpiry.ONE_WEEK   => __EnumValue("ONE_WEEK")
    case RepositoryInteractionLimitExpiry.SIX_MONTHS => __EnumValue("SIX_MONTHS")
    case RepositoryInteractionLimitExpiry.THREE_DAYS => __EnumValue("THREE_DAYS")
  }

  val values: Vector[RepositoryInteractionLimitExpiry] = Vector(ONE_DAY, ONE_MONTH, ONE_WEEK, SIX_MONTHS, THREE_DAYS)
}

