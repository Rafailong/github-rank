package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestReviewContributionsByRepository {

  /** The pull request review contributions.
    */
  def contributions[A](
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
  ): SelectionBuilder[PullRequestReviewContributionsByRepository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "contributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "ContributionOrder")(encoder4)
    )
  )

  /** The repository in which the pull request reviews were made.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequestReviewContributionsByRepository, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

