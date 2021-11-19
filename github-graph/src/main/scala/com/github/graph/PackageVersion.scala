package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PackageVersion {

  /** List of files associated with this package version
    */
  def files[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    first: Option[Int]                = None,
    last: Option[Int]                 = None,
    orderBy: Option[PackageFileOrder] = None
  )(innerSelection: SelectionBuilder[PackageFileConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[PackageFileOrder]]
  ): SelectionBuilder[PackageVersion, A] = _root_.caliban.client.SelectionBuilder.Field(
    "files",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "PackageFileOrder")(encoder4)
    )
  )
  def id: SelectionBuilder[PackageVersion, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The package associated with this version.
    */
  def `package`[A](innerSelection: SelectionBuilder[Package_1, A]): SelectionBuilder[PackageVersion, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("package", OptionOf(Obj(innerSelection)))

  /** The platform this version was built for.
    */
  def platform: SelectionBuilder[PackageVersion, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("platform", OptionOf(Scalar()))

  /** Whether or not this version is a pre-release.
    */
  def preRelease: SelectionBuilder[PackageVersion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("preRelease", Scalar())

  /** The README of this package version.
    */
  def readme: SelectionBuilder[PackageVersion, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("readme", OptionOf(Scalar()))

  /** The release associated with this package version.
    */
  def release[A](innerSelection: SelectionBuilder[Release, A]): SelectionBuilder[PackageVersion, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("release", OptionOf(Obj(innerSelection)))

  /** Statistics about package activity.
    */
  def statistics[A](innerSelection: SelectionBuilder[PackageVersionStatistics, A]): SelectionBuilder[PackageVersion, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("statistics", OptionOf(Obj(innerSelection)))

  /** The package version summary.
    */
  def summary: SelectionBuilder[PackageVersion, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("summary", OptionOf(Scalar()))

  /** The version string.
    */
  def version: SelectionBuilder[PackageVersion, String] = _root_.caliban.client.SelectionBuilder.Field("version", Scalar())
}

