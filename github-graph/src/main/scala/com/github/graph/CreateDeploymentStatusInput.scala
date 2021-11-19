package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateDeploymentStatusInput(
  autoInactive: Option[Boolean]    = None,
  clientMutationId: Option[String] = None,
  deploymentId: String,
  description: Option[String]    = None,
  environment: Option[String]    = None,
  environmentUrl: Option[String] = None,
  logUrl: Option[String]         = None,
  state: DeploymentStatusState
)

object CreateDeploymentStatusInput {

  implicit val encoder: ArgEncoder[CreateDeploymentStatusInput] = new ArgEncoder[CreateDeploymentStatusInput] {

    override def encode(value: CreateDeploymentStatusInput): __Value =
      __ObjectValue(
        List(
          "autoInactive"     -> value.autoInactive.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "deploymentId"     -> implicitly[ArgEncoder[String]].encode(value.deploymentId),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "environment"      -> value.environment.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "environmentUrl"   -> value.environmentUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "logUrl"           -> value.logUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "state"            -> implicitly[ArgEncoder[DeploymentStatusState]].encode(value.state)
        )
      )
  }
}

