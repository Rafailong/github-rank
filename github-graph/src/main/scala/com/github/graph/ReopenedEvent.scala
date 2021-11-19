package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReopenedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ReopenedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Object that was reopened.
    */
  def closable[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onMilestone: Option[SelectionBuilder[Milestone, A]]     = None,
    onProject: Option[SelectionBuilder[Project, A]]         = None,
    onProjectNext: Option[SelectionBuilder[ProjectNext, A]] = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ReopenedEvent, A] = _root_.caliban.client.SelectionBuilder.Field(
    "closable",
    ChoiceOf(
      Map("Issue" -> onIssue, "Milestone" -> onMilestone, "Project" -> onProject, "ProjectNext" -> onProjectNext, "PullRequest" -> onPullRequest)
        .collect { case (k, Some(v)) => k -> Obj(v) }
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ReopenedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[ReopenedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())
}

