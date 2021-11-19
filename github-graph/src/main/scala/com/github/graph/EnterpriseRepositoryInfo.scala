package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseRepositoryInfo {
  def id: SelectionBuilder[EnterpriseRepositoryInfo, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies if the repository is private or internal.
    */
  def isPrivate: SelectionBuilder[EnterpriseRepositoryInfo, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPrivate", Scalar())

  /** The repository's name.
    */
  def name: SelectionBuilder[EnterpriseRepositoryInfo, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The repository's name with owner.
    */
  def nameWithOwner: SelectionBuilder[EnterpriseRepositoryInfo, String] = _root_.caliban.client.SelectionBuilder.Field("nameWithOwner", Scalar())
}

