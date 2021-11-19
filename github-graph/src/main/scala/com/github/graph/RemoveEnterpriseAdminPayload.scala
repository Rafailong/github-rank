package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveEnterpriseAdminPayload {

  /** The user who was removed as an administrator.
    */
  def admin[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RemoveEnterpriseAdminPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("admin", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveEnterpriseAdminPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated enterprise.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[RemoveEnterpriseAdminPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of removing an administrator.
    */
  def message: SelectionBuilder[RemoveEnterpriseAdminPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))

  /** The viewer performing the mutation.
    */
  def viewer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RemoveEnterpriseAdminPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("viewer", OptionOf(Obj(innerSelection)))
}

