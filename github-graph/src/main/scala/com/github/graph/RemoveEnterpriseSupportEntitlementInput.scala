package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveEnterpriseSupportEntitlementInput(clientMutationId: Option[String] = None, enterpriseId: String, login: String)

object RemoveEnterpriseSupportEntitlementInput {

  implicit val encoder: ArgEncoder[RemoveEnterpriseSupportEntitlementInput] = new ArgEncoder[RemoveEnterpriseSupportEntitlementInput] {

    override def encode(value: RemoveEnterpriseSupportEntitlementInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "login"            -> implicitly[ArgEncoder[String]].encode(value.login)
        )
      )
  }
}

