package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class StarOrder(direction: OrderDirection, field: StarOrderField)

object StarOrder {

  implicit val encoder: ArgEncoder[StarOrder] = new ArgEncoder[StarOrder] {

    override def encode(value: StarOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[StarOrderField]].encode(value.field)
        )
      )
  }
}

