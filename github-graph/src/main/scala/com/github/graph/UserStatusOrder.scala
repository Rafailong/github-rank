package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UserStatusOrder(direction: OrderDirection, field: UserStatusOrderField)

object UserStatusOrder {

  implicit val encoder: ArgEncoder[UserStatusOrder] = new ArgEncoder[UserStatusOrder] {

    override def encode(value: UserStatusOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[UserStatusOrderField]].encode(value.field)
        )
      )
  }
}

