package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseAdministratorInvitationOrder(direction: OrderDirection, field: EnterpriseAdministratorInvitationOrderField)

object EnterpriseAdministratorInvitationOrder {

  implicit val encoder: ArgEncoder[EnterpriseAdministratorInvitationOrder] = new ArgEncoder[EnterpriseAdministratorInvitationOrder] {

    override def encode(value: EnterpriseAdministratorInvitationOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseAdministratorInvitationOrderField]].encode(value.field)
        )
      )
  }
}

