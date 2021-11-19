package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OIDCProvider {

  /** The enterprise this identity provider belongs to.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[OIDCProvider, Option[A]] =
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
  ): SelectionBuilder[OIDCProvider, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def id: SelectionBuilder[OIDCProvider, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The OIDC identity provider type
    */
  def providerType: SelectionBuilder[OIDCProvider, OIDCProviderType] = _root_.caliban.client.SelectionBuilder.Field("providerType", Scalar())

  /** The id of the tenant this provider is attached to
    */
  def tenantId: SelectionBuilder[OIDCProvider, String] = _root_.caliban.client.SelectionBuilder.Field("tenantId", Scalar())
}

