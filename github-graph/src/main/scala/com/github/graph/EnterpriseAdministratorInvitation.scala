package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseAdministratorInvitation {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[EnterpriseAdministratorInvitation, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The email of the person who was invited to the enterprise.
    */
  def email: SelectionBuilder[EnterpriseAdministratorInvitation, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))

  /** The enterprise the invitation is for.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[EnterpriseAdministratorInvitation, A] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", Obj(innerSelection))
  def id: SelectionBuilder[EnterpriseAdministratorInvitation, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The user who was invited to the enterprise.
    */
  def invitee[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[EnterpriseAdministratorInvitation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("invitee", OptionOf(Obj(innerSelection)))

  /** The user who created the invitation.
    */
  def inviter[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[EnterpriseAdministratorInvitation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("inviter", OptionOf(Obj(innerSelection)))

  /** The invitee's pending role in the enterprise (owner or billing_manager).
    */
  def role: SelectionBuilder[EnterpriseAdministratorInvitation, EnterpriseAdministratorRole] =
    _root_.caliban.client.SelectionBuilder.Field("role", Scalar())
}

