package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentStatus {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[DeploymentStatus, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the actor who triggered the deployment.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[DeploymentStatus, A] = _root_.caliban.client.SelectionBuilder.Field(
    "creator",
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

  /** Identifies the deployment associated with status.
    */
  def deployment[A](innerSelection: SelectionBuilder[Deployment, A]): SelectionBuilder[DeploymentStatus, A] =
    _root_.caliban.client.SelectionBuilder.Field("deployment", Obj(innerSelection))

  /** Identifies the description of the deployment.
    */
  def description: SelectionBuilder[DeploymentStatus, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** Identifies the environment of the deployment at the time of this deployment status
    */
  def environment: SelectionBuilder[DeploymentStatus, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("environment", OptionOf(Scalar()))

  /** Identifies the environment URL of the deployment.
    */
  def environmentUrl: SelectionBuilder[DeploymentStatus, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("environmentUrl", OptionOf(Scalar()))
  def id: SelectionBuilder[DeploymentStatus, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the log URL of the deployment.
    */
  def logUrl: SelectionBuilder[DeploymentStatus, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("logUrl", OptionOf(Scalar()))

  /** Identifies the current state of the deployment.
    */
  def state: SelectionBuilder[DeploymentStatus, DeploymentStatusState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[DeploymentStatus, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

