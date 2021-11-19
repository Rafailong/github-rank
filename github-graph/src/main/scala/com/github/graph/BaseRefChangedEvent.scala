package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object BaseRefChangedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[BaseRefChangedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[BaseRefChangedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the name of the base ref for the pull request after it was changed.
    */
  def currentRefName: SelectionBuilder[BaseRefChangedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("currentRefName", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[BaseRefChangedEvent, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[BaseRefChangedEvent, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the name of the base ref for the pull request before it was changed.
    */
  def previousRefName: SelectionBuilder[BaseRefChangedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("previousRefName", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[BaseRefChangedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

