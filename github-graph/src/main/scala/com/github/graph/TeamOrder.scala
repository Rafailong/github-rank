package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TeamOrder(direction: OrderDirection, field: TeamOrderField)

object TeamOrder {

  implicit val encoder: ArgEncoder[TeamOrder] = new ArgEncoder[TeamOrder] {

    override def encode(value: TeamOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[TeamOrderField]].encode(value.field)
        )
      )
  }
}

