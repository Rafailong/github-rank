package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Submodule {

  /** The branch of the upstream submodule for tracking updates
    */
  def branch: SelectionBuilder[Submodule, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("branch", OptionOf(Scalar()))

  /** The git URL of the submodule repository
    */
  def gitUrl: SelectionBuilder[Submodule, URI] = _root_.caliban.client.SelectionBuilder.Field("gitUrl", Scalar())

  /** The name of the submodule in .gitmodules
    */
  def name: SelectionBuilder[Submodule, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The path in the superproject that this submodule is located in
    */
  def path: SelectionBuilder[Submodule, String] = _root_.caliban.client.SelectionBuilder.Field("path", Scalar())

  /** The commit revision of the subproject repository being tracked by the submodule
    */
  def subprojectCommitOid: SelectionBuilder[Submodule, Option[GitObjectID]] =
    _root_.caliban.client.SelectionBuilder.Field("subprojectCommitOid", OptionOf(Scalar()))
}

