package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseServerUserAccountEmail {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseServerUserAccountEmail, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The email address.
    */
  def email: SelectionBuilder[EnterpriseServerUserAccountEmail, String] = _root_.caliban.client.SelectionBuilder.Field("email", Scalar())
  def id: SelectionBuilder[EnterpriseServerUserAccountEmail, String]    = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Indicates whether this is the primary email of the associated user account.
    */
  def isPrimary: SelectionBuilder[EnterpriseServerUserAccountEmail, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPrimary", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[EnterpriseServerUserAccountEmail, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The user account to which the email belongs.
    */
  def userAccount[A](innerSelection: SelectionBuilder[EnterpriseServerUserAccount, A]): SelectionBuilder[EnterpriseServerUserAccountEmail, A] =
    _root_.caliban.client.SelectionBuilder.Field("userAccount", Obj(innerSelection))
}

