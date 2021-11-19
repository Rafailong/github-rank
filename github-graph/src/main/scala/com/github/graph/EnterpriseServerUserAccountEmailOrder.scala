package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseServerUserAccountEmailOrder(direction: OrderDirection, field: EnterpriseServerUserAccountEmailOrderField)

object EnterpriseServerUserAccountEmailOrder {

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountEmailOrder] = new ArgEncoder[EnterpriseServerUserAccountEmailOrder] {

    override def encode(value: EnterpriseServerUserAccountEmailOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseServerUserAccountEmailOrderField]].encode(value.field)
        )
      )
  }
}

