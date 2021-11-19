package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddVerifiableDomainInput(clientMutationId: Option[String] = None, domain: URI, ownerId: String)

object AddVerifiableDomainInput {

  implicit val encoder: ArgEncoder[AddVerifiableDomainInput] = new ArgEncoder[AddVerifiableDomainInput] {

    override def encode(value: AddVerifiableDomainInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "domain"           -> implicitly[ArgEncoder[URI]].encode(value.domain),
          "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId)
        )
      )
  }
}

