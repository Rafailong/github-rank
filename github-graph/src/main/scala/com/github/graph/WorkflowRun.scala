package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object WorkflowRun {

  /** The check suite this workflow run belongs to.
    */
  def checkSuite[A](innerSelection: SelectionBuilder[CheckSuite, A]): SelectionBuilder[WorkflowRun, A] =
    _root_.caliban.client.SelectionBuilder.Field("checkSuite", Obj(innerSelection))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[WorkflowRun, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[WorkflowRun, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The log of deployment reviews
    */
  def deploymentReviews[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentReviewConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[WorkflowRun, A] = _root_.caliban.client.SelectionBuilder.Field(
    "deploymentReviews",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
  def id: SelectionBuilder[WorkflowRun, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The pending deployment requests of all check runs in this workflow run
    */
  def pendingDeploymentRequests[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentRequestConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[WorkflowRun, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingDeploymentRequests",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The HTTP path for this workflow run
    */
  def resourcePath: SelectionBuilder[WorkflowRun, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** A number that uniquely identifies this workflow run in its parent workflow.
    */
  def runNumber: SelectionBuilder[WorkflowRun, Int] = _root_.caliban.client.SelectionBuilder.Field("runNumber", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[WorkflowRun, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this workflow run
    */
  def url: SelectionBuilder[WorkflowRun, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The workflow executed in this workflow run.
    */
  def workflow[A](innerSelection: SelectionBuilder[Workflow, A]): SelectionBuilder[WorkflowRun, A] =
    _root_.caliban.client.SelectionBuilder.Field("workflow", Obj(innerSelection))
}

