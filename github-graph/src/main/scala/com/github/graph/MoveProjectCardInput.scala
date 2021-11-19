package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MoveProjectCardInput(afterCardId: Option[String] = None, cardId: String, clientMutationId: Option[String] = None, columnId: String)

object MoveProjectCardInput {

  implicit val encoder: ArgEncoder[MoveProjectCardInput] = new ArgEncoder[MoveProjectCardInput] {

    override def encode(value: MoveProjectCardInput): __Value =
      __ObjectValue(
        List(
          "afterCardId"      -> value.afterCardId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "cardId"           -> implicitly[ArgEncoder[String]].encode(value.cardId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "columnId"         -> implicitly[ArgEncoder[String]].encode(value.columnId)
        )
      )
  }
}

