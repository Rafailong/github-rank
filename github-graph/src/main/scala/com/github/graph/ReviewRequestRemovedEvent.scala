package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReviewRequestRemovedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ReviewRequestRemovedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[ReviewRequestRemovedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[ReviewRequestRemovedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[ReviewRequestRemovedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** Identifies the reviewer whose review request was removed.
    */
  def requestedReviewer[A](
    onMannequin: SelectionBuilder[Mannequin, A],
    onTeam: SelectionBuilder[Team, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[ReviewRequestRemovedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("requestedReviewer", OptionOf(ChoiceOf(Map("Mannequin" -> Obj(onMannequin), "Team" -> Obj(onTeam), "User" -> Obj(onUser)))))

  /** Identifies the reviewer whose review request was removed.
    */
  def requestedReviewerOption[A](
    onMannequin: Option[SelectionBuilder[Mannequin, A]] = None,
    onTeam: Option[SelectionBuilder[Team, A]]           = None,
    onUser: Option[SelectionBuilder[User, A]]           = None
  ): SelectionBuilder[ReviewRequestRemovedEvent, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "requestedReviewer",
    OptionOf(
      ChoiceOf(
        Map(
          "Mannequin" -> onMannequin.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Team"      -> onTeam.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"      -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

