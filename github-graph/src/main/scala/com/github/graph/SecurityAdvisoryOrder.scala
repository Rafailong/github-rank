package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SecurityAdvisoryOrder(direction: OrderDirection, field: SecurityAdvisoryOrderField)

object SecurityAdvisoryOrder {

  implicit val encoder: ArgEncoder[SecurityAdvisoryOrder] = new ArgEncoder[SecurityAdvisoryOrder] {

    override def encode(value: SecurityAdvisoryOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SecurityAdvisoryOrderField]].encode(value.field)
        )
      )
  }
}

