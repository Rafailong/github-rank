package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Label {

  /** Identifies the label color.
    */
  def color: SelectionBuilder[Label, String] = _root_.caliban.client.SelectionBuilder.Field("color", Scalar())

  /** Identifies the date and time when the label was created.
    */
  def createdAt: SelectionBuilder[Label, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("createdAt", OptionOf(Scalar()))

  /** A brief description of this label.
    */
  def description: SelectionBuilder[Label, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))
  def id: SelectionBuilder[Label, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Indicates whether or not this is a default label.
    */
  def isDefault: SelectionBuilder[Label, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDefault", Scalar())

  /** A list of issues associated with this label.
    */
  def issues[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    filterBy: Option[IssueFilters]   = None,
    first: Option[Int]               = None,
    labels: Option[List[String]]     = None,
    last: Option[Int]                = None,
    orderBy: Option[IssueOrder]      = None,
    states: Option[List[IssueState]] = None
  )(innerSelection: SelectionBuilder[IssueConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[IssueFilters]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[List[String]]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[IssueOrder]],
    encoder7: ArgEncoder[Option[List[IssueState]]]
  ): SelectionBuilder[Label, A] = _root_.caliban.client.SelectionBuilder.Field(
    "issues",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("filterBy", filterBy, "IssueFilters")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("labels", labels, "[String!]")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "IssueOrder")(encoder6),
      Argument("states", states, "[IssueState!]")(encoder7)
    )
  )

  /** Identifies the label name.
    */
  def name: SelectionBuilder[Label, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** A list of pull requests associated with this label.
    */
  def pullRequests[A](
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
  ): SelectionBuilder[Label, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequests",
    Obj(innerSelection),
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

  /** The repository associated with this label.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Label, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this label.
    */
  def resourcePath: SelectionBuilder[Label, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the label was last updated.
    */
  def updatedAt: SelectionBuilder[Label, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", OptionOf(Scalar()))

  /** The HTTP URL for this label.
    */
  def url: SelectionBuilder[Label, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

