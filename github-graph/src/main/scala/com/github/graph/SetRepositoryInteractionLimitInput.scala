package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SetRepositoryInteractionLimitInput(
  clientMutationId: Option[String]                 = None,
  expiry: Option[RepositoryInteractionLimitExpiry] = None,
  limit: RepositoryInteractionLimit,
  repositoryId: String
)

object SetRepositoryInteractionLimitInput {

  implicit val encoder: ArgEncoder[SetRepositoryInteractionLimitInput] = new ArgEncoder[SetRepositoryInteractionLimitInput] {

    override def encode(value: SetRepositoryInteractionLimitInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expiry"           -> value.expiry.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[RepositoryInteractionLimitExpiry]].encode(value)),
          "limit"            -> implicitly[ArgEncoder[RepositoryInteractionLimit]].encode(value.limit),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

