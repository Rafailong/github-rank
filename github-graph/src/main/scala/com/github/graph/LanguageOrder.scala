package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class LanguageOrder(direction: OrderDirection, field: LanguageOrderField)

object LanguageOrder {

  implicit val encoder: ArgEncoder[LanguageOrder] = new ArgEncoder[LanguageOrder] {

    override def encode(value: LanguageOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[LanguageOrderField]].encode(value.field)
        )
      )
  }
}

