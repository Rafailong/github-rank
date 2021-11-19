package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DependencyGraphManifest {

  /** Path to view the manifest file blob
    */
  def blobPath: SelectionBuilder[DependencyGraphManifest, String] = _root_.caliban.client.SelectionBuilder.Field("blobPath", Scalar())

  /** A list of manifest dependencies
    */
  def dependencies[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DependencyGraphDependencyConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[DependencyGraphManifest, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "dependencies",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The number of dependencies listed in the manifest
    */
  def dependenciesCount: SelectionBuilder[DependencyGraphManifest, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("dependenciesCount", OptionOf(Scalar()))

  /** Is the manifest too big to parse?
    */
  def exceedsMaxSize: SelectionBuilder[DependencyGraphManifest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("exceedsMaxSize", Scalar())

  /** Fully qualified manifest filename
    */
  def filename: SelectionBuilder[DependencyGraphManifest, String] = _root_.caliban.client.SelectionBuilder.Field("filename", Scalar())
  def id: SelectionBuilder[DependencyGraphManifest, String]       = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Were we able to parse the manifest?
    */
  def parseable: SelectionBuilder[DependencyGraphManifest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("parseable", Scalar())

  /** The repository containing the manifest
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[DependencyGraphManifest, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

