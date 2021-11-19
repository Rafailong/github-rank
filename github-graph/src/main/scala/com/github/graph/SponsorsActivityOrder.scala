package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorsActivityOrder(direction: OrderDirection, field: SponsorsActivityOrderField)

object SponsorsActivityOrder {

  implicit val encoder: ArgEncoder[SponsorsActivityOrder] = new ArgEncoder[SponsorsActivityOrder] {

    override def encode(value: SponsorsActivityOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorsActivityOrderField]].encode(value.field)
        )
      )
  }
}

