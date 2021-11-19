package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CommitContributionsByRepository {

  /** The commit contributions, each representing a day.
    */
  def contributions[A](
    after: Option[String]                    = None,
    before: Option[String]                   = None,
    first: Option[Int]                       = None,
    last: Option[Int]                        = None,
    orderBy: Option[CommitContributionOrder] = None
  )(innerSelection: SelectionBuilder[CreatedCommitContributionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[CommitContributionOrder]]
  ): SelectionBuilder[CommitContributionsByRepository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "contributions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "CommitContributionOrder")(encoder4)
    )
  )

  /** The repository in which the commits were made.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CommitContributionsByRepository, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for the user's commits to the repository in this time range.
    */
  def resourcePath: SelectionBuilder[CommitContributionsByRepository, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for the user's commits to the repository in this time range.
    */
  def url: SelectionBuilder[CommitContributionsByRepository, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

