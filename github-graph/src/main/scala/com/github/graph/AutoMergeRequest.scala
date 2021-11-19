package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AutoMergeRequest {

  /** The email address of the author of this auto-merge request.
    */
  def authorEmail: SelectionBuilder[AutoMergeRequest, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("authorEmail", OptionOf(Scalar()))

  /** The commit message of the auto-merge request.
    */
  def commitBody: SelectionBuilder[AutoMergeRequest, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("commitBody", OptionOf(Scalar()))

  /** The commit title of the auto-merge request.
    */
  def commitHeadline: SelectionBuilder[AutoMergeRequest, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("commitHeadline", OptionOf(Scalar()))

  /** When was this auto-merge request was enabled.
    */
  def enabledAt: SelectionBuilder[AutoMergeRequest, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("enabledAt", OptionOf(Scalar()))

  /** The actor who created the auto-merge request.
    */
  def enabledBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[AutoMergeRequest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "enabledBy",
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

  /** The merge method of the auto-merge request.
    */
  def mergeMethod: SelectionBuilder[AutoMergeRequest, PullRequestMergeMethod] = _root_.caliban.client.SelectionBuilder.Field("mergeMethod", Scalar())

  /** The pull request that this auto-merge request is set against.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[AutoMergeRequest, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

