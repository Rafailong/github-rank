package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RenamedTitleEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[RenamedTitleEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[RenamedTitleEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the current title of the issue or pull request.
    */
  def currentTitle: SelectionBuilder[RenamedTitleEvent, String] = _root_.caliban.client.SelectionBuilder.Field("currentTitle", Scalar())
  def id: SelectionBuilder[RenamedTitleEvent, String]           = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the previous title of the issue or pull request.
    */
  def previousTitle: SelectionBuilder[RenamedTitleEvent, String] = _root_.caliban.client.SelectionBuilder.Field("previousTitle", Scalar())

  /** Subject that was renamed.
    */
  def subject[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[RenamedTitleEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("subject", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))
}

