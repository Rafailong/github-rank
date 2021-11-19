package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SecurityAdvisorySeverity extends scala.Product with scala.Serializable { def value: String }

object SecurityAdvisorySeverity {
  case object CRITICAL extends SecurityAdvisorySeverity { val value: String = "CRITICAL" }
  case object HIGH extends SecurityAdvisorySeverity { val value: String = "HIGH" }
  case object LOW extends SecurityAdvisorySeverity { val value: String = "LOW" }
  case object MODERATE extends SecurityAdvisorySeverity { val value: String = "MODERATE" }

  implicit val decoder: ScalarDecoder[SecurityAdvisorySeverity] = {
    case __StringValue("CRITICAL") => Right(SecurityAdvisorySeverity.CRITICAL)
    case __StringValue("HIGH")     => Right(SecurityAdvisorySeverity.HIGH)
    case __StringValue("LOW")      => Right(SecurityAdvisorySeverity.LOW)
    case __StringValue("MODERATE") => Right(SecurityAdvisorySeverity.MODERATE)
    case other                     => Left(DecodingError(s"Can't build SecurityAdvisorySeverity from input $other"))
  }

  implicit val encoder: ArgEncoder[SecurityAdvisorySeverity] = {
    case SecurityAdvisorySeverity.CRITICAL => __EnumValue("CRITICAL")
    case SecurityAdvisorySeverity.HIGH     => __EnumValue("HIGH")
    case SecurityAdvisorySeverity.LOW      => __EnumValue("LOW")
    case SecurityAdvisorySeverity.MODERATE => __EnumValue("MODERATE")
  }

  val values: Vector[SecurityAdvisorySeverity] = Vector(CRITICAL, HIGH, LOW, MODERATE)
}

