package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DeploymentState extends scala.Product with scala.Serializable { def value: String }

object DeploymentState {
  case object ABANDONED extends DeploymentState { val value: String = "ABANDONED" }
  case object ACTIVE extends DeploymentState { val value: String = "ACTIVE" }
  case object DESTROYED extends DeploymentState { val value: String = "DESTROYED" }
  case object ERROR extends DeploymentState { val value: String = "ERROR" }
  case object FAILURE extends DeploymentState { val value: String = "FAILURE" }
  case object INACTIVE extends DeploymentState { val value: String = "INACTIVE" }
  case object IN_PROGRESS extends DeploymentState { val value: String = "IN_PROGRESS" }
  case object PENDING extends DeploymentState { val value: String = "PENDING" }
  case object QUEUED extends DeploymentState { val value: String = "QUEUED" }
  case object WAITING extends DeploymentState { val value: String = "WAITING" }

  implicit val decoder: ScalarDecoder[DeploymentState] = {
    case __StringValue("ABANDONED")   => Right(DeploymentState.ABANDONED)
    case __StringValue("ACTIVE")      => Right(DeploymentState.ACTIVE)
    case __StringValue("DESTROYED")   => Right(DeploymentState.DESTROYED)
    case __StringValue("ERROR")       => Right(DeploymentState.ERROR)
    case __StringValue("FAILURE")     => Right(DeploymentState.FAILURE)
    case __StringValue("INACTIVE")    => Right(DeploymentState.INACTIVE)
    case __StringValue("IN_PROGRESS") => Right(DeploymentState.IN_PROGRESS)
    case __StringValue("PENDING")     => Right(DeploymentState.PENDING)
    case __StringValue("QUEUED")      => Right(DeploymentState.QUEUED)
    case __StringValue("WAITING")     => Right(DeploymentState.WAITING)
    case other                        => Left(DecodingError(s"Can't build DeploymentState from input $other"))
  }

  implicit val encoder: ArgEncoder[DeploymentState] = {
    case DeploymentState.ABANDONED   => __EnumValue("ABANDONED")
    case DeploymentState.ACTIVE      => __EnumValue("ACTIVE")
    case DeploymentState.DESTROYED   => __EnumValue("DESTROYED")
    case DeploymentState.ERROR       => __EnumValue("ERROR")
    case DeploymentState.FAILURE     => __EnumValue("FAILURE")
    case DeploymentState.INACTIVE    => __EnumValue("INACTIVE")
    case DeploymentState.IN_PROGRESS => __EnumValue("IN_PROGRESS")
    case DeploymentState.PENDING     => __EnumValue("PENDING")
    case DeploymentState.QUEUED      => __EnumValue("QUEUED")
    case DeploymentState.WAITING     => __EnumValue("WAITING")
  }

  val values: Vector[DeploymentState] = Vector(ABANDONED, ACTIVE, DESTROYED, ERROR, FAILURE, INACTIVE, IN_PROGRESS, PENDING, QUEUED, WAITING)
}

