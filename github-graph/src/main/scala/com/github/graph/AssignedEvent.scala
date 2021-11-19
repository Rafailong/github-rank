package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AssignedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[AssignedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the assignable associated with the event.
    */
  def assignable[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[AssignedEvent, A] = _root_.caliban.client.SelectionBuilder
    .Field("assignable", ChoiceOf(Map("Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** Identifies the user or mannequin that was assigned.
    */
  def assignee[A](
    onBot: SelectionBuilder[Bot, A],
    onMannequin: SelectionBuilder[Mannequin, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[AssignedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "assignee",
    OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Mannequin" -> Obj(onMannequin), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser))))
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[AssignedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[AssignedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the user who was assigned.
    */
  @deprecated("Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.", "")
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[AssignedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))

  /** Identifies the user or mannequin that was assigned.
    */
  def assigneeOption[A](
    onBot: Option[SelectionBuilder[Bot, A]]                   = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]       = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[AssignedEvent, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "assignee",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"          -> onBot.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Mannequin"    -> onMannequin.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"         -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

