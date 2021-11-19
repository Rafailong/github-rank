package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SecurityAdvisoryEcosystem extends scala.Product with scala.Serializable { def value: String }

object SecurityAdvisoryEcosystem {
  case object COMPOSER extends SecurityAdvisoryEcosystem { val value: String = "COMPOSER" }
  case object GO extends SecurityAdvisoryEcosystem { val value: String = "GO" }
  case object MAVEN extends SecurityAdvisoryEcosystem { val value: String = "MAVEN" }
  case object NPM extends SecurityAdvisoryEcosystem { val value: String = "NPM" }
  case object NUGET extends SecurityAdvisoryEcosystem { val value: String = "NUGET" }
  case object PIP extends SecurityAdvisoryEcosystem { val value: String = "PIP" }
  case object RUBYGEMS extends SecurityAdvisoryEcosystem { val value: String = "RUBYGEMS" }
  case object RUST extends SecurityAdvisoryEcosystem { val value: String = "RUST" }

  implicit val decoder: ScalarDecoder[SecurityAdvisoryEcosystem] = {
    case __StringValue("COMPOSER") => Right(SecurityAdvisoryEcosystem.COMPOSER)
    case __StringValue("GO")       => Right(SecurityAdvisoryEcosystem.GO)
    case __StringValue("MAVEN")    => Right(SecurityAdvisoryEcosystem.MAVEN)
    case __StringValue("NPM")      => Right(SecurityAdvisoryEcosystem.NPM)
    case __StringValue("NUGET")    => Right(SecurityAdvisoryEcosystem.NUGET)
    case __StringValue("PIP")      => Right(SecurityAdvisoryEcosystem.PIP)
    case __StringValue("RUBYGEMS") => Right(SecurityAdvisoryEcosystem.RUBYGEMS)
    case __StringValue("RUST")     => Right(SecurityAdvisoryEcosystem.RUST)
    case other                     => Left(DecodingError(s"Can't build SecurityAdvisoryEcosystem from input $other"))
  }

  implicit val encoder: ArgEncoder[SecurityAdvisoryEcosystem] = {
    case SecurityAdvisoryEcosystem.COMPOSER => __EnumValue("COMPOSER")
    case SecurityAdvisoryEcosystem.GO       => __EnumValue("GO")
    case SecurityAdvisoryEcosystem.MAVEN    => __EnumValue("MAVEN")
    case SecurityAdvisoryEcosystem.NPM      => __EnumValue("NPM")
    case SecurityAdvisoryEcosystem.NUGET    => __EnumValue("NUGET")
    case SecurityAdvisoryEcosystem.PIP      => __EnumValue("PIP")
    case SecurityAdvisoryEcosystem.RUBYGEMS => __EnumValue("RUBYGEMS")
    case SecurityAdvisoryEcosystem.RUST     => __EnumValue("RUST")
  }

  val values: Vector[SecurityAdvisoryEcosystem] = Vector(COMPOSER, GO, MAVEN, NPM, NUGET, PIP, RUBYGEMS, RUST)
}

