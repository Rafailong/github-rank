package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckSuite {

  /** The GitHub App which created this check suite.
    */
  def app[A](innerSelection: SelectionBuilder[App, A]): SelectionBuilder[CheckSuite, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("app", OptionOf(Obj(innerSelection)))

  /** The name of the branch for this check suite.
    */
  def branch[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[CheckSuite, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branch", OptionOf(Obj(innerSelection)))

  /** The check runs associated with a check suite.
    */
  def checkRuns[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    filterBy: Option[CheckRunFilter] = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None
  )(innerSelection: SelectionBuilder[CheckRunConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[CheckRunFilter]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]]
  ): SelectionBuilder[CheckSuite, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "checkRuns",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("filterBy", filterBy, "CheckRunFilter")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4)
    )
  )

  /** The commit for this check suite
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[CheckSuite, A] =
    _root_.caliban.client.SelectionBuilder.Field("commit", Obj(innerSelection))

  /** The conclusion of this check suite.
    */
  def conclusion: SelectionBuilder[CheckSuite, Option[CheckConclusionState]] =
    _root_.caliban.client.SelectionBuilder.Field("conclusion", OptionOf(Scalar()))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[CheckSuite, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The user who triggered the check suite.
    */
  def creator[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[CheckSuite, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("creator", OptionOf(Obj(innerSelection)))

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[CheckSuite, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[CheckSuite, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** A list of open pull requests matching the check suite.
    */
  def matchingPullRequests[A](
    after: Option[String]                  = None,
    baseRefName: Option[String]            = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    headRefName: Option[String]            = None,
    labels: Option[List[String]]           = None,
    last: Option[Int]                      = None,
    orderBy: Option[IssueOrder]            = None,
    states: Option[List[PullRequestState]] = None
  )(innerSelection: SelectionBuilder[PullRequestConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]],
    encoder5: ArgEncoder[Option[List[String]]],
    encoder6: ArgEncoder[Option[Int]],
    encoder7: ArgEncoder[Option[IssueOrder]],
    encoder8: ArgEncoder[Option[List[PullRequestState]]]
  ): SelectionBuilder[CheckSuite, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "matchingPullRequests",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("baseRefName", baseRefName, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("headRefName", headRefName, "String")(encoder4),
      Argument("labels", labels, "[String!]")(encoder5),
      Argument("last", last, "Int")(encoder6),
      Argument("orderBy", orderBy, "IssueOrder")(encoder7),
      Argument("states", states, "[PullRequestState!]")(encoder8)
    )
  )

  /** The push that triggered this check suite.
    */
  def push[A](innerSelection: SelectionBuilder[Push, A]): SelectionBuilder[CheckSuite, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("push", OptionOf(Obj(innerSelection)))

  /** The repository associated with this check suite.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CheckSuite, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this check suite
    */
  def resourcePath: SelectionBuilder[CheckSuite, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The status of this check suite.
    */
  def status: SelectionBuilder[CheckSuite, CheckStatusState] = _root_.caliban.client.SelectionBuilder.Field("status", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[CheckSuite, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this check suite
    */
  def url: SelectionBuilder[CheckSuite, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The workflow run associated with this check suite.
    */
  def workflowRun[A](innerSelection: SelectionBuilder[WorkflowRun, A]): SelectionBuilder[CheckSuite, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("workflowRun", OptionOf(Obj(innerSelection)))
}

