package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class VerifiableDomainOrder(direction: OrderDirection, field: VerifiableDomainOrderField)

object VerifiableDomainOrder {

  implicit val encoder: ArgEncoder[VerifiableDomainOrder] = new ArgEncoder[VerifiableDomainOrder] {

    override def encode(value: VerifiableDomainOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[VerifiableDomainOrderField]].encode(value.field)
        )
      )
  }
}

