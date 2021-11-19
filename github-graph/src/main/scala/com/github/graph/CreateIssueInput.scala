package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateIssueInput(
  assigneeIds: Option[List[String]] = None,
  body: Option[String]              = None,
  clientMutationId: Option[String]  = None,
  issueTemplate: Option[String]     = None,
  labelIds: Option[List[String]]    = None,
  milestoneId: Option[String]       = None,
  projectIds: Option[List[String]]  = None,
  repositoryId: String,
  title: String
)

object CreateIssueInput {

  implicit val encoder: ArgEncoder[CreateIssueInput] = new ArgEncoder[CreateIssueInput] {

    override def encode(value: CreateIssueInput): __Value =
      __ObjectValue(
        List(
          "assigneeIds" -> value.assigneeIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "issueTemplate"    -> value.issueTemplate.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "labelIds" -> value.labelIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "milestoneId" -> value.milestoneId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectIds" -> value.projectIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "repositoryId" -> implicitly[ArgEncoder[String]].encode(value.repositoryId),
          "title"        -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

