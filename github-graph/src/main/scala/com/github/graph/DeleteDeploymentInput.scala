package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteDeploymentInput(clientMutationId: Option[String] = None, id: String)

object DeleteDeploymentInput {

  implicit val encoder: ArgEncoder[DeleteDeploymentInput] = new ArgEncoder[DeleteDeploymentInput] {

    override def encode(value: DeleteDeploymentInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id)
        )
      )
  }
}

