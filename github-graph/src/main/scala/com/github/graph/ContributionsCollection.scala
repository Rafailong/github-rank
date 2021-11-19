package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContributionsCollection {

  /** Commit contributions made by the user, grouped by repository.
    */
  def commitContributionsByRepository[A](maxRepositories: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitContributionsByRepository, A]
  )(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[ContributionsCollection, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "commitContributionsByRepository",
    ListOf(Obj(innerSelection)),
    arguments = List(Argument("maxRepositories", maxRepositories, "Int")(encoder0))
  )

  /** A calendar of this user's contributions on GitHub.
    */
  def contributionCalendar[A](innerSelection: SelectionBuilder[ContributionCalendar, A]): SelectionBuilder[ContributionsCollection, A] =
    _root_.caliban.client.SelectionBuilder.Field("contributionCalendar", Obj(innerSelection))

  /** The years the user has been making contributions with the most recent year first.
    */
  def contributionYears: SelectionBuilder[ContributionsCollection, List[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("contributionYears", ListOf(Scalar()))

  /** Determine if this collection's time span ends in the current month.
    */
  def doesEndInCurrentMonth: SelectionBuilder[ContributionsCollection, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("doesEndInCurrentMonth", Scalar())

  /** The date of the first restricted contribution the user made in this time
    * period. Can only be non-null when the user has enabled private contribution counts.
    */
  def earliestRestrictedContributionDate: SelectionBuilder[ContributionsCollection, Option[Date]] =
    _root_.caliban.client.SelectionBuilder.Field("earliestRestrictedContributionDate", OptionOf(Scalar()))

  /** The ending date and time of this collection.
    */
  def endedAt: SelectionBuilder[ContributionsCollection, DateTime] = _root_.caliban.client.SelectionBuilder.Field("endedAt", Scalar())

  /** The first issue the user opened on GitHub. This will be null if that issue was
    * opened outside the collection's time range and ignoreTimeRange is false. If
    * the issue is not visible but the user has opted to show private contributions,
    * a RestrictedContribution will be returned.
    */
  def firstIssueContribution[A](
    onCreatedIssueContribution: SelectionBuilder[CreatedIssueContribution, A],
    onRestrictedContribution: SelectionBuilder[RestrictedContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstIssueContribution",
    OptionOf(ChoiceOf(Map("CreatedIssueContribution" -> Obj(onCreatedIssueContribution), "RestrictedContribution" -> Obj(onRestrictedContribution))))
  )

  /** The first pull request the user opened on GitHub. This will be null if that
    * pull request was opened outside the collection's time range and
    * ignoreTimeRange is not true. If the pull request is not visible but the user
    * has opted to show private contributions, a RestrictedContribution will be returned.
    */
  def firstPullRequestContribution[A](
    onCreatedPullRequestContribution: SelectionBuilder[CreatedPullRequestContribution, A],
    onRestrictedContribution: SelectionBuilder[RestrictedContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstPullRequestContribution",
    OptionOf(
      ChoiceOf(
        Map("CreatedPullRequestContribution" -> Obj(onCreatedPullRequestContribution), "RestrictedContribution" -> Obj(onRestrictedContribution))
      )
    )
  )

  /** The first repository the user created on GitHub. This will be null if that
    * first repository was created outside the collection's time range and
    * ignoreTimeRange is false. If the repository is not visible, then a
    * RestrictedContribution is returned.
    */
  def firstRepositoryContribution[A](
    onCreatedRepositoryContribution: SelectionBuilder[CreatedRepositoryContribution, A],
    onRestrictedContribution: SelectionBuilder[RestrictedContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstRepositoryContribution",
    OptionOf(
      ChoiceOf(
        Map("CreatedRepositoryContribution" -> Obj(onCreatedRepositoryContribution), "RestrictedContribution" -> Obj(onRestrictedContribution))
      )
    )
  )

  /** Does the user have any more activity in the timeline that occurred prior to the collection's time range?
    */
  def hasActivityInThePast: SelectionBuilder[ContributionsCollection, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasActivityInThePast", Scalar())

  /** Determine if there are any contributions in this collection.
    */
  def hasAnyContributions: SelectionBuilder[ContributionsCollection, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasAnyContributions", Scalar())

  /** Determine if the user made any contributions in this time frame whose details
    * are not visible because they were made in a private repository. Can only be
    * true if the user enabled private contribution counts.
    */
  def hasAnyRestrictedContributions: SelectionBuilder[ContributionsCollection, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasAnyRestrictedContributions", Scalar())

  /** Whether or not the collector's time span is all within the same day.
    */
  def isSingleDay: SelectionBuilder[ContributionsCollection, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isSingleDay", Scalar())

  /** A list of issues the user opened.
    */
  def issueContributions[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    excludeFirst: Option[Boolean]      = None,
    excludePopular: Option[Boolean]    = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[ContributionOrder] = None
  )(innerSelection: SelectionBuilder[CreatedIssueContributionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Boolean]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[ContributionOrder]]
  ): SelectionBuilder[ContributionsCollection, A] = _root_.caliban.client.SelectionBuilder.Field(
    "issueContributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("excludeFirst", excludeFirst, "Boolean")(encoder2),
      Argument("excludePopular", excludePopular, "Boolean")(encoder3),
      Argument("first", first, "Int")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "ContributionOrder")(encoder6)
    )
  )

  /** Issue contributions made by the user, grouped by repository.
    */
  def issueContributionsByRepository[A](
    excludeFirst: Option[Boolean]   = None,
    excludePopular: Option[Boolean] = None,
    maxRepositories: Option[Int]    = None
  )(innerSelection: SelectionBuilder[IssueContributionsByRepository, A])(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]],
    encoder2: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ContributionsCollection, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "issueContributionsByRepository",
    ListOf(Obj(innerSelection)),
    arguments = List(
      Argument("excludeFirst", excludeFirst, "Boolean")(encoder0),
      Argument("excludePopular", excludePopular, "Boolean")(encoder1),
      Argument("maxRepositories", maxRepositories, "Int")(encoder2)
    )
  )

  /** When the user signed up for GitHub. This will be null if that sign up date
    * falls outside the collection's time range and ignoreTimeRange is false.
    */
  def joinedGitHubContribution[A](
    innerSelection: SelectionBuilder[JoinedGitHubContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("joinedGitHubContribution", OptionOf(Obj(innerSelection)))

  /** The date of the most recent restricted contribution the user made in this time
    * period. Can only be non-null when the user has enabled private contribution counts.
    */
  def latestRestrictedContributionDate: SelectionBuilder[ContributionsCollection, Option[Date]] =
    _root_.caliban.client.SelectionBuilder.Field("latestRestrictedContributionDate", OptionOf(Scalar()))

  /** When this collection's time range does not include any activity from the user, use this
    * to get a different collection from an earlier time range that does have activity.
    */
  def mostRecentCollectionWithActivity[A](
    innerSelection: SelectionBuilder[ContributionsCollection, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("mostRecentCollectionWithActivity", OptionOf(Obj(innerSelection)))

  /** Returns a different contributions collection from an earlier time range than this one
    * that does not have any contributions.
    */
  def mostRecentCollectionWithoutActivity[A](
    innerSelection: SelectionBuilder[ContributionsCollection, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("mostRecentCollectionWithoutActivity", OptionOf(Obj(innerSelection)))

  /** The issue the user opened on GitHub that received the most comments in the specified
    * time frame.
    */
  def popularIssueContribution[A](
    innerSelection: SelectionBuilder[CreatedIssueContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("popularIssueContribution", OptionOf(Obj(innerSelection)))

  /** The pull request the user opened on GitHub that received the most comments in the
    * specified time frame.
    */
  def popularPullRequestContribution[A](
    innerSelection: SelectionBuilder[CreatedPullRequestContribution, A]
  ): SelectionBuilder[ContributionsCollection, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("popularPullRequestContribution", OptionOf(Obj(innerSelection)))

  /** Pull request contributions made by the user.
    */
  def pullRequestContributions[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    excludeFirst: Option[Boolean]      = None,
    excludePopular: Option[Boolean]    = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[ContributionOrder] = None
  )(innerSelection: SelectionBuilder[CreatedPullRequestContributionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Boolean]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[ContributionOrder]]
  ): SelectionBuilder[ContributionsCollection, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequestContributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("excludeFirst", excludeFirst, "Boolean")(encoder2),
      Argument("excludePopular", excludePopular, "Boolean")(encoder3),
      Argument("first", first, "Int")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "ContributionOrder")(encoder6)
    )
  )

  /** Pull request contributions made by the user, grouped by repository.
    */
  def pullRequestContributionsByRepository[A](
    excludeFirst: Option[Boolean]   = None,
    excludePopular: Option[Boolean] = None,
    maxRepositories: Option[Int]    = None
  )(innerSelection: SelectionBuilder[PullRequestContributionsByRepository, A])(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]],
    encoder2: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ContributionsCollection, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequestContributionsByRepository",
    ListOf(Obj(innerSelection)),
    arguments = List(
      Argument("excludeFirst", excludeFirst, "Boolean")(encoder0),
      Argument("excludePopular", excludePopular, "Boolean")(encoder1),
      Argument("maxRepositories", maxRepositories, "Int")(encoder2)
    )
  )

  /** Pull request review contributions made by the user.
    */
  def pullRequestReviewContributions[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[ContributionOrder] = None
  )(innerSelection: SelectionBuilder[CreatedPullRequestReviewContributionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[ContributionOrder]]
  ): SelectionBuilder[ContributionsCollection, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequestReviewContributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "ContributionOrder")(encoder4)
    )
  )

  /** Pull request review contributions made by the user, grouped by repository.
    */
  def pullRequestReviewContributionsByRepository[A](maxRepositories: Option[Int] = None)(
    innerSelection: SelectionBuilder[PullRequestReviewContributionsByRepository, A]
  )(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[ContributionsCollection, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequestReviewContributionsByRepository",
    ListOf(Obj(innerSelection)),
    arguments = List(Argument("maxRepositories", maxRepositories, "Int")(encoder0))
  )

  /** A list of repositories owned by the user that the user created in this time range.
    */
  def repositoryContributions[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    excludeFirst: Option[Boolean]      = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[ContributionOrder] = None
  )(innerSelection: SelectionBuilder[CreatedRepositoryContributionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Boolean]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[ContributionOrder]]
  ): SelectionBuilder[ContributionsCollection, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryContributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("excludeFirst", excludeFirst, "Boolean")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "ContributionOrder")(encoder5)
    )
  )

  /** A count of contributions made by the user that the viewer cannot access. Only
    * non-zero when the user has chosen to share their private contribution counts.
    */
  def restrictedContributionsCount: SelectionBuilder[ContributionsCollection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("restrictedContributionsCount", Scalar())

  /** The beginning date and time of this collection.
    */
  def startedAt: SelectionBuilder[ContributionsCollection, DateTime] = _root_.caliban.client.SelectionBuilder.Field("startedAt", Scalar())

  /** How many commits were made by the user in this time span.
    */
  def totalCommitContributions: SelectionBuilder[ContributionsCollection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalCommitContributions", Scalar())

  /** How many issues the user opened.
    */
  def totalIssueContributions(excludeFirst: Option[Boolean] = None, excludePopular: Option[Boolean] = None)(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[ContributionsCollection, Int] = _root_.caliban.client.SelectionBuilder.Field(
    "totalIssueContributions",
    Scalar(),
    arguments = List(Argument("excludeFirst", excludeFirst, "Boolean")(encoder0), Argument("excludePopular", excludePopular, "Boolean")(encoder1))
  )

  /** How many pull requests the user opened.
    */
  def totalPullRequestContributions(excludeFirst: Option[Boolean] = None, excludePopular: Option[Boolean] = None)(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[ContributionsCollection, Int] = _root_.caliban.client.SelectionBuilder.Field(
    "totalPullRequestContributions",
    Scalar(),
    arguments = List(Argument("excludeFirst", excludeFirst, "Boolean")(encoder0), Argument("excludePopular", excludePopular, "Boolean")(encoder1))
  )

  /** How many pull request reviews the user left.
    */
  def totalPullRequestReviewContributions: SelectionBuilder[ContributionsCollection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalPullRequestReviewContributions", Scalar())

  /** How many different repositories the user committed to.
    */
  def totalRepositoriesWithContributedCommits: SelectionBuilder[ContributionsCollection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalRepositoriesWithContributedCommits", Scalar())

  /** How many different repositories the user opened issues in.
    */
  def totalRepositoriesWithContributedIssues(excludeFirst: Option[Boolean] = None, excludePopular: Option[Boolean] = None)(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[ContributionsCollection, Int] = _root_.caliban.client.SelectionBuilder.Field(
    "totalRepositoriesWithContributedIssues",
    Scalar(),
    arguments = List(Argument("excludeFirst", excludeFirst, "Boolean")(encoder0), Argument("excludePopular", excludePopular, "Boolean")(encoder1))
  )

  /** How many different repositories the user left pull request reviews in.
    */
  def totalRepositoriesWithContributedPullRequestReviews: SelectionBuilder[ContributionsCollection, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalRepositoriesWithContributedPullRequestReviews", Scalar())

  /** How many different repositories the user opened pull requests in.
    */
  def totalRepositoriesWithContributedPullRequests(excludeFirst: Option[Boolean] = None, excludePopular: Option[Boolean] = None)(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[ContributionsCollection, Int] = _root_.caliban.client.SelectionBuilder.Field(
    "totalRepositoriesWithContributedPullRequests",
    Scalar(),
    arguments = List(Argument("excludeFirst", excludeFirst, "Boolean")(encoder0), Argument("excludePopular", excludePopular, "Boolean")(encoder1))
  )

  /** How many repositories the user created.
    */
  def totalRepositoryContributions(
    excludeFirst: Option[Boolean] = None
  )(implicit encoder0: ArgEncoder[Option[Boolean]]): SelectionBuilder[ContributionsCollection, Int] = _root_.caliban.client.SelectionBuilder
    .Field("totalRepositoryContributions", Scalar(), arguments = List(Argument("excludeFirst", excludeFirst, "Boolean")(encoder0)))

  /** The user who made the contributions in this collection.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[ContributionsCollection, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))

  /** The first issue the user opened on GitHub. This will be null if that issue was
    * opened outside the collection's time range and ignoreTimeRange is false. If
    * the issue is not visible but the user has opted to show private contributions,
    * a RestrictedContribution will be returned.
    */
  def firstIssueContributionOption[A](
    onCreatedIssueContribution: Option[SelectionBuilder[CreatedIssueContribution, A]] = None,
    onRestrictedContribution: Option[SelectionBuilder[RestrictedContribution, A]]     = None
  ): SelectionBuilder[ContributionsCollection, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstIssueContribution",
    OptionOf(
      ChoiceOf(
        Map(
          "CreatedIssueContribution" -> onCreatedIssueContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RestrictedContribution"   -> onRestrictedContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )

  /** The first pull request the user opened on GitHub. This will be null if that
    * pull request was opened outside the collection's time range and
    * ignoreTimeRange is not true. If the pull request is not visible but the user
    * has opted to show private contributions, a RestrictedContribution will be returned.
    */
  def firstPullRequestContributionOption[A](
    onCreatedPullRequestContribution: Option[SelectionBuilder[CreatedPullRequestContribution, A]] = None,
    onRestrictedContribution: Option[SelectionBuilder[RestrictedContribution, A]]                 = None
  ): SelectionBuilder[ContributionsCollection, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstPullRequestContribution",
    OptionOf(
      ChoiceOf(
        Map(
          "CreatedPullRequestContribution" -> onCreatedPullRequestContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RestrictedContribution"         -> onRestrictedContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )

  /** The first repository the user created on GitHub. This will be null if that
    * first repository was created outside the collection's time range and
    * ignoreTimeRange is false. If the repository is not visible, then a
    * RestrictedContribution is returned.
    */
  def firstRepositoryContributionOption[A](
    onCreatedRepositoryContribution: Option[SelectionBuilder[CreatedRepositoryContribution, A]] = None,
    onRestrictedContribution: Option[SelectionBuilder[RestrictedContribution, A]]               = None
  ): SelectionBuilder[ContributionsCollection, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "firstRepositoryContribution",
    OptionOf(
      ChoiceOf(
        Map(
          "CreatedRepositoryContribution" -> onCreatedRepositoryContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RestrictedContribution"        -> onRestrictedContribution.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

