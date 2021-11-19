package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RegenerateVerifiableDomainTokenInput(clientMutationId: Option[String] = None, id: String)

object RegenerateVerifiableDomainTokenInput {

  implicit val encoder: ArgEncoder[RegenerateVerifiableDomainTokenInput] = new ArgEncoder[RegenerateVerifiableDomainTokenInput] {

    override def encode(value: RegenerateVerifiableDomainTokenInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

