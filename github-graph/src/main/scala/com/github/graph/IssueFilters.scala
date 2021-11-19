package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class IssueFilters(
  assignee: Option[String]          = None,
  createdBy: Option[String]         = None,
  labels: Option[List[String]]      = None,
  mentioned: Option[String]         = None,
  milestone: Option[String]         = None,
  since: Option[DateTime]           = None,
  states: Option[List[IssueState]]  = None,
  viewerSubscribed: Option[Boolean] = None
)

object IssueFilters {

  implicit val encoder: ArgEncoder[IssueFilters] = new ArgEncoder[IssueFilters] {

    override def encode(value: IssueFilters): __Value =
      __ObjectValue(
        List(
          "assignee"  -> value.assignee.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "createdBy" -> value.createdBy.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "labels"    -> value.labels.fold(__NullValue: __Value)(value => __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))),
          "mentioned" -> value.mentioned.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "milestone" -> value.milestone.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "since"     -> value.since.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[DateTime]].encode(value)),
          "states" -> value.states.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[IssueState]].encode(value)))
          ),
          "viewerSubscribed" -> value.viewerSubscribed.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value))
        )
      )
  }
}

