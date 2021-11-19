package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SetUserInteractionLimitInput(
  clientMutationId: Option[String]                 = None,
  expiry: Option[RepositoryInteractionLimitExpiry] = None,
  limit: RepositoryInteractionLimit,
  userId: String
)

object SetUserInteractionLimitInput {

  implicit val encoder: ArgEncoder[SetUserInteractionLimitInput] = new ArgEncoder[SetUserInteractionLimitInput] {

    override def encode(value: SetUserInteractionLimitInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expiry"           -> value.expiry.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[RepositoryInteractionLimitExpiry]].encode(value)),
          "limit"            -> implicitly[ArgEncoder[RepositoryInteractionLimit]].encode(value.limit),
          "userId"           -> implicitly[ArgEncoder[String]].encode(value.userId)
        )
      )
  }
}

