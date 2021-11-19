package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseServerUserAccountOrder(direction: OrderDirection, field: EnterpriseServerUserAccountOrderField)

object EnterpriseServerUserAccountOrder {

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountOrder] = new ArgEncoder[EnterpriseServerUserAccountOrder] {

    override def encode(value: EnterpriseServerUserAccountOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseServerUserAccountOrderField]].encode(value.field)
        )
      )
  }
}

