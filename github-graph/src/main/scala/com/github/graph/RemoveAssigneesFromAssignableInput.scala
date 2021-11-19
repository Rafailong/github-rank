package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RemoveAssigneesFromAssignableInput(assignableId: String, assigneeIds: List[String] = Nil, clientMutationId: Option[String] = None)

object RemoveAssigneesFromAssignableInput {

  implicit val encoder: ArgEncoder[RemoveAssigneesFromAssignableInput] = new ArgEncoder[RemoveAssigneesFromAssignableInput] {

    override def encode(value: RemoveAssigneesFromAssignableInput): __Value =
      __ObjectValue(
        List(
          "assignableId"     -> implicitly[ArgEncoder[String]].encode(value.assignableId),
          "assigneeIds"      -> __ListValue(value.assigneeIds.map(value => implicitly[ArgEncoder[String]].encode(value))),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

