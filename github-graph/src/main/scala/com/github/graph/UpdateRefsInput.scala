package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateRefsInput(clientMutationId: Option[String] = None, refUpdates: List[RefUpdate] = Nil, repositoryId: String)

object UpdateRefsInput {

  implicit val encoder: ArgEncoder[UpdateRefsInput] = new ArgEncoder[UpdateRefsInput] {

    override def encode(value: UpdateRefsInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "refUpdates"       -> __ListValue(value.refUpdates.map(value => implicitly[ArgEncoder[RefUpdate]].encode(value))),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

