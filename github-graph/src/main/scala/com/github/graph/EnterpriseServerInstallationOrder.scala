package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseServerInstallationOrder(direction: OrderDirection, field: EnterpriseServerInstallationOrderField)

object EnterpriseServerInstallationOrder {

  implicit val encoder: ArgEncoder[EnterpriseServerInstallationOrder] = new ArgEncoder[EnterpriseServerInstallationOrder] {

    override def encode(value: EnterpriseServerInstallationOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseServerInstallationOrderField]].encode(value.field)
        )
      )
  }
}

