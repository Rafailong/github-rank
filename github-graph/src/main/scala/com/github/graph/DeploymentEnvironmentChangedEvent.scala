package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentEnvironmentChangedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[DeploymentEnvironmentChangedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[DeploymentEnvironmentChangedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The deployment status that updated the deployment environment.
    */
  def deploymentStatus[A](innerSelection: SelectionBuilder[DeploymentStatus, A]): SelectionBuilder[DeploymentEnvironmentChangedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("deploymentStatus", Obj(innerSelection))
  def id: SelectionBuilder[DeploymentEnvironmentChangedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[DeploymentEnvironmentChangedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

