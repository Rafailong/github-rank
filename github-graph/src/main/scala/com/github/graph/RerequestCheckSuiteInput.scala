package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RerequestCheckSuiteInput(checkSuiteId: String, clientMutationId: Option[String] = None, repositoryId: String)

object RerequestCheckSuiteInput {

  implicit val encoder: ArgEncoder[RerequestCheckSuiteInput] = new ArgEncoder[RerequestCheckSuiteInput] {

    override def encode(value: RerequestCheckSuiteInput): __Value =
      __ObjectValue(
        List(
          "checkSuiteId"     -> implicitly[ArgEncoder[String]].encode(value.checkSuiteId),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

