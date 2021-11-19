package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateSubscriptionInput(clientMutationId: Option[String] = None, state: SubscriptionState, subscribableId: String)

object UpdateSubscriptionInput {

  implicit val encoder: ArgEncoder[UpdateSubscriptionInput] = new ArgEncoder[UpdateSubscriptionInput] {

    override def encode(value: UpdateSubscriptionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "state"            -> implicitly[ArgEncoder[SubscriptionState]].encode(value.state),
          "subscribableId"   -> implicitly[ArgEncoder[String]].encode(value.subscribableId)
        )
      )
  }
}

