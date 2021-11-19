package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object HeadRefDeletedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[HeadRefDeletedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[HeadRefDeletedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the Ref associated with the `head_ref_deleted` event.
    */
  def headRef[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[HeadRefDeletedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("headRef", OptionOf(Obj(innerSelection)))

  /** Identifies the name of the Ref associated with the `head_ref_deleted` event.
    */
  def headRefName: SelectionBuilder[HeadRefDeletedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("headRefName", Scalar())
  def id: SelectionBuilder[HeadRefDeletedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[HeadRefDeletedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

