package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationInvitation {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[OrganizationInvitation, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The email address of the user invited to the organization.
    */
  def email: SelectionBuilder[OrganizationInvitation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))
  def id: SelectionBuilder[OrganizationInvitation, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The type of invitation that was sent (e.g. email, user).
    */
  def invitationType: SelectionBuilder[OrganizationInvitation, OrganizationInvitationType] =
    _root_.caliban.client.SelectionBuilder.Field("invitationType", Scalar())

  /** The user who was invited to the organization.
    */
  def invitee[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[OrganizationInvitation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("invitee", OptionOf(Obj(innerSelection)))

  /** The user who created the invitation.
    */
  def inviter[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[OrganizationInvitation, A] =
    _root_.caliban.client.SelectionBuilder.Field("inviter", Obj(innerSelection))

  /** The organization the invite is for
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[OrganizationInvitation, A] =
    _root_.caliban.client.SelectionBuilder.Field("organization", Obj(innerSelection))

  /** The user's pending role in the organization (e.g. member, owner).
    */
  def role: SelectionBuilder[OrganizationInvitation, OrganizationInvitationRole] = _root_.caliban.client.SelectionBuilder.Field("role", Scalar())
}

