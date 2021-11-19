package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckSuiteAutoTriggerPreference(appId: String, setting: Boolean)

object CheckSuiteAutoTriggerPreference {

  implicit val encoder: ArgEncoder[CheckSuiteAutoTriggerPreference] = new ArgEncoder[CheckSuiteAutoTriggerPreference] {

    override def encode(value: CheckSuiteAutoTriggerPreference): __Value =
      __ObjectValue(
        List("appId" -> implicitly[ArgEncoder[String]].encode(value.appId), "setting" -> implicitly[ArgEncoder[Boolean]].encode(value.setting))
      )
  }
}

