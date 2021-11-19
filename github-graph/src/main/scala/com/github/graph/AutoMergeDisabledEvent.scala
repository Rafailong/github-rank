package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AutoMergeDisabledEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[AutoMergeDisabledEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
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

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[AutoMergeDisabledEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The user who disabled auto-merge for this Pull Request
    */
  def disabler[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[AutoMergeDisabledEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("disabler", OptionOf(Obj(innerSelection)))
  def id: SelectionBuilder[AutoMergeDisabledEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** PullRequest referenced by event
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[AutoMergeDisabledEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", OptionOf(Obj(innerSelection)))

  /** The reason auto-merge was disabled
    */
  def reason: SelectionBuilder[AutoMergeDisabledEvent, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("reason", OptionOf(Scalar()))

  /** The reason_code relating to why auto-merge was disabled
    */
  def reasonCode: SelectionBuilder[AutoMergeDisabledEvent, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("reasonCode", OptionOf(Scalar()))
}

