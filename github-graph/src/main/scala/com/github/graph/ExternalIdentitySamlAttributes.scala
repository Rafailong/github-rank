package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ExternalIdentitySamlAttributes {

  /** The emails associated with the SAML identity
    */
  def emails[A](innerSelection: SelectionBuilder[UserEmailMetadata, A]): SelectionBuilder[ExternalIdentitySamlAttributes, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("emails", OptionOf(ListOf(Obj(innerSelection))))

  /** Family name of the SAML identity
    */
  def familyName: SelectionBuilder[ExternalIdentitySamlAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("familyName", OptionOf(Scalar()))

  /** Given name of the SAML identity
    */
  def givenName: SelectionBuilder[ExternalIdentitySamlAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("givenName", OptionOf(Scalar()))

  /** The groups linked to this identity in IDP
    */
  def groups: SelectionBuilder[ExternalIdentitySamlAttributes, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("groups", OptionOf(ListOf(Scalar())))

  /** The NameID of the SAML identity
    */
  def nameId: SelectionBuilder[ExternalIdentitySamlAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("nameId", OptionOf(Scalar()))

  /** The userName of the SAML identity
    */
  def username: SelectionBuilder[ExternalIdentitySamlAttributes, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("username", OptionOf(Scalar()))
}

