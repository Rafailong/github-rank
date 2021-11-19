package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SponsorshipPrivacy extends scala.Product with scala.Serializable { def value: String }

object SponsorshipPrivacy {
  case object PRIVATE extends SponsorshipPrivacy { val value: String = "PRIVATE" }
  case object PUBLIC extends SponsorshipPrivacy { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[SponsorshipPrivacy] = {
    case __StringValue("PRIVATE") => Right(SponsorshipPrivacy.PRIVATE)
    case __StringValue("PUBLIC")  => Right(SponsorshipPrivacy.PUBLIC)
    case other                    => Left(DecodingError(s"Can't build SponsorshipPrivacy from input $other"))
  }

  implicit val encoder: ArgEncoder[SponsorshipPrivacy] = {
    case SponsorshipPrivacy.PRIVATE => __EnumValue("PRIVATE")
    case SponsorshipPrivacy.PUBLIC  => __EnumValue("PUBLIC")
  }

  val values: Vector[SponsorshipPrivacy] = Vector(PRIVATE, PUBLIC)
}

