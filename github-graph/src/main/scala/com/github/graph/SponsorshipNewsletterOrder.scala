package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SponsorshipNewsletterOrder(direction: OrderDirection, field: SponsorshipNewsletterOrderField)

object SponsorshipNewsletterOrder {

  implicit val encoder: ArgEncoder[SponsorshipNewsletterOrder] = new ArgEncoder[SponsorshipNewsletterOrder] {

    override def encode(value: SponsorshipNewsletterOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[SponsorshipNewsletterOrderField]].encode(value.field)
        )
      )
  }
}

