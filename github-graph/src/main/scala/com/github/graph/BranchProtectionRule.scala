package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object BranchProtectionRule {

  /** Can this branch be deleted.
    */
  def allowsDeletions: SelectionBuilder[BranchProtectionRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("allowsDeletions", Scalar())

  /** Are force pushes allowed on this branch.
    */
  def allowsForcePushes: SelectionBuilder[BranchProtectionRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("allowsForcePushes", Scalar())

  /** A list of conflicts matching branches protection rule and other branch protection rules
    */
  def branchProtectionRuleConflicts[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None
  )(innerSelection: SelectionBuilder[BranchProtectionRuleConflictConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[BranchProtectionRule, A] = _root_.caliban.client.SelectionBuilder.Field(
    "branchProtectionRuleConflicts",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The actor who created this branch protection rule.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[BranchProtectionRule, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "creator",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[BranchProtectionRule, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** Will new commits pushed to matching branches dismiss pull request review approvals.
    */
  def dismissesStaleReviews: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("dismissesStaleReviews", Scalar())
  def id: SelectionBuilder[BranchProtectionRule, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Can admins overwrite branch protection.
    */
  def isAdminEnforced: SelectionBuilder[BranchProtectionRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isAdminEnforced", Scalar())

  /** Repository refs that are protected by this rule
    */
  def matchingRefs[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    query: Option[String]  = None
  )(innerSelection: SelectionBuilder[RefConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]]
  ): SelectionBuilder[BranchProtectionRule, A] = _root_.caliban.client.SelectionBuilder.Field(
    "matchingRefs",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("query", query, "String")(encoder4)
    )
  )

  /** Identifies the protection rule pattern.
    */
  def pattern: SelectionBuilder[BranchProtectionRule, String] = _root_.caliban.client.SelectionBuilder.Field("pattern", Scalar())

  /** A list push allowances for this branch protection rule.
    */
  def pushAllowances[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PushAllowanceConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[BranchProtectionRule, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pushAllowances",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The repository associated with this branch protection rule.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[BranchProtectionRule, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))

  /** Number of approving reviews required to update matching branches.
    */
  def requiredApprovingReviewCount: SelectionBuilder[BranchProtectionRule, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("requiredApprovingReviewCount", OptionOf(Scalar()))

  /** List of required status check contexts that must pass for commits to be accepted to matching branches.
    */
  def requiredStatusCheckContexts: SelectionBuilder[BranchProtectionRule, Option[List[Option[String]]]] =
    _root_.caliban.client.SelectionBuilder.Field("requiredStatusCheckContexts", OptionOf(ListOf(OptionOf(Scalar()))))

  /** List of required status checks that must pass for commits to be accepted to matching branches.
    */
  def requiredStatusChecks[A](
    innerSelection: SelectionBuilder[RequiredStatusCheckDescription, A]
  ): SelectionBuilder[BranchProtectionRule, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("requiredStatusChecks", OptionOf(ListOf(Obj(innerSelection))))

  /** Are approving reviews required to update matching branches.
    */
  def requiresApprovingReviews: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresApprovingReviews", Scalar())

  /** Are reviews from code owners required to update matching branches.
    */
  def requiresCodeOwnerReviews: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresCodeOwnerReviews", Scalar())

  /** Are commits required to be signed.
    */
  def requiresCommitSignatures: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresCommitSignatures", Scalar())

  /** Are conversations required to be resolved before merging.
    */
  def requiresConversationResolution: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresConversationResolution", Scalar())

  /** Are merge commits prohibited from being pushed to this branch.
    */
  def requiresLinearHistory: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresLinearHistory", Scalar())

  /** Are status checks required to update matching branches.
    */
  def requiresStatusChecks: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresStatusChecks", Scalar())

  /** Are branches required to be up to date before merging.
    */
  def requiresStrictStatusChecks: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresStrictStatusChecks", Scalar())

  /** Is pushing to matching branches restricted.
    */
  def restrictsPushes: SelectionBuilder[BranchProtectionRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("restrictsPushes", Scalar())

  /** Is dismissal of pull request reviews restricted.
    */
  def restrictsReviewDismissals: SelectionBuilder[BranchProtectionRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("restrictsReviewDismissals", Scalar())

  /** A list review dismissal allowances for this branch protection rule.
    */
  def reviewDismissalAllowances[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ReviewDismissalAllowanceConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[BranchProtectionRule, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reviewDismissalAllowances",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
}

