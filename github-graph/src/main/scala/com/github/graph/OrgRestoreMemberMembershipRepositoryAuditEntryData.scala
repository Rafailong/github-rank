package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrgRestoreMemberMembershipRepositoryAuditEntryData {

  /** The repository associated with the action
    */
  def repository[A](
    innerSelection: SelectionBuilder[Repository, A]
  ): SelectionBuilder[OrgRestoreMemberMembershipRepositoryAuditEntryData, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))

  /** The name of the repository
    */
  def repositoryName: SelectionBuilder[OrgRestoreMemberMembershipRepositoryAuditEntryData, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryName", OptionOf(Scalar()))

  /** The HTTP path for the repository
    */
  def repositoryResourcePath: SelectionBuilder[OrgRestoreMemberMembershipRepositoryAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the repository
    */
  def repositoryUrl: SelectionBuilder[OrgRestoreMemberMembershipRepositoryAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryUrl", OptionOf(Scalar()))
}

