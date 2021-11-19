package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TeamRepositoryOrder(direction: OrderDirection, field: TeamRepositoryOrderField)

object TeamRepositoryOrder {

  implicit val encoder: ArgEncoder[TeamRepositoryOrder] = new ArgEncoder[TeamRepositoryOrder] {

    override def encode(value: TeamRepositoryOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[TeamRepositoryOrderField]].encode(value.field)
        )
      )
  }
}

