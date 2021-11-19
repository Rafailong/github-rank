package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Package_1 {
  def id: SelectionBuilder[Package_1, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Find the latest version for the package.
    */
  def latestVersion[A](innerSelection: SelectionBuilder[PackageVersion, A]): SelectionBuilder[Package_1, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("latestVersion", OptionOf(Obj(innerSelection)))

  /** Identifies the name of the package.
    */
  def name: SelectionBuilder[Package_1, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Identifies the type of the package.
    */
  def packageType: SelectionBuilder[Package_1, PackageType] = _root_.caliban.client.SelectionBuilder.Field("packageType", Scalar())

  /** The repository this package belongs to.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Package_1, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))

  /** Statistics about package activity.
    */
  def statistics[A](innerSelection: SelectionBuilder[PackageStatistics, A]): SelectionBuilder[Package_1, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("statistics", OptionOf(Obj(innerSelection)))

  /** Find package version by version string.
    */
  def version[A](version: String)(
    innerSelection: SelectionBuilder[PackageVersion, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Package_1, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("version", OptionOf(Obj(innerSelection)), arguments = List(Argument("version", version, "String!")(encoder0)))

  /** list of versions for this package
    */
  def versions[A](
    after: Option[String]                = None,
    before: Option[String]               = None,
    first: Option[Int]                   = None,
    last: Option[Int]                    = None,
    orderBy: Option[PackageVersionOrder] = None
  )(innerSelection: SelectionBuilder[PackageVersionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[PackageVersionOrder]]
  ): SelectionBuilder[Package_1, A] = _root_.caliban.client.SelectionBuilder.Field(
    "versions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "PackageVersionOrder")(encoder4)
    )
  )
}

