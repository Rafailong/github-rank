package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeleteBranchProtectionRuleInput(branchProtectionRuleId: String, clientMutationId: Option[String] = None)

object DeleteBranchProtectionRuleInput {

  implicit val encoder: ArgEncoder[DeleteBranchProtectionRuleInput] = new ArgEncoder[DeleteBranchProtectionRuleInput] {

    override def encode(value: DeleteBranchProtectionRuleInput): __Value =
      __ObjectValue(
        List(
          "branchProtectionRuleId" -> implicitly[ArgEncoder[String]].encode(value.branchProtectionRuleId),
          "clientMutationId"       -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

