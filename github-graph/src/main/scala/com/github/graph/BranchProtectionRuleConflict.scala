package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object BranchProtectionRuleConflict {

  /** Identifies the branch protection rule.
    */
  def branchProtectionRule[A](innerSelection: SelectionBuilder[BranchProtectionRule, A]): SelectionBuilder[BranchProtectionRuleConflict, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branchProtectionRule", OptionOf(Obj(innerSelection)))

  /** Identifies the conflicting branch protection rule.
    */
  def conflictingBranchProtectionRule[A](
    innerSelection: SelectionBuilder[BranchProtectionRule, A]
  ): SelectionBuilder[BranchProtectionRuleConflict, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("conflictingBranchProtectionRule", OptionOf(Obj(innerSelection)))

  /** Identifies the branch ref that has conflicting rules
    */
  def ref[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[BranchProtectionRuleConflict, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ref", OptionOf(Obj(innerSelection)))
}

