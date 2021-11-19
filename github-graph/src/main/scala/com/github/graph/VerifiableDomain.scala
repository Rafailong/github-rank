package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object VerifiableDomain {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[VerifiableDomain, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[VerifiableDomain, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The DNS host name that should be used for verification.
    */
  def dnsHostName: SelectionBuilder[VerifiableDomain, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("dnsHostName", OptionOf(Scalar()))

  /** The unicode encoded domain.
    */
  def domain: SelectionBuilder[VerifiableDomain, URI] = _root_.caliban.client.SelectionBuilder.Field("domain", Scalar())

  /** Whether a TXT record for verification with the expected host name was found.
    */
  def hasFoundHostName: SelectionBuilder[VerifiableDomain, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasFoundHostName", Scalar())

  /** Whether a TXT record for verification with the expected verification token was found.
    */
  def hasFoundVerificationToken: SelectionBuilder[VerifiableDomain, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasFoundVerificationToken", Scalar())
  def id: SelectionBuilder[VerifiableDomain, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether or not the domain is approved.
    */
  def isApproved: SelectionBuilder[VerifiableDomain, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isApproved", Scalar())

  /** Whether this domain is required to exist for an organization or enterprise policy to be enforced.
    */
  def isRequiredForPolicyEnforcement: SelectionBuilder[VerifiableDomain, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isRequiredForPolicyEnforcement", Scalar())

  /** Whether or not the domain is verified.
    */
  def isVerified: SelectionBuilder[VerifiableDomain, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isVerified", Scalar())

  /** The owner of the domain.
    */
  def owner[A](
    onEnterprise: SelectionBuilder[Enterprise, A],
    onOrganization: SelectionBuilder[Organization, A]
  ): SelectionBuilder[VerifiableDomain, A] =
    _root_.caliban.client.SelectionBuilder.Field("owner", ChoiceOf(Map("Enterprise" -> Obj(onEnterprise), "Organization" -> Obj(onOrganization))))

  /** The punycode encoded domain.
    */
  def punycodeEncodedDomain: SelectionBuilder[VerifiableDomain, URI] = _root_.caliban.client.SelectionBuilder.Field("punycodeEncodedDomain", Scalar())

  /** The time that the current verification token will expire.
    */
  def tokenExpirationTime: SelectionBuilder[VerifiableDomain, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("tokenExpirationTime", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[VerifiableDomain, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The current verification token for the domain.
    */
  def verificationToken: SelectionBuilder[VerifiableDomain, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("verificationToken", OptionOf(Scalar()))
}

