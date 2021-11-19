package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UserStatus {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[UserStatus, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** An emoji summarizing the user's status.
    */
  def emoji: SelectionBuilder[UserStatus, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("emoji", OptionOf(Scalar()))

  /** The status emoji as HTML.
    */
  def emojiHTML: SelectionBuilder[UserStatus, Option[HTML]] = _root_.caliban.client.SelectionBuilder.Field("emojiHTML", OptionOf(Scalar()))

  /** If set, the status will not be shown after this date.
    */
  def expiresAt: SelectionBuilder[UserStatus, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("expiresAt", OptionOf(Scalar()))
  def id: SelectionBuilder[UserStatus, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this status indicates the user is not fully available on GitHub.
    */
  def indicatesLimitedAvailability: SelectionBuilder[UserStatus, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("indicatesLimitedAvailability", Scalar())

  /** A brief message describing what the user is doing.
    */
  def message: SelectionBuilder[UserStatus, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))

  /** The organization whose members can see this status. If null, this status is publicly visible.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[UserStatus, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[UserStatus, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The user who has this status.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[UserStatus, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

