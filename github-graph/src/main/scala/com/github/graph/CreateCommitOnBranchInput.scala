package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateCommitOnBranchInput(
  branch: CommittableBranch,
  clientMutationId: Option[String] = None,
  expectedHeadOid: GitObjectID,
  fileChanges: Option[FileChanges] = None,
  message: CommitMessage
)

object CreateCommitOnBranchInput {

  implicit val encoder: ArgEncoder[CreateCommitOnBranchInput] = new ArgEncoder[CreateCommitOnBranchInput] {

    override def encode(value: CreateCommitOnBranchInput): __Value =
      __ObjectValue(
        List(
          "branch"           -> implicitly[ArgEncoder[CommittableBranch]].encode(value.branch),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "expectedHeadOid"  -> implicitly[ArgEncoder[GitObjectID]].encode(value.expectedHeadOid),
          "fileChanges"      -> value.fileChanges.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[FileChanges]].encode(value)),
          "message"          -> implicitly[ArgEncoder[CommitMessage]].encode(value.message)
        )
      )
  }
}

