package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateDeploymentInput(
  autoMerge: Option[Boolean]       = None,
  clientMutationId: Option[String] = None,
  description: Option[String]      = None,
  environment: Option[String]      = None,
  payload: Option[String]          = None,
  refId: String,
  repositoryId: String,
  requiredContexts: Option[List[String]] = None,
  task: Option[String]                   = None
)

object CreateDeploymentInput {

  implicit val encoder: ArgEncoder[CreateDeploymentInput] = new ArgEncoder[CreateDeploymentInput] {

    override def encode(value: CreateDeploymentInput): __Value =
      __ObjectValue(
        List(
          "autoMerge"        -> value.autoMerge.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "environment"      -> value.environment.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "payload"          -> value.payload.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "refId"            -> implicitly[ArgEncoder[String]].encode(value.refId),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "requiredContexts" -> value.requiredContexts.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "task" -> value.task.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

