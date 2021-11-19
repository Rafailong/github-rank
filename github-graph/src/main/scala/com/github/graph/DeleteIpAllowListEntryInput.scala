package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteIpAllowListEntryInput(clientMutationId: Option[String] = None, ipAllowListEntryId: String)

object DeleteIpAllowListEntryInput {

  implicit val encoder: ArgEncoder[DeleteIpAllowListEntryInput] = new ArgEncoder[DeleteIpAllowListEntryInput] {

    override def encode(value: DeleteIpAllowListEntryInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId"   -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "ipAllowListEntryId" -> implicitly[ArgEncoder[String]].encode(value.ipAllowListEntryId)
        )
      )
  }
}

