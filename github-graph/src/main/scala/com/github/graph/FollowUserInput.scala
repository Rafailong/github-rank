package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class FollowUserInput(clientMutationId: Option[String] = None, userId: String)

object FollowUserInput {

  implicit val encoder: ArgEncoder[FollowUserInput] = new ArgEncoder[FollowUserInput] {

    override def encode(value: FollowUserInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "userId"           -> implicitly[ArgEncoder[String]].encode(value.userId)
        )
      )
  }
}

