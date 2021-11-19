package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class LockLockableInput(clientMutationId: Option[String] = None, lockReason: Option[LockReason] = None, lockableId: String)

object LockLockableInput {

  implicit val encoder: ArgEncoder[LockLockableInput] = new ArgEncoder[LockLockableInput] {

    override def encode(value: LockLockableInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "lockReason"       -> value.lockReason.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[LockReason]].encode(value)),
          "lockableId"       -> implicitly[ArgEncoder[String]].encode(value.lockableId)
        )
      )
  }
}

