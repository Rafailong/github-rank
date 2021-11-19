package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeploymentProtectionRule {

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[DeploymentProtectionRule, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The teams or users that can review the deployment
    */
  def reviewers[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentReviewerConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DeploymentProtectionRule, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reviewers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The timeout in minutes for this protection rule.
    */
  def timeout: SelectionBuilder[DeploymentProtectionRule, Int] = _root_.caliban.client.SelectionBuilder.Field("timeout", Scalar())

  /** The type of protection rule.
    */
  def `type`: SelectionBuilder[DeploymentProtectionRule, DeploymentProtectionRuleType] =
    _root_.caliban.client.SelectionBuilder.Field("type", Scalar())
}

