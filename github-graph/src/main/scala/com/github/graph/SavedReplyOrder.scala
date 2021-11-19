package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SavedReplyOrder(direction: OrderDirection, field: SavedReplyOrderField)

object SavedReplyOrder {

  implicit val encoder: ArgEncoder[SavedReplyOrder] = new ArgEncoder[SavedReplyOrder] {

    override def encode(value: SavedReplyOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SavedReplyOrderField]].encode(value.field)
        )
      )
  }
}

