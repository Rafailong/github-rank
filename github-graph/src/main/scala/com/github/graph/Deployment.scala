package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Deployment {

  /** Identifies the commit sha of the deployment.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[Deployment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** Identifies the oid of the deployment commit, even if the commit has been deleted.
    */
  def commitOid: SelectionBuilder[Deployment, String] = _root_.caliban.client.SelectionBuilder.Field("commitOid", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Deployment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the actor who triggered the deployment.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Deployment, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Deployment, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The deployment description.
    */
  def description: SelectionBuilder[Deployment, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The latest environment to which this deployment was made.
    */
  def environment: SelectionBuilder[Deployment, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("environment", OptionOf(Scalar()))
  def id: SelectionBuilder[Deployment, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The latest environment to which this deployment was made.
    */
  def latestEnvironment: SelectionBuilder[Deployment, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("latestEnvironment", OptionOf(Scalar()))

  /** The latest status of this deployment.
    */
  def latestStatus[A](innerSelection: SelectionBuilder[DeploymentStatus, A]): SelectionBuilder[Deployment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("latestStatus", OptionOf(Obj(innerSelection)))

  /** The original environment to which this deployment was made.
    */
  def originalEnvironment: SelectionBuilder[Deployment, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("originalEnvironment", OptionOf(Scalar()))

  /** Extra information that a deployment system might need.
    */
  def payload: SelectionBuilder[Deployment, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("payload", OptionOf(Scalar()))

  /** Identifies the Ref of the deployment, if the deployment was created by ref.
    */
  def ref[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[Deployment, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ref", OptionOf(Obj(innerSelection)))

  /** Identifies the repository associated with the deployment.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Deployment, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The current state of the deployment.
    */
  def state: SelectionBuilder[Deployment, Option[DeploymentState]] = _root_.caliban.client.SelectionBuilder.Field("state", OptionOf(Scalar()))

  /** A list of statuses associated with the deployment.
    */
  def statuses[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentStatusConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Deployment, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "statuses",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The deployment task.
    */
  def task: SelectionBuilder[Deployment, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("task", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Deployment, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

