package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RequiredStatusCheckInput(appId: Option[String] = None, context: String)

object RequiredStatusCheckInput {

  implicit val encoder: ArgEncoder[RequiredStatusCheckInput] = new ArgEncoder[RequiredStatusCheckInput] {

    override def encode(value: RequiredStatusCheckInput): __Value =
      __ObjectValue(
        List(
          "appId"   -> value.appId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "context" -> implicitly[ArgEncoder[String]].encode(value.context)
        )
      )
  }
}

