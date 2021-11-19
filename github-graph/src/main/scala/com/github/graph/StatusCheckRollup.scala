package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StatusCheckRollup {

  /** The commit the status and check runs are attached to.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[StatusCheckRollup, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** A list of status contexts and check runs for this commit.
    */
  def contexts[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[StatusCheckRollupContextConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[StatusCheckRollup, A] = _root_.caliban.client.SelectionBuilder.Field(
    "contexts",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
  def id: SelectionBuilder[StatusCheckRollup, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The combined status for the commit.
    */
  def state: SelectionBuilder[StatusCheckRollup, StatusState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())
}

