package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseIdentityProvider {

  /** The digest algorithm used to sign SAML requests for the identity provider.
    */
  def digestMethod: SelectionBuilder[EnterpriseIdentityProvider, Option[SamlDigestAlgorithm]] =
    _root_.caliban.client.SelectionBuilder.Field("digestMethod", OptionOf(Scalar()))

  /** The enterprise this identity provider belongs to.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[EnterpriseIdentityProvider, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** ExternalIdentities provisioned by this identity provider.
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
  ): SelectionBuilder[EnterpriseIdentityProvider, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def id: SelectionBuilder[EnterpriseIdentityProvider, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The x509 certificate used by the identity provider to sign assertions and responses.
    */
  def idpCertificate: SelectionBuilder[EnterpriseIdentityProvider, Option[X509Certificate]] =
    _root_.caliban.client.SelectionBuilder.Field("idpCertificate", OptionOf(Scalar()))

  /** The Issuer Entity ID for the SAML identity provider.
    */
  def issuer: SelectionBuilder[EnterpriseIdentityProvider, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("issuer", OptionOf(Scalar()))

  /** Recovery codes that can be used by admins to access the enterprise if the identity provider is unavailable.
    */
  def recoveryCodes: SelectionBuilder[EnterpriseIdentityProvider, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("recoveryCodes", OptionOf(ListOf(Scalar())))

  /** The signature algorithm used to sign SAML requests for the identity provider.
    */
  def signatureMethod: SelectionBuilder[EnterpriseIdentityProvider, Option[SamlSignatureAlgorithm]] =
    _root_.caliban.client.SelectionBuilder.Field("signatureMethod", OptionOf(Scalar()))

  /** The URL endpoint for the identity provider's SAML SSO.
    */
  def ssoUrl: SelectionBuilder[EnterpriseIdentityProvider, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("ssoUrl", OptionOf(Scalar()))
}

