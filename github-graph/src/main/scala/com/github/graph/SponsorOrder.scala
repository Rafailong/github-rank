package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorOrder(direction: OrderDirection, field: SponsorOrderField)

object SponsorOrder {

  implicit val encoder: ArgEncoder[SponsorOrder] = new ArgEncoder[SponsorOrder] {

    override def encode(value: SponsorOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorOrderField]].encode(value.field)
        )
      )
  }
}

