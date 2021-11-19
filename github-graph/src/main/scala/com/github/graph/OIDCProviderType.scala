package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OIDCProviderType extends scala.Product with scala.Serializable { def value: String }

object OIDCProviderType {
  case object AAD extends OIDCProviderType { val value: String = "AAD" }

  implicit val decoder: ScalarDecoder[OIDCProviderType] = {
    case __StringValue("AAD") => Right(OIDCProviderType.AAD)
    case other                => Left(DecodingError(s"Can't build OIDCProviderType from input $other"))
  }

  implicit val encoder: ArgEncoder[OIDCProviderType] = { case OIDCProviderType.AAD =>
    __EnumValue("AAD")
  }

  val values: Vector[OIDCProviderType] = Vector(AAD)
}

