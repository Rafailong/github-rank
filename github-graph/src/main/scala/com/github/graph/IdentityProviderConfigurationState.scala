package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait IdentityProviderConfigurationState extends scala.Product with scala.Serializable { def value: String }

object IdentityProviderConfigurationState {
  case object CONFIGURED extends IdentityProviderConfigurationState { val value: String = "CONFIGURED" }
  case object ENFORCED extends IdentityProviderConfigurationState { val value: String = "ENFORCED" }
  case object UNCONFIGURED extends IdentityProviderConfigurationState { val value: String = "UNCONFIGURED" }

  implicit val decoder: ScalarDecoder[IdentityProviderConfigurationState] = {
    case __StringValue("CONFIGURED")   => Right(IdentityProviderConfigurationState.CONFIGURED)
    case __StringValue("ENFORCED")     => Right(IdentityProviderConfigurationState.ENFORCED)
    case __StringValue("UNCONFIGURED") => Right(IdentityProviderConfigurationState.UNCONFIGURED)
    case other                         => Left(DecodingError(s"Can't build IdentityProviderConfigurationState from input $other"))
  }

  implicit val encoder: ArgEncoder[IdentityProviderConfigurationState] = {
    case IdentityProviderConfigurationState.CONFIGURED   => __EnumValue("CONFIGURED")
    case IdentityProviderConfigurationState.ENFORCED     => __EnumValue("ENFORCED")
    case IdentityProviderConfigurationState.UNCONFIGURED => __EnumValue("UNCONFIGURED")
  }

  val values: Vector[IdentityProviderConfigurationState] = Vector(CONFIGURED, ENFORCED, UNCONFIGURED)
}

