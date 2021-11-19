package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class IssueCommentOrder(direction: OrderDirection, field: IssueCommentOrderField)

object IssueCommentOrder {

  implicit val encoder: ArgEncoder[IssueCommentOrder] = new ArgEncoder[IssueCommentOrder] {

    override def encode(value: IssueCommentOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[IssueCommentOrderField]].encode(value.field)
        )
      )
  }
}

