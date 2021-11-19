package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ResolveReviewThreadInput(clientMutationId: Option[String] = None, threadId: String)

object ResolveReviewThreadInput {

  implicit val encoder: ArgEncoder[ResolveReviewThreadInput] = new ArgEncoder[ResolveReviewThreadInput] {

    override def encode(value: ResolveReviewThreadInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "threadId"         -> implicitly[ArgEncoder[String]].encode(value.threadId)
        )
      )
  }
}

