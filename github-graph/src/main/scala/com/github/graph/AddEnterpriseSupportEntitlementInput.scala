package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddEnterpriseSupportEntitlementInput(clientMutationId: Option[String] = None, enterpriseId: String, login: String)

object AddEnterpriseSupportEntitlementInput {

  implicit val encoder: ArgEncoder[AddEnterpriseSupportEntitlementInput] = new ArgEncoder[AddEnterpriseSupportEntitlementInput] {

    override def encode(value: AddEnterpriseSupportEntitlementInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "login"            -> implicitly[ArgEncoder[String]].encode(value.login)
        )
      )
  }
}

