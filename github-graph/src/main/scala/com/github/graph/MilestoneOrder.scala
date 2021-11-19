package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MilestoneOrder(direction: OrderDirection, field: MilestoneOrderField)

object MilestoneOrder {

  implicit val encoder: ArgEncoder[MilestoneOrder] = new ArgEncoder[MilestoneOrder] {

    override def encode(value: MilestoneOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[MilestoneOrderField]].encode(value.field)
        )
      )
  }
}

