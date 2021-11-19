package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait FundingPlatform extends scala.Product with scala.Serializable { def value: String }

object FundingPlatform {
  case object COMMUNITY_BRIDGE extends FundingPlatform { val value: String = "COMMUNITY_BRIDGE" }
  case object CUSTOM extends FundingPlatform { val value: String = "CUSTOM" }
  case object GITHUB extends FundingPlatform { val value: String = "GITHUB" }
  case object ISSUEHUNT extends FundingPlatform { val value: String = "ISSUEHUNT" }
  case object KO_FI extends FundingPlatform { val value: String = "KO_FI" }
  case object LIBERAPAY extends FundingPlatform { val value: String = "LIBERAPAY" }
  case object OPEN_COLLECTIVE extends FundingPlatform { val value: String = "OPEN_COLLECTIVE" }
  case object OTECHIE extends FundingPlatform { val value: String = "OTECHIE" }
  case object PATREON extends FundingPlatform { val value: String = "PATREON" }
  case object TIDELIFT extends FundingPlatform { val value: String = "TIDELIFT" }

  implicit val decoder: ScalarDecoder[FundingPlatform] = {
    case __StringValue("COMMUNITY_BRIDGE") => Right(FundingPlatform.COMMUNITY_BRIDGE)
    case __StringValue("CUSTOM")           => Right(FundingPlatform.CUSTOM)
    case __StringValue("GITHUB")           => Right(FundingPlatform.GITHUB)
    case __StringValue("ISSUEHUNT")        => Right(FundingPlatform.ISSUEHUNT)
    case __StringValue("KO_FI")            => Right(FundingPlatform.KO_FI)
    case __StringValue("LIBERAPAY")        => Right(FundingPlatform.LIBERAPAY)
    case __StringValue("OPEN_COLLECTIVE")  => Right(FundingPlatform.OPEN_COLLECTIVE)
    case __StringValue("OTECHIE")          => Right(FundingPlatform.OTECHIE)
    case __StringValue("PATREON")          => Right(FundingPlatform.PATREON)
    case __StringValue("TIDELIFT")         => Right(FundingPlatform.TIDELIFT)
    case other                             => Left(DecodingError(s"Can't build FundingPlatform from input $other"))
  }

  implicit val encoder: ArgEncoder[FundingPlatform] = {
    case FundingPlatform.COMMUNITY_BRIDGE => __EnumValue("COMMUNITY_BRIDGE")
    case FundingPlatform.CUSTOM           => __EnumValue("CUSTOM")
    case FundingPlatform.GITHUB           => __EnumValue("GITHUB")
    case FundingPlatform.ISSUEHUNT        => __EnumValue("ISSUEHUNT")
    case FundingPlatform.KO_FI            => __EnumValue("KO_FI")
    case FundingPlatform.LIBERAPAY        => __EnumValue("LIBERAPAY")
    case FundingPlatform.OPEN_COLLECTIVE  => __EnumValue("OPEN_COLLECTIVE")
    case FundingPlatform.OTECHIE          => __EnumValue("OTECHIE")
    case FundingPlatform.PATREON          => __EnumValue("PATREON")
    case FundingPlatform.TIDELIFT         => __EnumValue("TIDELIFT")
  }

  val values: Vector[FundingPlatform] =
    Vector(COMMUNITY_BRIDGE, CUSTOM, GITHUB, ISSUEHUNT, KO_FI, LIBERAPAY, OPEN_COLLECTIVE, OTECHIE, PATREON, TIDELIFT)
}

