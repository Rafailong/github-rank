package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Milestone {

  /** `true` if the object is closed (definition of closed may depend on type)
    */
  def closed: SelectionBuilder[Milestone, Boolean] = _root_.caliban.client.SelectionBuilder.Field("closed", Scalar())

  /** Identifies the date and time when the object was closed.
    */
  def closedAt: SelectionBuilder[Milestone, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("closedAt", OptionOf(Scalar()))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Milestone, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the actor who created the milestone.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Milestone, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "creator",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** Identifies the description of the milestone.
    */
  def description: SelectionBuilder[Milestone, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** Identifies the due date of the milestone.
    */
  def dueOn: SelectionBuilder[Milestone, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("dueOn", OptionOf(Scalar()))
  def id: SelectionBuilder[Milestone, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** A list of issues associated with the milestone.
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
  ): SelectionBuilder[Milestone, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the number of the milestone.
    */
  def number: SelectionBuilder[Milestone, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** Identifies the percentage complete for the milestone
    */
  def progressPercentage: SelectionBuilder[Milestone, Double] = _root_.caliban.client.SelectionBuilder.Field("progressPercentage", Scalar())

  /** A list of pull requests associated with the milestone.
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
  ): SelectionBuilder[Milestone, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The repository associated with this milestone.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Milestone, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this milestone
    */
  def resourcePath: SelectionBuilder[Milestone, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the state of the milestone.
    */
  def state: SelectionBuilder[Milestone, MilestoneState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** Identifies the title of the milestone.
    */
  def title: SelectionBuilder[Milestone, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Milestone, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this milestone
    */
  def url: SelectionBuilder[Milestone, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

