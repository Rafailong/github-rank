package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseServerUserAccount {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseServerUserAccount, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** User emails belonging to this user account.
    */
  def emails[A](
    after: Option[String]                                  = None,
    before: Option[String]                                 = None,
    first: Option[Int]                                     = None,
    last: Option[Int]                                      = None,
    orderBy: Option[EnterpriseServerUserAccountEmailOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseServerUserAccountEmailConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseServerUserAccountEmailOrder]]
  ): SelectionBuilder[EnterpriseServerUserAccount, A] = _root_.caliban.client.SelectionBuilder.Field(
    "emails",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseServerUserAccountEmailOrder")(encoder4)
    )
  )

  /** The Enterprise Server installation on which this user account exists.
    */
  def enterpriseServerInstallation[A](
    innerSelection: SelectionBuilder[EnterpriseServerInstallation, A]
  ): SelectionBuilder[EnterpriseServerUserAccount, A] =
    _root_.caliban.client.SelectionBuilder.Field("enterpriseServerInstallation", Obj(innerSelection))
  def id: SelectionBuilder[EnterpriseServerUserAccount, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether the user account is a site administrator on the Enterprise Server installation.
    */
  def isSiteAdmin: SelectionBuilder[EnterpriseServerUserAccount, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isSiteAdmin", Scalar())

  /** The login of the user account on the Enterprise Server installation.
    */
  def login: SelectionBuilder[EnterpriseServerUserAccount, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** The profile name of the user account on the Enterprise Server installation.
    */
  def profileName: SelectionBuilder[EnterpriseServerUserAccount, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("profileName", OptionOf(Scalar()))

  /** The date and time when the user account was created on the Enterprise Server installation.
    */
  def remoteCreatedAt: SelectionBuilder[EnterpriseServerUserAccount, DateTime] =
    _root_.caliban.client.SelectionBuilder.Field("remoteCreatedAt", Scalar())

  /** The ID of the user account on the Enterprise Server installation.
    */
  def remoteUserId: SelectionBuilder[EnterpriseServerUserAccount, Int] = _root_.caliban.client.SelectionBuilder.Field("remoteUserId", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[EnterpriseServerUserAccount, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

