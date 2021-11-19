package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrgRestoreMemberMembershipOrganizationAuditEntryData {

  /** The Organization associated with the Audit Entry.
    */
  def organization[A](
    innerSelection: SelectionBuilder[Organization, A]
  ): SelectionBuilder[OrgRestoreMemberMembershipOrganizationAuditEntryData, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The name of the Organization.
    */
  def organizationName: SelectionBuilder[OrgRestoreMemberMembershipOrganizationAuditEntryData, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationName", OptionOf(Scalar()))

  /** The HTTP path for the organization
    */
  def organizationResourcePath: SelectionBuilder[OrgRestoreMemberMembershipOrganizationAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the organization
    */
  def organizationUrl: SelectionBuilder[OrgRestoreMemberMembershipOrganizationAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationUrl", OptionOf(Scalar()))
}

