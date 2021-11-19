package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveEnterpriseIdentityProviderInput(clientMutationId: Option[String] = None, enterpriseId: String)

object RemoveEnterpriseIdentityProviderInput {

  implicit val encoder: ArgEncoder[RemoveEnterpriseIdentityProviderInput] = new ArgEncoder[RemoveEnterpriseIdentityProviderInput] {

    override def encode(value: RemoveEnterpriseIdentityProviderInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId)
        )
      )
  }
}

