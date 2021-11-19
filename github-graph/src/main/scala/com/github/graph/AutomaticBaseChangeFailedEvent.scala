package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AutomaticBaseChangeFailedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[AutomaticBaseChangeFailedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[AutomaticBaseChangeFailedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[AutomaticBaseChangeFailedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The new base for this PR
    */
  def newBase: SelectionBuilder[AutomaticBaseChangeFailedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("newBase", Scalar())

  /** The old base for this PR
    */
  def oldBase: SelectionBuilder[AutomaticBaseChangeFailedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("oldBase", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[AutomaticBaseChangeFailedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

