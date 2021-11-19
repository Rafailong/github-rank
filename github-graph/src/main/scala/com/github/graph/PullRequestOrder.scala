package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class PullRequestOrder(direction: OrderDirection, field: PullRequestOrderField)

object PullRequestOrder {

  implicit val encoder: ArgEncoder[PullRequestOrder] = new ArgEncoder[PullRequestOrder] {

    override def encode(value: PullRequestOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[PullRequestOrderField]].encode(value.field)
        )
      )
  }
}

