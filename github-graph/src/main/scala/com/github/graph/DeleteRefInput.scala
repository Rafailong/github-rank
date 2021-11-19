package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteRefInput(clientMutationId: Option[String] = None, refId: String)

object DeleteRefInput {

  implicit val encoder: ArgEncoder[DeleteRefInput] = new ArgEncoder[DeleteRefInput] {

    override def encode(value: DeleteRefInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "refId"            -> implicitly[ArgEncoder[String]].encode(value.refId)
        )
      )
  }
}

