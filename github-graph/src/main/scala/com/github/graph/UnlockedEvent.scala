package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnlockedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[UnlockedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[UnlockedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[UnlockedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Object that was unlocked.
    */
  def lockable[A](
    onDiscussion: Option[SelectionBuilder[Discussion, A]]   = None,
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[UnlockedEvent, A] = _root_.caliban.client.SelectionBuilder.Field(
    "lockable",
    ChoiceOf(Map("Discussion" -> onDiscussion, "Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) => k -> Obj(v) })
  )
}

