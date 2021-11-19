package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class IpAllowListEntryOrder(direction: OrderDirection, field: IpAllowListEntryOrderField)

object IpAllowListEntryOrder {

  implicit val encoder: ArgEncoder[IpAllowListEntryOrder] = new ArgEncoder[IpAllowListEntryOrder] {

    override def encode(value: IpAllowListEntryOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[IpAllowListEntryOrderField]].encode(value.field)
        )
      )
  }
}

