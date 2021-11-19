package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class VerifyVerifiableDomainInput(clientMutationId: Option[String] = None, id: String)

object VerifyVerifiableDomainInput {

  implicit val encoder: ArgEncoder[VerifyVerifiableDomainInput] = new ArgEncoder[VerifyVerifiableDomainInput] {

    override def encode(value: VerifyVerifiableDomainInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

