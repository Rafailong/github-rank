package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateTeamReviewAssignmentInput(
  algorithm: Option[TeamReviewAssignmentAlgorithm] = None,
  clientMutationId: Option[String]                 = None,
  enabled: Boolean,
  excludedTeamMemberIds: Option[List[String]] = None,
  id: String,
  notifyTeam: Option[Boolean]  = None,
  teamMemberCount: Option[Int] = None
)

object UpdateTeamReviewAssignmentInput {

  implicit val encoder: ArgEncoder[UpdateTeamReviewAssignmentInput] = new ArgEncoder[UpdateTeamReviewAssignmentInput] {

    override def encode(value: UpdateTeamReviewAssignmentInput): __Value =
      __ObjectValue(
        List(
          "algorithm"        -> value.algorithm.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[TeamReviewAssignmentAlgorithm]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enabled"          -> implicitly[ArgEncoder[Boolean]].encode(value.enabled),
          "excludedTeamMemberIds" -> value.excludedTeamMemberIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "id"              -> implicitly[ArgEncoder[String]].encode(value.id),
          "notifyTeam"      -> value.notifyTeam.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "teamMemberCount" -> value.teamMemberCount.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value))
        )
      )
  }
}

