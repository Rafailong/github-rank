package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DeploymentOrderField extends scala.Product with scala.Serializable { def value: String }

object DeploymentOrderField {
  case object CREATED_AT extends DeploymentOrderField { val value: String = "CREATED_AT" }

  implicit val decoder: ScalarDecoder[DeploymentOrderField] = {
    case __StringValue("CREATED_AT") => Right(DeploymentOrderField.CREATED_AT)
    case other                       => Left(DecodingError(s"Can't build DeploymentOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[DeploymentOrderField] = { case DeploymentOrderField.CREATED_AT =>
    __EnumValue("CREATED_AT")
  }

  val values: Vector[DeploymentOrderField] = Vector(CREATED_AT)
}

