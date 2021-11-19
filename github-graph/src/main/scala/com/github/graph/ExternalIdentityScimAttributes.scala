package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ExternalIdentityScimAttributes {

  /** The emails associated with the SCIM identity
    */
  def emails[A](innerSelection: SelectionBuilder[UserEmailMetadata, A]): SelectionBuilder[ExternalIdentityScimAttributes, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("emails", OptionOf(ListOf(Obj(innerSelection))))

  /** Family name of the SCIM identity
    */
  def familyName: SelectionBuilder[ExternalIdentityScimAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("familyName", OptionOf(Scalar()))

  /** Given name of the SCIM identity
    */
  def givenName: SelectionBuilder[ExternalIdentityScimAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("givenName", OptionOf(Scalar()))

  /** The groups linked to this identity in IDP
    */
  def groups: SelectionBuilder[ExternalIdentityScimAttributes, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("groups", OptionOf(ListOf(Scalar())))

  /** The userName of the SCIM identity
    */
  def username: SelectionBuilder[ExternalIdentityScimAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("username", OptionOf(Scalar()))
}

