package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentRequest {

  /** Whether or not the current user can approve the deployment
    */
  def currentUserCanApprove: SelectionBuilder[DeploymentRequest, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("currentUserCanApprove", Scalar())

  /** The target environment of the deployment
    */
  def environment[A](innerSelection: SelectionBuilder[Environment, A]): SelectionBuilder[DeploymentRequest, A] =
    _root_.caliban.client.SelectionBuilder.Field("environment", Obj(innerSelection))

  /** The teams or users that can review the deployment
    */
  def reviewers[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentReviewerConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DeploymentRequest, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reviewers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The wait timer in minutes configured in the environment
    */
  def waitTimer: SelectionBuilder[DeploymentRequest, Int] = _root_.caliban.client.SelectionBuilder.Field("waitTimer", Scalar())

  /** The wait timer in minutes configured in the environment
    */
  def waitTimerStartedAt: SelectionBuilder[DeploymentRequest, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("waitTimerStartedAt", OptionOf(Scalar()))
}

