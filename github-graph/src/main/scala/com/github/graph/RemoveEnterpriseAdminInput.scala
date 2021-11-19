package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveEnterpriseAdminInput(clientMutationId: Option[String] = None, enterpriseId: String, login: String)

object RemoveEnterpriseAdminInput {

  implicit val encoder: ArgEncoder[RemoveEnterpriseAdminInput] = new ArgEncoder[RemoveEnterpriseAdminInput] {

    override def encode(value: RemoveEnterpriseAdminInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "login"            -> implicitly[ArgEncoder[String]].encode(value.login)
        )
      )
  }
}

