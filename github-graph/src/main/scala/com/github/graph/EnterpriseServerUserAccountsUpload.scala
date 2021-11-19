package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseServerUserAccountsUpload {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseServerUserAccountsUpload, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The enterprise to which this upload belongs.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[EnterpriseServerUserAccountsUpload, A] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", Obj(innerSelection))

  /** The Enterprise Server installation for which this upload was generated.
    */
  def enterpriseServerInstallation[A](
    innerSelection: SelectionBuilder[EnterpriseServerInstallation, A]
  ): SelectionBuilder[EnterpriseServerUserAccountsUpload, A] =
    _root_.caliban.client.SelectionBuilder.Field("enterpriseServerInstallation", Obj(innerSelection))
  def id: SelectionBuilder[EnterpriseServerUserAccountsUpload, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The name of the file uploaded.
    */
  def name: SelectionBuilder[EnterpriseServerUserAccountsUpload, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The synchronization state of the upload
    */
  def syncState: SelectionBuilder[EnterpriseServerUserAccountsUpload, EnterpriseServerUserAccountsUploadSyncState] =
    _root_.caliban.client.SelectionBuilder.Field("syncState", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[EnterpriseServerUserAccountsUpload, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

