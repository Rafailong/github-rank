package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RejectDeploymentsInput(
  clientMutationId: Option[String] = None,
  comment: Option[String]          = None,
  environmentIds: List[String]     = Nil,
  workflowRunId: String
)

object RejectDeploymentsInput {

  implicit val encoder: ArgEncoder[RejectDeploymentsInput] = new ArgEncoder[RejectDeploymentsInput] {

    override def encode(value: RejectDeploymentsInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "comment"          -> value.comment.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "environmentIds"   -> __ListValue(value.environmentIds.map(value => implicitly[ArgEncoder[String]].encode(value))),
          "workflowRunId"    -> implicitly[ArgEncoder[String]].encode(value.workflowRunId)
        )
      )
  }
}

