package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateEnterpriseOrganizationInput(
  adminLogins: List[String] = Nil,
  billingEmail: String,
  clientMutationId: Option[String] = None,
  enterpriseId: String,
  login: String,
  profileName: String
)

object CreateEnterpriseOrganizationInput {

  implicit val encoder: ArgEncoder[CreateEnterpriseOrganizationInput] = new ArgEncoder[CreateEnterpriseOrganizationInput] {

    override def encode(value: CreateEnterpriseOrganizationInput): __Value =
      __ObjectValue(
        List(
          "adminLogins"      -> __ListValue(value.adminLogins.map(value => implicitly[ArgEncoder[String]].encode(value))),
          "billingEmail"     -> implicitly[ArgEncoder[String]].encode(value.billingEmail),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "login"            -> implicitly[ArgEncoder[String]].encode(value.login),
          "profileName"      -> implicitly[ArgEncoder[String]].encode(value.profileName)
        )
      )
  }
}

