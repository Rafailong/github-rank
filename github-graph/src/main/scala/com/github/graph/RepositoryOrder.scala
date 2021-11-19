package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RepositoryOrder(direction: OrderDirection, field: RepositoryOrderField)

object RepositoryOrder {

  implicit val encoder: ArgEncoder[RepositoryOrder] = new ArgEncoder[RepositoryOrder] {

    override def encode(value: RepositoryOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[RepositoryOrderField]].encode(value.field)
        )
      )
  }
}

