package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SecurityAdvisoryIdentifierType extends scala.Product with scala.Serializable { def value: String }

object SecurityAdvisoryIdentifierType {
  case object CVE extends SecurityAdvisoryIdentifierType { val value: String = "CVE" }
  case object GHSA extends SecurityAdvisoryIdentifierType { val value: String = "GHSA" }

  implicit val decoder: ScalarDecoder[SecurityAdvisoryIdentifierType] = {
    case __StringValue("CVE")  => Right(SecurityAdvisoryIdentifierType.CVE)
    case __StringValue("GHSA") => Right(SecurityAdvisoryIdentifierType.GHSA)
    case other                 => Left(DecodingError(s"Can't build SecurityAdvisoryIdentifierType from input $other"))
  }

  implicit val encoder: ArgEncoder[SecurityAdvisoryIdentifierType] = {
    case SecurityAdvisoryIdentifierType.CVE  => __EnumValue("CVE")
    case SecurityAdvisoryIdentifierType.GHSA => __EnumValue("GHSA")
  }

  val values: Vector[SecurityAdvisoryIdentifierType] = Vector(CVE, GHSA)
}

