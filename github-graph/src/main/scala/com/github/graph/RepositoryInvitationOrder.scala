package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RepositoryInvitationOrder(direction: OrderDirection, field: RepositoryInvitationOrderField)

object RepositoryInvitationOrder {

  implicit val encoder: ArgEncoder[RepositoryInvitationOrder] = new ArgEncoder[RepositoryInvitationOrder] {

    override def encode(value: RepositoryInvitationOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[RepositoryInvitationOrderField]].encode(value.field)
        )
      )
  }
}

