package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseServerInstallation {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseServerInstallation, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The customer name to which the Enterprise Server installation belongs.
    */
  def customerName: SelectionBuilder[EnterpriseServerInstallation, String] = _root_.caliban.client.SelectionBuilder.Field("customerName", Scalar())

  /** The host name of the Enterprise Server installation.
    */
  def hostName: SelectionBuilder[EnterpriseServerInstallation, String] = _root_.caliban.client.SelectionBuilder.Field("hostName", Scalar())
  def id: SelectionBuilder[EnterpriseServerInstallation, String]       = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether or not the installation is connected to an Enterprise Server installation via GitHub Connect.
    */
  def isConnected: SelectionBuilder[EnterpriseServerInstallation, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isConnected", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[EnterpriseServerInstallation, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** User accounts on this Enterprise Server installation.
    */
  def userAccounts[A](
    after: Option[String]                             = None,
    before: Option[String]                            = None,
    first: Option[Int]                                = None,
    last: Option[Int]                                 = None,
    orderBy: Option[EnterpriseServerUserAccountOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseServerUserAccountConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseServerUserAccountOrder]]
  ): SelectionBuilder[EnterpriseServerInstallation, A] = _root_.caliban.client.SelectionBuilder.Field(
    "userAccounts",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseServerUserAccountOrder")(encoder4)
    )
  )

  /** User accounts uploads for the Enterprise Server installation.
    */
  def userAccountsUploads[A](
    after: Option[String]                                    = None,
    before: Option[String]                                   = None,
    first: Option[Int]                                       = None,
    last: Option[Int]                                        = None,
    orderBy: Option[EnterpriseServerUserAccountsUploadOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseServerUserAccountsUploadConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseServerUserAccountsUploadOrder]]
  ): SelectionBuilder[EnterpriseServerInstallation, A] = _root_.caliban.client.SelectionBuilder.Field(
    "userAccountsUploads",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseServerUserAccountsUploadOrder")(encoder4)
    )
  )
}

