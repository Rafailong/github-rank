package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteProjectCardInput(cardId: String, clientMutationId: Option[String] = None)

object DeleteProjectCardInput {

  implicit val encoder: ArgEncoder[DeleteProjectCardInput] = new ArgEncoder[DeleteProjectCardInput] {

    override def encode(value: DeleteProjectCardInput): __Value =
      __ObjectValue(
        List(
          "cardId"           -> implicitly[ArgEncoder[String]].encode(value.cardId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

