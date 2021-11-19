package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class IssueOrder(direction: OrderDirection, field: IssueOrderField)

object IssueOrder {

  implicit val encoder: ArgEncoder[IssueOrder] = new ArgEncoder[IssueOrder] {

    override def encode(value: IssueOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[IssueOrderField]].encode(value.field)
        )
      )
  }
}

