package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PackageType extends scala.Product with scala.Serializable { def value: String }

object PackageType {
  case object DEBIAN extends PackageType { val value: String = "DEBIAN" }
  case object DOCKER extends PackageType { val value: String = "DOCKER" }
  case object MAVEN extends PackageType { val value: String = "MAVEN" }
  case object NPM extends PackageType { val value: String = "NPM" }
  case object NUGET extends PackageType { val value: String = "NUGET" }
  case object PYPI extends PackageType { val value: String = "PYPI" }
  case object RUBYGEMS extends PackageType { val value: String = "RUBYGEMS" }

  implicit val decoder: ScalarDecoder[PackageType] = {
    case __StringValue("DEBIAN")   => Right(PackageType.DEBIAN)
    case __StringValue("DOCKER")   => Right(PackageType.DOCKER)
    case __StringValue("MAVEN")    => Right(PackageType.MAVEN)
    case __StringValue("NPM")      => Right(PackageType.NPM)
    case __StringValue("NUGET")    => Right(PackageType.NUGET)
    case __StringValue("PYPI")     => Right(PackageType.PYPI)
    case __StringValue("RUBYGEMS") => Right(PackageType.RUBYGEMS)
    case other                     => Left(DecodingError(s"Can't build PackageType from input $other"))
  }

  implicit val encoder: ArgEncoder[PackageType] = {
    case PackageType.DEBIAN   => __EnumValue("DEBIAN")
    case PackageType.DOCKER   => __EnumValue("DOCKER")
    case PackageType.MAVEN    => __EnumValue("MAVEN")
    case PackageType.NPM      => __EnumValue("NPM")
    case PackageType.NUGET    => __EnumValue("NUGET")
    case PackageType.PYPI     => __EnumValue("PYPI")
    case PackageType.RUBYGEMS => __EnumValue("RUBYGEMS")
  }

  val values: Vector[PackageType] = Vector(DEBIAN, DOCKER, MAVEN, NPM, NUGET, PYPI, RUBYGEMS)
}

