package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SetOrganizationInteractionLimitInput(
  clientMutationId: Option[String]                 = None,
  expiry: Option[RepositoryInteractionLimitExpiry] = None,
  limit: RepositoryInteractionLimit,
  organizationId: String
)

object SetOrganizationInteractionLimitInput {

  implicit val encoder: ArgEncoder[SetOrganizationInteractionLimitInput] = new ArgEncoder[SetOrganizationInteractionLimitInput] {

    override def encode(value: SetOrganizationInteractionLimitInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expiry"           -> value.expiry.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[RepositoryInteractionLimitExpiry]].encode(value)),
          "limit"            -> implicitly[ArgEncoder[RepositoryInteractionLimit]].encode(value.limit),
          "organizationId"   -> implicitly[ArgEncoder[String]].encode(value.organizationId)
        )
      )
  }
}

