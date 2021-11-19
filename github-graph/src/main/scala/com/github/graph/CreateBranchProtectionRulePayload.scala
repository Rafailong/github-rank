package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateBranchProtectionRulePayload {

  /** The newly created BranchProtectionRule.
    */
  def branchProtectionRule[A](
    innerSelection: SelectionBuilder[BranchProtectionRule, A]
  ): SelectionBuilder[CreateBranchProtectionRulePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branchProtectionRule", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateBranchProtectionRulePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

