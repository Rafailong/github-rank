package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RefUpdateRule {

  /** Can this branch be deleted.
    */
  def allowsDeletions: SelectionBuilder[RefUpdateRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("allowsDeletions", Scalar())

  /** Are force pushes allowed on this branch.
    */
  def allowsForcePushes: SelectionBuilder[RefUpdateRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("allowsForcePushes", Scalar())

  /** Identifies the protection rule pattern.
    */
  def pattern: SelectionBuilder[RefUpdateRule, String] = _root_.caliban.client.SelectionBuilder.Field("pattern", Scalar())

  /** Number of approving reviews required to update matching branches.
    */
  def requiredApprovingReviewCount: SelectionBuilder[RefUpdateRule, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("requiredApprovingReviewCount", OptionOf(Scalar()))

  /** List of required status check contexts that must pass for commits to be accepted to matching branches.
    */
  def requiredStatusCheckContexts: SelectionBuilder[RefUpdateRule, Option[List[Option[String]]]] =
    _root_.caliban.client.SelectionBuilder.Field("requiredStatusCheckContexts", OptionOf(ListOf(OptionOf(Scalar()))))

  /** Are reviews from code owners required to update matching branches.
    */
  def requiresCodeOwnerReviews: SelectionBuilder[RefUpdateRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresCodeOwnerReviews", Scalar())

  /** Are conversations required to be resolved before merging.
    */
  def requiresConversationResolution: SelectionBuilder[RefUpdateRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresConversationResolution", Scalar())

  /** Are merge commits prohibited from being pushed to this branch.
    */
  def requiresLinearHistory: SelectionBuilder[RefUpdateRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("requiresLinearHistory", Scalar())

  /** Are commits required to be signed.
    */
  def requiresSignatures: SelectionBuilder[RefUpdateRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("requiresSignatures", Scalar())

  /** Is the viewer allowed to dismiss reviews.
    */
  def viewerAllowedToDismissReviews: SelectionBuilder[RefUpdateRule, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerAllowedToDismissReviews", Scalar())

  /** Can the viewer push to the branch
    */
  def viewerCanPush: SelectionBuilder[RefUpdateRule, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanPush", Scalar())
}

