package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ExternalIdentity {

  /** The GUID for this identity
    */
  def guid: SelectionBuilder[ExternalIdentity, String] = _root_.caliban.client.SelectionBuilder.Field("guid", Scalar())
  def id: SelectionBuilder[ExternalIdentity, String]   = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Organization invitation for this SCIM-provisioned external identity
    */
  def organizationInvitation[A](innerSelection: SelectionBuilder[OrganizationInvitation, A]): SelectionBuilder[ExternalIdentity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationInvitation", OptionOf(Obj(innerSelection)))

  /** SAML Identity attributes
    */
  def samlIdentity[A](innerSelection: SelectionBuilder[ExternalIdentitySamlAttributes, A]): SelectionBuilder[ExternalIdentity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("samlIdentity", OptionOf(Obj(innerSelection)))

  /** SCIM Identity attributes
    */
  def scimIdentity[A](innerSelection: SelectionBuilder[ExternalIdentityScimAttributes, A]): SelectionBuilder[ExternalIdentity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("scimIdentity", OptionOf(Obj(innerSelection)))

  /** User linked to this external identity. Will be NULL if this identity has not been claimed by an organization member.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[ExternalIdentity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

