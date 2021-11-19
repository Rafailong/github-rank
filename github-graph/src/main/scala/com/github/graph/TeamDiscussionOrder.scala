package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TeamDiscussionOrder(direction: OrderDirection, field: TeamDiscussionOrderField)

object TeamDiscussionOrder {

  implicit val encoder: ArgEncoder[TeamDiscussionOrder] = new ArgEncoder[TeamDiscussionOrder] {

    override def encode(value: TeamDiscussionOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[TeamDiscussionOrderField]].encode(value.field)
        )
      )
  }
}

