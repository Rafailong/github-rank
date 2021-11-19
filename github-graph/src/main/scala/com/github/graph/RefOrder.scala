package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RefOrder(direction: OrderDirection, field: RefOrderField)

object RefOrder {

  implicit val encoder: ArgEncoder[RefOrder] = new ArgEncoder[RefOrder] {

    override def encode(value: RefOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[RefOrderField]].encode(value.field)
        )
      )
  }
}

