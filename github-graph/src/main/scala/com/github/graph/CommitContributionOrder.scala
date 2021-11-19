package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CommitContributionOrder(direction: OrderDirection, field: CommitContributionOrderField)

object CommitContributionOrder {

  implicit val encoder: ArgEncoder[CommitContributionOrder] = new ArgEncoder[CommitContributionOrder] {

    override def encode(value: CommitContributionOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[CommitContributionOrderField]].encode(value.field)
        )
      )
  }
}

