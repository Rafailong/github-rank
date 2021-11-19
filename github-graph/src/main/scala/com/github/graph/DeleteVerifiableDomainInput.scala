package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteVerifiableDomainInput(clientMutationId: Option[String] = None, id: String)

object DeleteVerifiableDomainInput {

  implicit val encoder: ArgEncoder[DeleteVerifiableDomainInput] = new ArgEncoder[DeleteVerifiableDomainInput] {

    override def encode(value: DeleteVerifiableDomainInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

