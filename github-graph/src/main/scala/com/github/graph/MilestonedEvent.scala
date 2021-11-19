package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MilestonedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[MilestonedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[MilestonedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[MilestonedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the milestone title associated with the 'milestoned' event.
    */
  def milestoneTitle: SelectionBuilder[MilestonedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("milestoneTitle", Scalar())

  /** Object referenced by event.
    */
  def subject[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[MilestonedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("subject", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))
}

