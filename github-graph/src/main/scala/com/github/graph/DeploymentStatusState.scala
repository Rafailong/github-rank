package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DeploymentStatusState extends scala.Product with scala.Serializable { def value: String }

object DeploymentStatusState {
  case object ERROR extends DeploymentStatusState { val value: String = "ERROR" }
  case object FAILURE extends DeploymentStatusState { val value: String = "FAILURE" }
  case object INACTIVE extends DeploymentStatusState { val value: String = "INACTIVE" }
  case object IN_PROGRESS extends DeploymentStatusState { val value: String = "IN_PROGRESS" }
  case object PENDING extends DeploymentStatusState { val value: String = "PENDING" }
  case object QUEUED extends DeploymentStatusState { val value: String = "QUEUED" }
  case object SUCCESS extends DeploymentStatusState { val value: String = "SUCCESS" }
  case object WAITING extends DeploymentStatusState { val value: String = "WAITING" }

  implicit val decoder: ScalarDecoder[DeploymentStatusState] = {
    case __StringValue("ERROR")       => Right(DeploymentStatusState.ERROR)
    case __StringValue("FAILURE")     => Right(DeploymentStatusState.FAILURE)
    case __StringValue("INACTIVE")    => Right(DeploymentStatusState.INACTIVE)
    case __StringValue("IN_PROGRESS") => Right(DeploymentStatusState.IN_PROGRESS)
    case __StringValue("PENDING")     => Right(DeploymentStatusState.PENDING)
    case __StringValue("QUEUED")      => Right(DeploymentStatusState.QUEUED)
    case __StringValue("SUCCESS")     => Right(DeploymentStatusState.SUCCESS)
    case __StringValue("WAITING")     => Right(DeploymentStatusState.WAITING)
    case other                        => Left(DecodingError(s"Can't build DeploymentStatusState from input $other"))
  }

  implicit val encoder: ArgEncoder[DeploymentStatusState] = {
    case DeploymentStatusState.ERROR       => __EnumValue("ERROR")
    case DeploymentStatusState.FAILURE     => __EnumValue("FAILURE")
    case DeploymentStatusState.INACTIVE    => __EnumValue("INACTIVE")
    case DeploymentStatusState.IN_PROGRESS => __EnumValue("IN_PROGRESS")
    case DeploymentStatusState.PENDING     => __EnumValue("PENDING")
    case DeploymentStatusState.QUEUED      => __EnumValue("QUEUED")
    case DeploymentStatusState.SUCCESS     => __EnumValue("SUCCESS")
    case DeploymentStatusState.WAITING     => __EnumValue("WAITING")
  }

  val values: Vector[DeploymentStatusState] = Vector(ERROR, FAILURE, INACTIVE, IN_PROGRESS, PENDING, QUEUED, SUCCESS, WAITING)
}

