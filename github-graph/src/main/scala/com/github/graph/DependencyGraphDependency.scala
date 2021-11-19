package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DependencyGraphDependency {

  /** Does the dependency itself have dependencies?
    */
  def hasDependencies: SelectionBuilder[DependencyGraphDependency, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasDependencies", Scalar())

  /** The original name of the package, as it appears in the manifest.
    */
  def packageLabel: SelectionBuilder[DependencyGraphDependency, String] = _root_.caliban.client.SelectionBuilder.Field("packageLabel", Scalar())

  /** The dependency package manager
    */
  def packageManager: SelectionBuilder[DependencyGraphDependency, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("packageManager", OptionOf(Scalar()))

  /** The name of the package in the canonical form used by the package manager.
    * This may differ from the original textual form (see packageLabel), for example
    * in a package manager that uses case-insensitive comparisons.
    */
  def packageName: SelectionBuilder[DependencyGraphDependency, String] = _root_.caliban.client.SelectionBuilder.Field("packageName", Scalar())

  /** The repository containing the package
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[DependencyGraphDependency, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))

  /** The dependency version requirements
    */
  def requirements: SelectionBuilder[DependencyGraphDependency, String] = _root_.caliban.client.SelectionBuilder.Field("requirements", Scalar())
}

