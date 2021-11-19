package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UserBlockedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[UserBlockedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** Number of days that the user was blocked for.
    */
  def blockDuration: SelectionBuilder[UserBlockedEvent, UserBlockDuration] = _root_.caliban.client.SelectionBuilder.Field("blockDuration", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[UserBlockedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[UserBlockedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The user who was blocked.
    */
  def subject[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[UserBlockedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("subject", OptionOf(Obj(innerSelection)))
}

