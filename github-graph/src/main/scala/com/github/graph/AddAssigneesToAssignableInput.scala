package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class AddAssigneesToAssignableInput(assignableId: String, assigneeIds: List[String] = Nil, clientMutationId: Option[String] = None)

object AddAssigneesToAssignableInput {

  implicit val encoder: ArgEncoder[AddAssigneesToAssignableInput] = new ArgEncoder[AddAssigneesToAssignableInput] {

    override def encode(value: AddAssigneesToAssignableInput): __Value =
      __ObjectValue(
        List(
          "assignableId"     -> implicitly[ArgEncoder[String]].encode(value.assignableId),
          "assigneeIds"      -> __ListValue(value.assigneeIds.map(value => implicitly[ArgEncoder[String]].encode(value))),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

