package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Topic {
  def id: SelectionBuilder[Topic, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The topic's name.
    */
  def name: SelectionBuilder[Topic, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** A list of related topics, including aliases of this topic, sorted with the most relevant
    * first. Returns up to 10 Topics.
    */
  def relatedTopics[A](first: Option[Int] = None)(
    innerSelection: SelectionBuilder[Topic, A]
  )(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Topic, List[A]] = _root_.caliban.client.SelectionBuilder
    .Field("relatedTopics", ListOf(Obj(innerSelection)), arguments = List(Argument("first", first, "Int")(encoder0)))

  /** A list of repositories.
    */
  def repositories[A](
    affiliations: Option[List[Option[RepositoryAffiliation]]]      = None,
    after: Option[String]                                          = None,
    before: Option[String]                                         = None,
    first: Option[Int]                                             = None,
    isLocked: Option[Boolean]                                      = None,
    last: Option[Int]                                              = None,
    orderBy: Option[RepositoryOrder]                               = None,
    ownerAffiliations: Option[List[Option[RepositoryAffiliation]]] = None,
    privacy: Option[RepositoryPrivacy]                             = None,
    sponsorableOnly: Option[Boolean]                               = None
  )(innerSelection: SelectionBuilder[RepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[RepositoryOrder]],
    encoder7: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder8: ArgEncoder[Option[RepositoryPrivacy]],
    encoder9: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[Topic, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositories",
    Obj(innerSelection),
    arguments = List(
      Argument("affiliations", affiliations, "[RepositoryAffiliation]")(encoder0),
      Argument("after", after, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("isLocked", isLocked, "Boolean")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "RepositoryOrder")(encoder6),
      Argument("ownerAffiliations", ownerAffiliations, "[RepositoryAffiliation]")(encoder7),
      Argument("privacy", privacy, "RepositoryPrivacy")(encoder8),
      Argument("sponsorableOnly", sponsorableOnly, "Boolean")(encoder9)
    )
  )

  /** Returns a count of how many stargazers there are on this object
    */
  def stargazerCount: SelectionBuilder[Topic, Int] = _root_.caliban.client.SelectionBuilder.Field("stargazerCount", Scalar())

  /** A list of users who have starred this starrable.
    */
  def stargazers[A](
    after: Option[String]      = None,
    before: Option[String]     = None,
    first: Option[Int]         = None,
    last: Option[Int]          = None,
    orderBy: Option[StarOrder] = None
  )(innerSelection: SelectionBuilder[StargazerConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[StarOrder]]
  ): SelectionBuilder[Topic, A] = _root_.caliban.client.SelectionBuilder.Field(
    "stargazers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "StarOrder")(encoder4)
    )
  )

  /** Returns a boolean indicating whether the viewing user has starred this starrable.
    */
  def viewerHasStarred: SelectionBuilder[Topic, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasStarred", Scalar())
}

