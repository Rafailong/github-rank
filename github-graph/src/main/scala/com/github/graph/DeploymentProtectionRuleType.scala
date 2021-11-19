package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DeploymentProtectionRuleType extends scala.Product with scala.Serializable { def value: String }

object DeploymentProtectionRuleType {
  case object REQUIRED_REVIEWERS extends DeploymentProtectionRuleType { val value: String = "REQUIRED_REVIEWERS" }
  case object WAIT_TIMER extends DeploymentProtectionRuleType { val value: String = "WAIT_TIMER" }

  implicit val decoder: ScalarDecoder[DeploymentProtectionRuleType] = {
    case __StringValue("REQUIRED_REVIEWERS") => Right(DeploymentProtectionRuleType.REQUIRED_REVIEWERS)
    case __StringValue("WAIT_TIMER")         => Right(DeploymentProtectionRuleType.WAIT_TIMER)
    case other                               => Left(DecodingError(s"Can't build DeploymentProtectionRuleType from input $other"))
  }

  implicit val encoder: ArgEncoder[DeploymentProtectionRuleType] = {
    case DeploymentProtectionRuleType.REQUIRED_REVIEWERS => __EnumValue("REQUIRED_REVIEWERS")
    case DeploymentProtectionRuleType.WAIT_TIMER         => __EnumValue("WAIT_TIMER")
  }

  val values: Vector[DeploymentProtectionRuleType] = Vector(REQUIRED_REVIEWERS, WAIT_TIMER)
}

