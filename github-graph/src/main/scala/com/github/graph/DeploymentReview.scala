package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentReview {

  /** The comment the user left.
    */
  def comment: SelectionBuilder[DeploymentReview, String] = _root_.caliban.client.SelectionBuilder.Field("comment", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[DeploymentReview, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The environments approved or rejected
    */
  def environments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[EnvironmentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DeploymentReview, A] = _root_.caliban.client.SelectionBuilder.Field(
    "environments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
  def id: SelectionBuilder[DeploymentReview, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The decision of the user.
    */
  def state: SelectionBuilder[DeploymentReview, DeploymentReviewState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** The user that reviewed the deployment.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[DeploymentReview, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

