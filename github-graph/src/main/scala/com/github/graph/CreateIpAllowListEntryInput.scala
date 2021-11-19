package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateIpAllowListEntryInput(
  allowListValue: String,
  clientMutationId: Option[String] = None,
  isActive: Boolean,
  name: Option[String] = None,
  ownerId: String
)

object CreateIpAllowListEntryInput {

  implicit val encoder: ArgEncoder[CreateIpAllowListEntryInput] = new ArgEncoder[CreateIpAllowListEntryInput] {

    override def encode(value: CreateIpAllowListEntryInput): __Value =
      __ObjectValue(
        List(
          "allowListValue"   -> implicitly[ArgEncoder[String]].encode(value.allowListValue),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "isActive"         -> implicitly[ArgEncoder[Boolean]].encode(value.isActive),
          "name"             -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId)
        )
      )
  }
}

