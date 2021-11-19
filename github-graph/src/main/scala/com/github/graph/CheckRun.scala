package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckRun {

  /** The check run's annotations
    */
  def annotations[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CheckAnnotationConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[CheckRun, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "annotations",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The check suite that this run is a part of.
    */
  def checkSuite[A](innerSelection: SelectionBuilder[CheckSuite, A]): SelectionBuilder[CheckRun, A] =
    _root_.caliban.client.SelectionBuilder.Field("checkSuite", Obj(innerSelection))

  /** Identifies the date and time when the check run was completed.
    */
  def completedAt: SelectionBuilder[CheckRun, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("completedAt", OptionOf(Scalar()))

  /** The conclusion of the check run.
    */
  def conclusion: SelectionBuilder[CheckRun, Option[CheckConclusionState]] =
    _root_.caliban.client.SelectionBuilder.Field("conclusion", OptionOf(Scalar()))

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[CheckRun, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The corresponding deployment for this job, if any
    */
  def deployment[A](innerSelection: SelectionBuilder[Deployment, A]): SelectionBuilder[CheckRun, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("deployment", OptionOf(Obj(innerSelection)))

  /** The URL from which to find full details of the check run on the integrator's site.
    */
  def detailsUrl: SelectionBuilder[CheckRun, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("detailsUrl", OptionOf(Scalar()))

  /** A reference for the check run on the integrator's system.
    */
  def externalId: SelectionBuilder[CheckRun, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("externalId", OptionOf(Scalar()))
  def id: SelectionBuilder[CheckRun, String]                 = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this is required to pass before merging for a specific pull request.
    */
  def isRequired(pullRequestId: Option[String] = None, pullRequestNumber: Option[Int] = None)(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[Int]]
  ): SelectionBuilder[CheckRun, Boolean] = _root_.caliban.client.SelectionBuilder.Field(
    "isRequired",
    Scalar(),
    arguments = List(Argument("pullRequestId", pullRequestId, "ID")(encoder0), Argument("pullRequestNumber", pullRequestNumber, "Int")(encoder1))
  )

  /** The name of the check for this check run.
    */
  def name: SelectionBuilder[CheckRun, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Information about a pending deployment, if any, in this check run
    */
  def pendingDeploymentRequest[A](innerSelection: SelectionBuilder[DeploymentRequest, A]): SelectionBuilder[CheckRun, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pendingDeploymentRequest", OptionOf(Obj(innerSelection)))

  /** The permalink to the check run summary.
    */
  def permalink: SelectionBuilder[CheckRun, URI] = _root_.caliban.client.SelectionBuilder.Field("permalink", Scalar())

  /** The repository associated with this check run.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CheckRun, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this check run.
    */
  def resourcePath: SelectionBuilder[CheckRun, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the check run was started.
    */
  def startedAt: SelectionBuilder[CheckRun, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("startedAt", OptionOf(Scalar()))

  /** The current status of the check run.
    */
  def status: SelectionBuilder[CheckRun, CheckStatusState] = _root_.caliban.client.SelectionBuilder.Field("status", Scalar())

  /** The check run's steps
    */
  def steps[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    number: Option[Int]    = None
  )(innerSelection: SelectionBuilder[CheckStepConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]]
  ): SelectionBuilder[CheckRun, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "steps",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("number", number, "Int")(encoder4)
    )
  )

  /** A string representing the check run's summary
    */
  def summary: SelectionBuilder[CheckRun, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("summary", OptionOf(Scalar()))

  /** A string representing the check run's text
    */
  def text: SelectionBuilder[CheckRun, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("text", OptionOf(Scalar()))

  /** A string representing the check run
    */
  def title: SelectionBuilder[CheckRun, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("title", OptionOf(Scalar()))

  /** The HTTP URL for this check run.
    */
  def url: SelectionBuilder[CheckRun, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

