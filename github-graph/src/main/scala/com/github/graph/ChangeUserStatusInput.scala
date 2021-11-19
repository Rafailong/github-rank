package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ChangeUserStatusInput(
  clientMutationId: Option[String]     = None,
  emoji: Option[String]                = None,
  expiresAt: Option[DateTime]          = None,
  limitedAvailability: Option[Boolean] = None,
  message: Option[String]              = None,
  organizationId: Option[String]       = None
)

object ChangeUserStatusInput {

  implicit val encoder: ArgEncoder[ChangeUserStatusInput] = new ArgEncoder[ChangeUserStatusInput] {

    override def encode(value: ChangeUserStatusInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"    -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "emoji"               -> value.emoji.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expiresAt"           -> value.expiresAt.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DateTime]].encode(value)),
          "limitedAvailability" -> value.limitedAvailability.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "message"             -> value.message.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "organizationId"      -> value.organizationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

