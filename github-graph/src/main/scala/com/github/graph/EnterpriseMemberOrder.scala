package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseMemberOrder(direction: OrderDirection, field: EnterpriseMemberOrderField)

object EnterpriseMemberOrder {

  implicit val encoder: ArgEncoder[EnterpriseMemberOrder] = new ArgEncoder[EnterpriseMemberOrder] {

    override def encode(value: EnterpriseMemberOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseMemberOrderField]].encode(value.field)
        )
      )
  }
}

