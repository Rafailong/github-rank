package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnfollowUserInput(clientMutationId: Option[String] = None, userId: String)

object UnfollowUserInput {

  implicit val encoder: ArgEncoder[UnfollowUserInput] = new ArgEncoder[UnfollowUserInput] {

    override def encode(value: UnfollowUserInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "userId"           -> implicitly[ArgEncoder[String]].encode(value.userId)
        )
      )
  }
}

