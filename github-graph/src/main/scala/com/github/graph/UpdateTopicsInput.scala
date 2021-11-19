package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateTopicsInput(clientMutationId: Option[String] = None, repositoryId: String, topicNames: List[String] = Nil)

object UpdateTopicsInput {

  implicit val encoder: ArgEncoder[UpdateTopicsInput] = new ArgEncoder[UpdateTopicsInput] {

    override def encode(value: UpdateTopicsInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "topicNames"       -> __ListValue(value.topicNames.map(value => implicitly[ArgEncoder[String]].encode(value)))
        )
      )
  }
}

