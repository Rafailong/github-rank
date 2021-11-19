package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseUserAccount {

  /** A URL pointing to the enterprise user account's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[EnterpriseUserAccount, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseUserAccount, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The enterprise in which this user account exists.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[EnterpriseUserAccount, A] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", Obj(innerSelection))
  def id: SelectionBuilder[EnterpriseUserAccount, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** An identifier for the enterprise user account, a login or email address
    */
  def login: SelectionBuilder[EnterpriseUserAccount, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** The name of the enterprise user account
    */
  def name: SelectionBuilder[EnterpriseUserAccount, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** A list of enterprise organizations this user is a member of.
    */
  def organizations[A](
    after: Option[String]                             = None,
    before: Option[String]                            = None,
    first: Option[Int]                                = None,
    last: Option[Int]                                 = None,
    orderBy: Option[OrganizationOrder]                = None,
    query: Option[String]                             = None,
    role: Option[EnterpriseUserAccountMembershipRole] = None
  )(innerSelection: SelectionBuilder[EnterpriseOrganizationMembershipConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[EnterpriseUserAccountMembershipRole]]
  ): SelectionBuilder[EnterpriseUserAccount, A] = _root_.caliban.client.SelectionBuilder.Field(
    "organizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("query", query, "String")(encoder5),
      Argument("role", role, "EnterpriseUserAccountMembershipRole")(encoder6)
    )
  )

  /** The HTTP path for this user.
    */
  def resourcePath: SelectionBuilder[EnterpriseUserAccount, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[EnterpriseUserAccount, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this user.
    */
  def url: SelectionBuilder[EnterpriseUserAccount, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The user within the enterprise.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[EnterpriseUserAccount, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

