package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateIpAllowListEntryInput(
  allowListValue: String,
  clientMutationId: Option[String] = None,
  ipAllowListEntryId: String,
  isActive: Boolean,
  name: Option[String] = None
)

object UpdateIpAllowListEntryInput {

  implicit val encoder: ArgEncoder[UpdateIpAllowListEntryInput] = new ArgEncoder[UpdateIpAllowListEntryInput] {

    override def encode(value: UpdateIpAllowListEntryInput): __Value =
      __ObjectValue(
        List(
          "allowListValue"     -> implicitly[ArgEncoder[String]].encode(value.allowListValue),
          "clientMutationId"   -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "ipAllowListEntryId" -> implicitly[ArgEncoder[String]].encode(value.ipAllowListEntryId),
          "isActive"           -> implicitly[ArgEncoder[Boolean]].encode(value.isActive),
          "name"               -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

