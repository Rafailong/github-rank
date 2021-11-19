package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationIdentityProvider {

  /** The digest algorithm used to sign SAML requests for the Identity Provider.
    */
  def digestMethod: SelectionBuilder[OrganizationIdentityProvider, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("digestMethod", OptionOf(Scalar()))

  /** External Identities provisioned by this Identity Provider
    */
  def externalIdentities[A](
    after: Option[String]        = None,
    before: Option[String]       = None,
    first: Option[Int]           = None,
    last: Option[Int]            = None,
    membersOnly: Option[Boolean] = None
  )(innerSelection: SelectionBuilder[ExternalIdentityConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[OrganizationIdentityProvider, A] = _root_.caliban.client.SelectionBuilder.Field(
    "externalIdentities",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("membersOnly", membersOnly, "Boolean")(encoder4)
    )
  )
  def id: SelectionBuilder[OrganizationIdentityProvider, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The x509 certificate used by the Identity Provider to sign assertions and responses.
    */
  def idpCertificate: SelectionBuilder[OrganizationIdentityProvider, Option[X509Certificate]] =
    _root_.caliban.client.SelectionBuilder.Field("idpCertificate", OptionOf(Scalar()))

  /** The Issuer Entity ID for the SAML Identity Provider
    */
  def issuer: SelectionBuilder[OrganizationIdentityProvider, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("issuer", OptionOf(Scalar()))

  /** Organization this Identity Provider belongs to
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[OrganizationIdentityProvider, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The signature algorithm used to sign SAML requests for the Identity Provider.
    */
  def signatureMethod: SelectionBuilder[OrganizationIdentityProvider, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("signatureMethod", OptionOf(Scalar()))

  /** The URL endpoint for the Identity Provider's SAML SSO.
    */
  def ssoUrl: SelectionBuilder[OrganizationIdentityProvider, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("ssoUrl", OptionOf(Scalar()))
}

