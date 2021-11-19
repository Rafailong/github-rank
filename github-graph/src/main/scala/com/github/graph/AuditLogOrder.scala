package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AuditLogOrder(direction: Option[OrderDirection] = None, field: Option[AuditLogOrderField] = None)

object AuditLogOrder {

  implicit val encoder: ArgEncoder[AuditLogOrder] = new ArgEncoder[AuditLogOrder] {

    override def encode(value: AuditLogOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> value.direction.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[OrderDirection]].encode(value)),
          "field"     -> value.field.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[AuditLogOrderField]].encode(value))
        )
      )
  }
}

