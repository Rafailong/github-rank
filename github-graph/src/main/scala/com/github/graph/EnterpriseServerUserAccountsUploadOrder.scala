package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnterpriseServerUserAccountsUploadOrder(direction: OrderDirection, field: EnterpriseServerUserAccountsUploadOrderField)

object EnterpriseServerUserAccountsUploadOrder {

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountsUploadOrder] = new ArgEncoder[EnterpriseServerUserAccountsUploadOrder] {

    override def encode(value: EnterpriseServerUserAccountsUploadOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[EnterpriseServerUserAccountsUploadOrderField]].encode(value.field)
        )
      )
  }
}

