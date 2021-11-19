package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateIssueInput(
  assigneeIds: Option[List[String]] = None,
  body: Option[String]              = None,
  clientMutationId: Option[String]  = None,
  id: String,
  labelIds: Option[List[String]]   = None,
  milestoneId: Option[String]      = None,
  projectIds: Option[List[String]] = None,
  state: Option[IssueState]        = None,
  title: Option[String]            = None
)

object UpdateIssueInput {

  implicit val encoder: ArgEncoder[UpdateIssueInput] = new ArgEncoder[UpdateIssueInput] {

    override def encode(value: UpdateIssueInput): __Value =
      __ObjectValue(
        List(
          "assigneeIds" -> value.assigneeIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"               -> implicitly[ArgEncoder[String]].encode(value.id),
          "labelIds" -> value.labelIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "milestoneId" -> value.milestoneId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectIds" -> value.projectIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "state" -> value.state.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[IssueState]].encode(value)),
          "title" -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

