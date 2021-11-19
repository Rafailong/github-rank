package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DiscussionOrder(direction: OrderDirection, field: DiscussionOrderField)

object DiscussionOrder {

  implicit val encoder: ArgEncoder[DiscussionOrder] = new ArgEncoder[DiscussionOrder] {

    override def encode(value: DiscussionOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[DiscussionOrderField]].encode(value.field)
        )
      )
  }
}

