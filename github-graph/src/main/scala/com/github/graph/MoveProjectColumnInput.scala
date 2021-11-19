package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MoveProjectColumnInput(afterColumnId: Option[String] = None, clientMutationId: Option[String] = None, columnId: String)

object MoveProjectColumnInput {

  implicit val encoder: ArgEncoder[MoveProjectColumnInput] = new ArgEncoder[MoveProjectColumnInput] {

    override def encode(value: MoveProjectColumnInput): __Value =
      __ObjectValue(
        List(
          "afterColumnId"    -> value.afterColumnId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "columnId"         -> implicitly[ArgEncoder[String]].encode(value.columnId)
        )
      )
  }
}

