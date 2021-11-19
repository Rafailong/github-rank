package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveStarInput(clientMutationId: Option[String] = None, starrableId: String)

object RemoveStarInput {

  implicit val encoder: ArgEncoder[RemoveStarInput] = new ArgEncoder[RemoveStarInput] {

    override def encode(value: RemoveStarInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "starrableId"      -> implicitly[ArgEncoder[String]].encode(value.starrableId)
        )
      )
  }
}

