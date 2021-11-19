package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SamlSignatureAlgorithm extends scala.Product with scala.Serializable { def value: String }

object SamlSignatureAlgorithm {
  case object RSA_SHA1 extends SamlSignatureAlgorithm { val value: String = "RSA_SHA1" }
  case object RSA_SHA256 extends SamlSignatureAlgorithm { val value: String = "RSA_SHA256" }
  case object RSA_SHA384 extends SamlSignatureAlgorithm { val value: String = "RSA_SHA384" }
  case object RSA_SHA512 extends SamlSignatureAlgorithm { val value: String = "RSA_SHA512" }

  implicit val decoder: ScalarDecoder[SamlSignatureAlgorithm] = {
    case __StringValue("RSA_SHA1")   => Right(SamlSignatureAlgorithm.RSA_SHA1)
    case __StringValue("RSA_SHA256") => Right(SamlSignatureAlgorithm.RSA_SHA256)
    case __StringValue("RSA_SHA384") => Right(SamlSignatureAlgorithm.RSA_SHA384)
    case __StringValue("RSA_SHA512") => Right(SamlSignatureAlgorithm.RSA_SHA512)
    case other                       => Left(DecodingError(s"Can't build SamlSignatureAlgorithm from input $other"))
  }

  implicit val encoder: ArgEncoder[SamlSignatureAlgorithm] = {
    case SamlSignatureAlgorithm.RSA_SHA1   => __EnumValue("RSA_SHA1")
    case SamlSignatureAlgorithm.RSA_SHA256 => __EnumValue("RSA_SHA256")
    case SamlSignatureAlgorithm.RSA_SHA384 => __EnumValue("RSA_SHA384")
    case SamlSignatureAlgorithm.RSA_SHA512 => __EnumValue("RSA_SHA512")
  }

  val values: Vector[SamlSignatureAlgorithm] = Vector(RSA_SHA1, RSA_SHA256, RSA_SHA384, RSA_SHA512)
}

