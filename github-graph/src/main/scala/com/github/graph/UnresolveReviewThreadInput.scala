package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UnresolveReviewThreadInput(clientMutationId: Option[String] = None, threadId: String)

object UnresolveReviewThreadInput {

  implicit val encoder: ArgEncoder[UnresolveReviewThreadInput] = new ArgEncoder[UnresolveReviewThreadInput] {

    override def encode(value: UnresolveReviewThreadInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "threadId"         -> implicitly[ArgEncoder[String]].encode(value.threadId)
        )
      )
  }
}

