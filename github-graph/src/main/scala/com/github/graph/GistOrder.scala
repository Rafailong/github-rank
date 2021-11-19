package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class GistOrder(direction: OrderDirection, field: GistOrderField)

object GistOrder {

  implicit val encoder: ArgEncoder[GistOrder] = new ArgEncoder[GistOrder] {

    override def encode(value: GistOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[GistOrderField]].encode(value.field)
        )
      )
  }
}

