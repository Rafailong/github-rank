package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseUserDeployment extends scala.Product with scala.Serializable { def value: String }

object EnterpriseUserDeployment {
  case object CLOUD extends EnterpriseUserDeployment { val value: String = "CLOUD" }
  case object SERVER extends EnterpriseUserDeployment { val value: String = "SERVER" }

  implicit val decoder: ScalarDecoder[EnterpriseUserDeployment] = {
    case __StringValue("CLOUD")  => Right(EnterpriseUserDeployment.CLOUD)
    case __StringValue("SERVER") => Right(EnterpriseUserDeployment.SERVER)
    case other                   => Left(DecodingError(s"Can't build EnterpriseUserDeployment from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseUserDeployment] = {
    case EnterpriseUserDeployment.CLOUD  => __EnumValue("CLOUD")
    case EnterpriseUserDeployment.SERVER => __EnumValue("SERVER")
  }

  val values: Vector[EnterpriseUserDeployment] = Vector(CLOUD, SERVER)
}

