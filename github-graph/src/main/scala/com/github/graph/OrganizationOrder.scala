package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class OrganizationOrder(direction: OrderDirection, field: OrganizationOrderField)

object OrganizationOrder {

  implicit val encoder: ArgEncoder[OrganizationOrder] = new ArgEncoder[OrganizationOrder] {

    override def encode(value: OrganizationOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[OrganizationOrderField]].encode(value.field)
        )
      )
  }
}

