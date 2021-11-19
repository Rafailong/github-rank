package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Environment {

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Environment, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[Environment, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The name of the environment
    */
  def name: SelectionBuilder[Environment, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The protection rules defined for this environment
    */
  def protectionRules[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeploymentProtectionRuleConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Environment, A] = _root_.caliban.client.SelectionBuilder.Field(
    "protectionRules",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
}

