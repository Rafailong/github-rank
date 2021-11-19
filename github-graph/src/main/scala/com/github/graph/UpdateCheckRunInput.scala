package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateCheckRunInput(
  actions: Option[List[CheckRunAction]] = None,
  checkRunId: String,
  clientMutationId: Option[String]         = None,
  completedAt: Option[DateTime]            = None,
  conclusion: Option[CheckConclusionState] = None,
  detailsUrl: Option[URI]                  = None,
  externalId: Option[String]               = None,
  name: Option[String]                     = None,
  output: Option[CheckRunOutput]           = None,
  repositoryId: String,
  startedAt: Option[DateTime]                 = None,
  status: Option[RequestableCheckStatusState] = None
)

object UpdateCheckRunInput {

  implicit val encoder: ArgEncoder[UpdateCheckRunInput] = new ArgEncoder[UpdateCheckRunInput] {

    override def encode(value: UpdateCheckRunInput): __Value =
      __ObjectValue(
        List(
          "actions" -> value.actions.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[CheckRunAction]].encode(value)))
          ),
          "checkRunId"       -> implicitly[ArgEncoder[String]].encode(value.checkRunId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "completedAt"      -> value.completedAt.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DateTime]].encode(value)),
          "conclusion"       -> value.conclusion.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[CheckConclusionState]].encode(value)),
          "detailsUrl"       -> value.detailsUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[URI]].encode(value)),
          "externalId"       -> value.externalId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "output"           -> value.output.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[CheckRunOutput]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "startedAt"        -> value.startedAt.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DateTime]].encode(value)),
          "status"           -> value.status.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[RequestableCheckStatusState]].encode(value))
        )
      )
  }
}

