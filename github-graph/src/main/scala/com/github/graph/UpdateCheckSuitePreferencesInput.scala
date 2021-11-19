package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateCheckSuitePreferencesInput(
  autoTriggerPreferences: List[CheckSuiteAutoTriggerPreference] = Nil,
  clientMutationId: Option[String]                              = None,
  repositoryId: String
)

object UpdateCheckSuitePreferencesInput {

  implicit val encoder: ArgEncoder[UpdateCheckSuitePreferencesInput] = new ArgEncoder[UpdateCheckSuitePreferencesInput] {

    override def encode(value: UpdateCheckSuitePreferencesInput): __Value =
      __ObjectValue(
        List(
          "autoTriggerPreferences" -> __ListValue(
            value.autoTriggerPreferences.map(value => implicitly[ArgEncoder[CheckSuiteAutoTriggerPreference]].encode(value))
          ),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

