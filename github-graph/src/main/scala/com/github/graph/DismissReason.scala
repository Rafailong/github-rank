package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DismissReason extends scala.Product with scala.Serializable { def value: String }

object DismissReason {
  case object FIX_STARTED extends DismissReason { val value: String = "FIX_STARTED" }
  case object INACCURATE extends DismissReason { val value: String = "INACCURATE" }
  case object NOT_USED extends DismissReason { val value: String = "NOT_USED" }
  case object NO_BANDWIDTH extends DismissReason { val value: String = "NO_BANDWIDTH" }
  case object TOLERABLE_RISK extends DismissReason { val value: String = "TOLERABLE_RISK" }

  implicit val decoder: ScalarDecoder[DismissReason] = {
    case __StringValue("FIX_STARTED")    => Right(DismissReason.FIX_STARTED)
    case __StringValue("INACCURATE")     => Right(DismissReason.INACCURATE)
    case __StringValue("NOT_USED")       => Right(DismissReason.NOT_USED)
    case __StringValue("NO_BANDWIDTH")   => Right(DismissReason.NO_BANDWIDTH)
    case __StringValue("TOLERABLE_RISK") => Right(DismissReason.TOLERABLE_RISK)
    case other                           => Left(DecodingError(s"Can't build DismissReason from input $other"))
  }

  implicit val encoder: ArgEncoder[DismissReason] = {
    case DismissReason.FIX_STARTED    => __EnumValue("FIX_STARTED")
    case DismissReason.INACCURATE     => __EnumValue("INACCURATE")
    case DismissReason.NOT_USED       => __EnumValue("NOT_USED")
    case DismissReason.NO_BANDWIDTH   => __EnumValue("NO_BANDWIDTH")
    case DismissReason.TOLERABLE_RISK => __EnumValue("TOLERABLE_RISK")
  }

  val values: Vector[DismissReason] = Vector(FIX_STARTED, INACCURATE, NOT_USED, NO_BANDWIDTH, TOLERABLE_RISK)
}

