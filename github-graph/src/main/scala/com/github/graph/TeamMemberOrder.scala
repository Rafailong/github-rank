package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TeamMemberOrder(direction: OrderDirection, field: TeamMemberOrderField)

object TeamMemberOrder {

  implicit val encoder: ArgEncoder[TeamMemberOrder] = new ArgEncoder[TeamMemberOrder] {

    override def encode(value: TeamMemberOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[TeamMemberOrderField]].encode(value.field)
        )
      )
  }
}

