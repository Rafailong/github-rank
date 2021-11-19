package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnlockLockableInput(clientMutationId: Option[String] = None, lockableId: String)

object UnlockLockableInput {

  implicit val encoder: ArgEncoder[UnlockLockableInput] = new ArgEncoder[UnlockLockableInput] {

    override def encode(value: UnlockLockableInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "lockableId"       -> implicitly[ArgEncoder[String]].encode(value.lockableId)
        )
      )
  }
}

