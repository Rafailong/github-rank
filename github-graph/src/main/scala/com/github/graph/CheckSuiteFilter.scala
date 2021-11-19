package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckSuiteFilter(appId: Option[Int] = None, checkName: Option[String] = None)

object CheckSuiteFilter {

  implicit val encoder: ArgEncoder[CheckSuiteFilter] = new ArgEncoder[CheckSuiteFilter] {

    override def encode(value: CheckSuiteFilter): __Value =
      __ObjectValue(
        List(
          "appId"     -> value.appId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "checkName" -> value.checkName.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

