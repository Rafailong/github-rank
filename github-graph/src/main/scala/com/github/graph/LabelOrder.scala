package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class LabelOrder(direction: OrderDirection, field: LabelOrderField)

object LabelOrder {

  implicit val encoder: ArgEncoder[LabelOrder] = new ArgEncoder[LabelOrder] {

    override def encode(value: LabelOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[LabelOrderField]].encode(value.field)
        )
      )
  }
}

