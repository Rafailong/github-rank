package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class MergeBranchInput(
  authorEmail: Option[String] = None,
  base: String,
  clientMutationId: Option[String] = None,
  commitMessage: Option[String]    = None,
  head: String,
  repositoryId: String
)

object MergeBranchInput {

  implicit val encoder: ArgEncoder[MergeBranchInput] = new ArgEncoder[MergeBranchInput] {

    override def encode(value: MergeBranchInput): __Value =
      __ObjectValue(
        List(
          "authorEmail"      -> value.authorEmail.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "base"             -> implicitly[ArgEncoder[String]].encode(value.base),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitMessage"    -> value.commitMessage.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "head"             -> implicitly[ArgEncoder[String]].encode(value.head),
          "repositoryId"     -> implicitly[ArgEncoder[String]].encode(value.repositoryId)
        )
      )
  }
}

