package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdatePullRequestInput(
  assigneeIds: Option[List[String]]    = None,
  baseRefName: Option[String]          = None,
  body: Option[String]                 = None,
  clientMutationId: Option[String]     = None,
  labelIds: Option[List[String]]       = None,
  maintainerCanModify: Option[Boolean] = None,
  milestoneId: Option[String]          = None,
  projectIds: Option[List[String]]     = None,
  pullRequestId: String,
  state: Option[PullRequestUpdateState] = None,
  title: Option[String]                 = None
)

object UpdatePullRequestInput {

  implicit val encoder: ArgEncoder[UpdatePullRequestInput] = new ArgEncoder[UpdatePullRequestInput] {

    override def encode(value: UpdatePullRequestInput): __Value =
      __ObjectValue(
        List(
          "assigneeIds" -> value.assigneeIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "baseRefName"      -> value.baseRefName.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "labelIds" -> value.labelIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "maintainerCanModify" -> value.maintainerCanModify.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "milestoneId"         -> value.milestoneId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "projectIds" -> value.projectIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "pullRequestId" -> implicitly[ArgEncoder[String]].encode(value.pullRequestId),
          "state"         -> value.state.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PullRequestUpdateState]].encode(value)),
          "title"         -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

