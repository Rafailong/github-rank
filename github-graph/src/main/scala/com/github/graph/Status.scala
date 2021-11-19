package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Status {

  /** A list of status contexts and check runs for this commit.
    */
  def combinedContexts[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[StatusCheckRollupContextConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Status, A] = _root_.caliban.client.SelectionBuilder.Field(
    "combinedContexts",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The commit this status is attached to.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[Status, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** Looks up an individual status context by context name.
    */
  def context[A](name: String)(
    innerSelection: SelectionBuilder[StatusContext, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Status, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("context", OptionOf(Obj(innerSelection)), arguments = List(Argument("name", name, "String!")(encoder0)))

  /** The individual status contexts for this commit.
    */
  def contexts[A](innerSelection: SelectionBuilder[StatusContext, A]): SelectionBuilder[Status, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("contexts", ListOf(Obj(innerSelection)))
  def id: SelectionBuilder[Status, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The combined commit status.
    */
  def state: SelectionBuilder[Status, StatusState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())
}

