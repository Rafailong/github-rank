package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ContributionLevel extends scala.Product with scala.Serializable { def value: String }

object ContributionLevel {
  case object FIRST_QUARTILE extends ContributionLevel { val value: String = "FIRST_QUARTILE" }
  case object FOURTH_QUARTILE extends ContributionLevel { val value: String = "FOURTH_QUARTILE" }
  case object NONE extends ContributionLevel { val value: String = "NONE" }
  case object SECOND_QUARTILE extends ContributionLevel { val value: String = "SECOND_QUARTILE" }
  case object THIRD_QUARTILE extends ContributionLevel { val value: String = "THIRD_QUARTILE" }

  implicit val decoder: ScalarDecoder[ContributionLevel] = {
    case __StringValue("FIRST_QUARTILE")  => Right(ContributionLevel.FIRST_QUARTILE)
    case __StringValue("FOURTH_QUARTILE") => Right(ContributionLevel.FOURTH_QUARTILE)
    case __StringValue("NONE")            => Right(ContributionLevel.NONE)
    case __StringValue("SECOND_QUARTILE") => Right(ContributionLevel.SECOND_QUARTILE)
    case __StringValue("THIRD_QUARTILE")  => Right(ContributionLevel.THIRD_QUARTILE)
    case other                            => Left(DecodingError(s"Can't build ContributionLevel from input $other"))
  }

  implicit val encoder: ArgEncoder[ContributionLevel] = {
    case ContributionLevel.FIRST_QUARTILE  => __EnumValue("FIRST_QUARTILE")
    case ContributionLevel.FOURTH_QUARTILE => __EnumValue("FOURTH_QUARTILE")
    case ContributionLevel.NONE            => __EnumValue("NONE")
    case ContributionLevel.SECOND_QUARTILE => __EnumValue("SECOND_QUARTILE")
    case ContributionLevel.THIRD_QUARTILE  => __EnumValue("THIRD_QUARTILE")
  }

  val values: Vector[ContributionLevel] = Vector(FIRST_QUARTILE, FOURTH_QUARTILE, NONE, SECOND_QUARTILE, THIRD_QUARTILE)
}

