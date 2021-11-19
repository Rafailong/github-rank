package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveEnterpriseOrganizationInput(clientMutationId: Option[String] = None, enterpriseId: String, organizationId: String)

object RemoveEnterpriseOrganizationInput {

  implicit val encoder: ArgEncoder[RemoveEnterpriseOrganizationInput] = new ArgEncoder[RemoveEnterpriseOrganizationInput] {

    override def encode(value: RemoveEnterpriseOrganizationInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "organizationId"   -> implicitly[ArgEncoder[String]].encode(value.organizationId)
        )
      )
  }
}

