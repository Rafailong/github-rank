package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ApproveVerifiableDomainInput(clientMutationId: Option[String] = None, id: String)

object ApproveVerifiableDomainInput {

  implicit val encoder: ArgEncoder[ApproveVerifiableDomainInput] = new ArgEncoder[ApproveVerifiableDomainInput] {

    override def encode(value: ApproveVerifiableDomainInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

