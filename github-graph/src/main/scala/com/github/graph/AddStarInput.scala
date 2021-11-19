package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddStarInput(clientMutationId: Option[String] = None, starrableId: String)

object AddStarInput {

  implicit val encoder: ArgEncoder[AddStarInput] = new ArgEncoder[AddStarInput] {

    override def encode(value: AddStarInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "starrableId"      -> implicitly[ArgEncoder[String]].encode(value.starrableId)
        )
      )
  }
}

