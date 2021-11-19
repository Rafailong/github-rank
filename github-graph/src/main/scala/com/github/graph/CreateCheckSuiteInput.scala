package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateCheckSuiteInput(clientMutationId: Option[String] = None, headSha: GitObjectID, repositoryId: String)

object CreateCheckSuiteInput {

  implicit val encoder: ArgEncoder[CreateCheckSuiteInput] = new ArgEncoder[CreateCheckSuiteInput] {

    override def encode(value: CreateCheckSuiteInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "headSha"          -> implicitly[ArgEncoder[GitObjectID]].encode(value.headSha),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

