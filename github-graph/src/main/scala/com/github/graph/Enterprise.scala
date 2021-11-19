package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Enterprise {

  /** A URL pointing to the enterprise's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Enterprise, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** Enterprise billing information visible to enterprise billing managers.
    */
  def billingInfo[A](innerSelection: SelectionBuilder[EnterpriseBillingInfo, A]): SelectionBuilder[Enterprise, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("billingInfo", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Enterprise, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Enterprise, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The description of the enterprise.
    */
  def description: SelectionBuilder[Enterprise, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The description of the enterprise as HTML.
    */
  def descriptionHTML: SelectionBuilder[Enterprise, HTML] = _root_.caliban.client.SelectionBuilder.Field("descriptionHTML", Scalar())
  def id: SelectionBuilder[Enterprise, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The location of the enterprise.
    */
  def location: SelectionBuilder[Enterprise, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("location", OptionOf(Scalar()))

  /** A list of users who are members of this enterprise.
    */
  def members[A](
    after: Option[String]                             = None,
    before: Option[String]                            = None,
    deployment: Option[EnterpriseUserDeployment]      = None,
    first: Option[Int]                                = None,
    last: Option[Int]                                 = None,
    orderBy: Option[EnterpriseMemberOrder]            = None,
    organizationLogins: Option[List[String]]          = None,
    query: Option[String]                             = None,
    role: Option[EnterpriseUserAccountMembershipRole] = None
  )(innerSelection: SelectionBuilder[EnterpriseMemberConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[EnterpriseUserDeployment]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[EnterpriseMemberOrder]],
    encoder6: ArgEncoder[Option[List[String]]],
    encoder7: ArgEncoder[Option[String]],
    encoder8: ArgEncoder[Option[EnterpriseUserAccountMembershipRole]]
  ): SelectionBuilder[Enterprise, A] = _root_.caliban.client.SelectionBuilder.Field(
    "members",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("deployment", deployment, "EnterpriseUserDeployment")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "EnterpriseMemberOrder")(encoder5),
      Argument("organizationLogins", organizationLogins, "[String!]")(encoder6),
      Argument("query", query, "String")(encoder7),
      Argument("role", role, "EnterpriseUserAccountMembershipRole")(encoder8)
    )
  )

  /** The name of the enterprise.
    */
  def name: SelectionBuilder[Enterprise, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** A list of organizations that belong to this enterprise.
    */
  def organizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    query: Option[String]              = None
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[Enterprise, A] = _root_.caliban.client.SelectionBuilder.Field(
    "organizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** Enterprise information only visible to enterprise owners.
    */
  def ownerInfo[A](innerSelection: SelectionBuilder[EnterpriseOwnerInfo, A]): SelectionBuilder[Enterprise, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ownerInfo", OptionOf(Obj(innerSelection)))

  /** The HTTP path for this enterprise.
    */
  def resourcePath: SelectionBuilder[Enterprise, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The URL-friendly identifier for the enterprise.
    */
  def slug: SelectionBuilder[Enterprise, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** The HTTP URL for this enterprise.
    */
  def url: SelectionBuilder[Enterprise, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of user accounts on this enterprise.
    */
  def userAccounts[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[EnterpriseUserAccountConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Enterprise, A] = _root_.caliban.client.SelectionBuilder.Field(
    "userAccounts",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Is the current viewer an admin of this enterprise?
    */
  def viewerIsAdmin: SelectionBuilder[Enterprise, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerIsAdmin", Scalar())

  /** The URL of the enterprise website.
    */
  def websiteUrl: SelectionBuilder[Enterprise, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("websiteUrl", OptionOf(Scalar()))
}

