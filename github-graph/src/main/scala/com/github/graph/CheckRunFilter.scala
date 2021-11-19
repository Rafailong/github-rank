package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckRunFilter(
  appId: Option[Int]               = None,
  checkName: Option[String]        = None,
  checkType: Option[CheckRunType]  = None,
  status: Option[CheckStatusState] = None
)

object CheckRunFilter {

  implicit val encoder: ArgEncoder[CheckRunFilter] = new ArgEncoder[CheckRunFilter] {

    override def encode(value: CheckRunFilter): __Value =
      __ObjectValue(
        List(
          "appId"     -> value.appId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "checkName" -> value.checkName.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "checkType" -> value.checkType.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[CheckRunType]].encode(value)),
          "status"    -> value.status.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[CheckStatusState]].encode(value))
        )
      )
  }
}

