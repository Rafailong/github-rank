package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateRefInput(clientMutationId: Option[String] = None, force: Option[Boolean] = None, oid: GitObjectID, refId: String)

object UpdateRefInput {

  implicit val encoder: ArgEncoder[UpdateRefInput] = new ArgEncoder[UpdateRefInput] {

    override def encode(value: UpdateRefInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "force"            -> value.force.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "oid"              -> implicitly[ArgEncoder[GitObjectID]].encode(value.oid),
          "refId"            -> implicitly[ArgEncoder[String]].encode(value.refId)
        )
      )
  }
}

