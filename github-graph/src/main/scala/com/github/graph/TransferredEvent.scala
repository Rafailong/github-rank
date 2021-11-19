package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TransferredEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[TransferredEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[TransferredEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The repository this came from
    */
  def fromRepository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[TransferredEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("fromRepository", OptionOf(Obj(innerSelection)))
  def id: SelectionBuilder[TransferredEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the issue associated with the event.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[TransferredEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("issue", Obj(innerSelection))
}

