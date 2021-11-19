package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RegenerateEnterpriseIdentityProviderRecoveryCodesInput(clientMutationId: Option[String] = None, enterpriseId: String)

object RegenerateEnterpriseIdentityProviderRecoveryCodesInput {

  implicit val encoder: ArgEncoder[RegenerateEnterpriseIdentityProviderRecoveryCodesInput] =
    new ArgEncoder[RegenerateEnterpriseIdentityProviderRecoveryCodesInput] {

      override def encode(value: RegenerateEnterpriseIdentityProviderRecoveryCodesInput): __Value =
        __ObjectValue(
          List(
            "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
            "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId)
          )
        )
    }
}

