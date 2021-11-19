package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ProjectOrder(direction: OrderDirection, field: ProjectOrderField)

object ProjectOrder {

  implicit val encoder: ArgEncoder[ProjectOrder] = new ArgEncoder[ProjectOrder] {

    override def encode(value: ProjectOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[ProjectOrderField]].encode(value.field)
        )
      )
  }
}

