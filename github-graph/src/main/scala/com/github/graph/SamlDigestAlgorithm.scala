package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SamlDigestAlgorithm extends scala.Product with scala.Serializable { def value: String }

object SamlDigestAlgorithm {
  case object SHA1 extends SamlDigestAlgorithm { val value: String = "SHA1" }
  case object SHA256 extends SamlDigestAlgorithm { val value: String = "SHA256" }
  case object SHA384 extends SamlDigestAlgorithm { val value: String = "SHA384" }
  case object SHA512 extends SamlDigestAlgorithm { val value: String = "SHA512" }

  implicit val decoder: ScalarDecoder[SamlDigestAlgorithm] = {
    case __StringValue("SHA1")   => Right(SamlDigestAlgorithm.SHA1)
    case __StringValue("SHA256") => Right(SamlDigestAlgorithm.SHA256)
    case __StringValue("SHA384") => Right(SamlDigestAlgorithm.SHA384)
    case __StringValue("SHA512") => Right(SamlDigestAlgorithm.SHA512)
    case other                   => Left(DecodingError(s"Can't build SamlDigestAlgorithm from input $other"))
  }

  implicit val encoder: ArgEncoder[SamlDigestAlgorithm] = {
    case SamlDigestAlgorithm.SHA1   => __EnumValue("SHA1")
    case SamlDigestAlgorithm.SHA256 => __EnumValue("SHA256")
    case SamlDigestAlgorithm.SHA384 => __EnumValue("SHA384")
    case SamlDigestAlgorithm.SHA512 => __EnumValue("SHA512")
  }

  val values: Vector[SamlDigestAlgorithm] = Vector(SHA1, SHA256, SHA384, SHA512)
}

