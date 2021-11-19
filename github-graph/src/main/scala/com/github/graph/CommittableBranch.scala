package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CommittableBranch(branchName: Option[String] = None, id: Option[String] = None, repositoryNameWithOwner: Option[String] = None)

object CommittableBranch {

  implicit val encoder: ArgEncoder[CommittableBranch] = new ArgEncoder[CommittableBranch] {

    override def encode(value: CommittableBranch): __Value =
      __ObjectValue(
        List(
          "branchName"              -> value.branchName.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "id"                      -> value.id.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "repositoryNameWithOwner" -> value.repositoryNameWithOwner.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

