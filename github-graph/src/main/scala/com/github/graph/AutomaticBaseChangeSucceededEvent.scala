package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AutomaticBaseChangeSucceededEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[AutomaticBaseChangeSucceededEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[AutomaticBaseChangeSucceededEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[AutomaticBaseChangeSucceededEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The new base for this PR
    */
  def newBase: SelectionBuilder[AutomaticBaseChangeSucceededEvent, String] = _root_.caliban.client.SelectionBuilder.Field("newBase", Scalar())

  /** The old base for this PR
    */
  def oldBase: SelectionBuilder[AutomaticBaseChangeSucceededEvent, String] = _root_.caliban.client.SelectionBuilder.Field("oldBase", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[AutomaticBaseChangeSucceededEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

