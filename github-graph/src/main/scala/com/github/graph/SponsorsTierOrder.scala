package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorsTierOrder(direction: OrderDirection, field: SponsorsTierOrderField)

object SponsorsTierOrder {

  implicit val encoder: ArgEncoder[SponsorsTierOrder] = new ArgEncoder[SponsorsTierOrder] {

    override def encode(value: SponsorsTierOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorsTierOrderField]].encode(value.field)
        )
      )
  }
}

