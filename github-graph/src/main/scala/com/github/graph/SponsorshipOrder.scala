package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorshipOrder(direction: OrderDirection, field: SponsorshipOrderField)

object SponsorshipOrder {

  implicit val encoder: ArgEncoder[SponsorshipOrder] = new ArgEncoder[SponsorshipOrder] {

    override def encode(value: SponsorshipOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorshipOrderField]].encode(value.field)
        )
      )
  }
}

