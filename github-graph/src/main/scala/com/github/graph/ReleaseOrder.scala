package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ReleaseOrder(direction: OrderDirection, field: ReleaseOrderField)

object ReleaseOrder {

  implicit val encoder: ArgEncoder[ReleaseOrder] = new ArgEncoder[ReleaseOrder] {

    override def encode(value: ReleaseOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[ReleaseOrderField]].encode(value.field)
        )
      )
  }
}

