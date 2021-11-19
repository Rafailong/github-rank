package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SubscribedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[SubscribedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[SubscribedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[SubscribedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Object referenced by event.
    */
  def subscribable[A](
    onCommit: Option[SelectionBuilder[Commit, A]]                 = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]         = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                   = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]       = None,
    onRepository: Option[SelectionBuilder[Repository, A]]         = None,
    onTeam: Option[SelectionBuilder[Team, A]]                     = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]] = None
  ): SelectionBuilder[SubscribedEvent, A] = _root_.caliban.client.SelectionBuilder.Field(
    "subscribable",
    ChoiceOf(
      Map(
        "Commit"         -> onCommit,
        "Discussion"     -> onDiscussion,
        "Issue"          -> onIssue,
        "PullRequest"    -> onPullRequest,
        "Repository"     -> onRepository,
        "Team"           -> onTeam,
        "TeamDiscussion" -> onTeamDiscussion
      ).collect { case (k, Some(v)) => k -> Obj(v) }
    )
  )
}

