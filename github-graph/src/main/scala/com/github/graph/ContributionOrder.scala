package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ContributionOrder(direction: OrderDirection)

object ContributionOrder {

  implicit val encoder: ArgEncoder[ContributionOrder] = new ArgEncoder[ContributionOrder] {

    override def encode(value: ContributionOrder): __Value =
      __ObjectValue(List("direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction)))
  }
}

