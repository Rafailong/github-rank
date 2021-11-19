package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryInvitation {

  /** The email address that received the invitation.
    */
  def email: SelectionBuilder[RepositoryInvitation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))
  def id: SelectionBuilder[RepositoryInvitation, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The user who received the invitation.
    */
  def invitee[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RepositoryInvitation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("invitee", OptionOf(Obj(innerSelection)))

  /** The user who created the invitation.
    */
  def inviter[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RepositoryInvitation, A] =
    _root_.caliban.client.SelectionBuilder.Field("inviter", Obj(innerSelection))

  /** The permalink for this repository invitation.
    */
  def permalink: SelectionBuilder[RepositoryInvitation, URI] = _root_.caliban.client.SelectionBuilder.Field("permalink", Scalar())

  /** The permission granted on this repository by this invitation.
    */
  def permission: SelectionBuilder[RepositoryInvitation, RepositoryPermission] = _root_.caliban.client.SelectionBuilder.Field("permission", Scalar())

  /** The Repository the user is invited to.
    */
  def repository[A](onRepository: Option[SelectionBuilder[Repository, A]] = None): SelectionBuilder[RepositoryInvitation, Option[A]] =
    _root_.caliban.client.SelectionBuilder
      .Field("repository", OptionOf(ChoiceOf(Map("Repository" -> onRepository).collect { case (k, Some(v)) => k -> Obj(v) })))
}

