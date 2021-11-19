package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorableOrder(direction: OrderDirection, field: SponsorableOrderField)

object SponsorableOrder {

  implicit val encoder: ArgEncoder[SponsorableOrder] = new ArgEncoder[SponsorableOrder] {

    override def encode(value: SponsorableOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorableOrderField]].encode(value.field)
        )
      )
  }
}

