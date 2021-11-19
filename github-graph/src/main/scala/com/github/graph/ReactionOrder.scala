package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ReactionOrder(direction: OrderDirection, field: ReactionOrderField)

object ReactionOrder {

  implicit val encoder: ArgEncoder[ReactionOrder] = new ArgEncoder[ReactionOrder] {

    override def encode(value: ReactionOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[ReactionOrderField]].encode(value.field)
        )
      )
  }
}

