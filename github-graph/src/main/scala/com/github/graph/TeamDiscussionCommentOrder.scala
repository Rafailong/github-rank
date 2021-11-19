package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class TeamDiscussionCommentOrder(direction: OrderDirection, field: TeamDiscussionCommentOrderField)

object TeamDiscussionCommentOrder {

  implicit val encoder: ArgEncoder[TeamDiscussionCommentOrder] = new ArgEncoder[TeamDiscussionCommentOrder] {

    override def encode(value: TeamDiscussionCommentOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[TeamDiscussionCommentOrderField]].encode(value.field)
        )
      )
  }
}

